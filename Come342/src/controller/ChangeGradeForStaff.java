
package controller;

import come342.Database;
import helper.Utils;
import model.StaffMember;
import model.Grade;
//import model.StaffGrade;

public class ChangeGradeForStaff {
    private static final ChangeGradeForStaff instance = new ChangeGradeForStaff();
    private static StaffMember selectedStaff;
    private static Grade selectedGrade;
    
    public static ChangeGradeForStaff getInstance() {
        return instance;
    }
    
    private ChangeGradeForStaff(){
    }
    
    public void run (){
        this.getStaffs();
        this.selectStaff();
        this.getGrades();
        this.selectGrade();
        this.changeGrade();
    }
    
    private void getStaffs() {
 	Utils.println("Select a staff to add a new grade:");
        for(int i=1;i<=Database.staffList.size();i++){   
            Utils.print(i + ". ");
            Utils.print(Database.staffList.get(i-1).getStaffName());
            Utils.print("\n");        
            }
	Utils.println("Selection: ");
    }
    
    private void selectStaff() {
  	int choice = Utils.scanInt();
  	this.selectedStaff = Database.staffList.get(choice - 1);
    }
    
    private void getGrades() {
 	Utils.println("Select a grade to add to staff:");
        for(int i=1;i<=Database.gradeList.size();i++){   
            Utils.print(i + ". ");
            Utils.print(Database.gradeList.get(i-1).getName());
            Utils.print("\n");        
            }
	Utils.println("Selection: ");
    }
    
    private void selectGrade() {        
  	int choice = Utils.scanInt();
  	this.selectedGrade = Database.gradeList.get(choice - 1);
    }
    
    private void changeGrade() {
        selectedStaff.staffGrade.assignLatestGrade(selectedGrade);
    }

}
