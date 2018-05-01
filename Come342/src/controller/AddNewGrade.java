
package controller;

import helper.Utils;
import come342.Database;
import model.Grade;
import model.GradeRate;

public class AddNewGrade {
    private static final AddNewGrade instance = new AddNewGrade();
    public static AddNewGrade getInstance() {
        return instance;
    }
    
    private AddNewGrade(){
    }
    
    public void init (){
        this.createNewGrade();
    }
  
    private void createNewGrade() {
        Utils.println("Enter name of the grade: ");
        String name = Utils.scanString();
        Utils.println("Enter rate of the grade: ");
        double rate = Utils.scanDouble();
        Utils.println("Enter start date of the rate: ");
        String startDate = Utils.scanString();
        
        GradeRate gradeRate = new GradeRate(rate, startDate);
        Grade grade = new Grade(name, gradeRate);
        
        Database.gradeList.add(grade);
        
        Utils.println("Grade created succesfully.");
    }
}
