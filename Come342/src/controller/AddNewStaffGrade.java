
package controller;

import helper.Utils;
import come342.Database;
import model.StaffMember;
import model.Grade;
import model.GradeRate;

public class AddNewStaffGrade {
    private static final AddNewStaffGrade instance = new AddNewStaffGrade();
    public static AddNewStaffGrade getInstance() {
        return instance;
    }
    
    private AddNewStaffGrade(){
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
    
    private void selectClient() {
  	int choice = Utils.scanInt();
  	StaffMember selectedStaff = Database.staffList.get(choice - 1);
	this.addNewGrade(selectedStaff);
	}
    
    private void addNewGrade(StaffMember selectedStaff) {
        Utils.println("Enter name of the grade: ");
        String name = Utils.scanString();
        Utils.println("Enter rate of the grade: ");
        double rate = Utils.scanDouble();
        Utils.println("Enter start date of the grade: ");
        String startDate = Utils.scanString();
        
        GradeRate gradeRate = new GradeRate(rate, startDate);
        Grade grade = new Grade(name, gradeRate);
        
        selectedStaff.addNewGrade(grade);
        
        Utils.println("Grade added succesfully.");
    }
}
