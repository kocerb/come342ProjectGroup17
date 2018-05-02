package model;

import java.time.LocalDate;

abstract public class StaffMember {
    private int staffNo;
    private String staffName;
    private LocalDate staffStartDate;
    private String staffEmail;
    public StaffGrade staffGrade;
    
    public StaffMember() {

    }
    
    public void setStaffNo(int staffNo){
        this.staffNo=staffNo;
    }
    public void setStaffName(String staffName){
        this.staffName=staffName;
    }
    public void setStartDate(LocalDate startDate){
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
    public LocalDate getStaffStartDate(){
        return this.staffStartDate;
    }
    public String getStaffEmail(){
        return this.staffEmail;
    }
    
    public void setStaffGrade(StaffGrade staffGrade){
        this.staffGrade = staffGrade;
    }

}