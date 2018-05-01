
package controller;

import come342.Database;
import helper.Utils;
import model.Grade;
import model.GradeRate;
import java.time.LocalDate;

public class ChangeRateForGrade {
    private static final ChangeRateForGrade instance = new ChangeRateForGrade();
    public static ChangeRateForGrade getInstance() {
        return instance;
    }
    
    private ChangeRateForGrade(){
    }
    
    public void init(Grade grade){
        this.changeRate(grade);
    }
    
    public void run(){
        this.getGrades();
        this.selectGrade();
    }
    
    public void getGrades() {
 	Utils.println("Select a grade to add a new rate:");
        for(int i=1;i<=Database.gradeList.size();i++){   
            Utils.print(i + ". ");
            Utils.print(Database.gradeList.get(i-1).getName());
            Utils.print("\n");        
            }
	Utils.println("Selection: ");        
    }
    
    public void selectGrade() {
  	int choice = Utils.scanInt();
  	Grade selectedGrade = Database.gradeList.get(choice - 1);
        this.changeRate(selectedGrade);
    }
    
    public void changeRate(Grade grade) {
        Utils.println("Enter new rate of the grade: ");
        double rate = Utils.scanDouble();
        Utils.println("Enter start date of the rate in format YYYY MM DD: ");
        int year = Utils.scanInt();
        int month = Utils.scanInt();
        int day = Utils.scanInt();
        LocalDate startDate = LocalDate.of(year, month, day);
        
        GradeRate gradeRate = new GradeRate(rate, startDate);
        grade.setRate(gradeRate);
        
        Utils.println("Grade rate updated succesfully.");
    }    
}
