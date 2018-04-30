
package model;

import model.Grade;
import java.util.ArrayList;
import java.util.List;
import come342.Database;

abstract public class StaffMember {
    private int staffNo;
    private String staffName;
    private String staffStartDate;
    private String staffEmail;
    private List<Grade> grades = new ArrayList<Grade>();
    
    public StaffMember() {

    }
        public void setStaffNo(int staffNo){
            this.staffNo=staffNo;
        }
        public void setStaffName(String staffName){
            this.staffName=staffName;
        }
        public void setStartDate(String startDate){
            this.staffStartDate=startDate;
        }
        public void setStaffEmail(String staffEmail){
            this.staffEmail=staffEmail;
        }
        public int getStaffNo(){
            return this.staffNo;
        }
        public String getStaffName(){
            return this.staffName;
        }
        public String getStaffStartDate(){
            return this.staffStartDate;
        }
        public String getStaffEmail(){
            return this.staffEmail;
        }
        
        public void addNewGrade(Grade grade) {
            this.grades.add(grade);
            Database.gradeList.add(grade);
        }

}