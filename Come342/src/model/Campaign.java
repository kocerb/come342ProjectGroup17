package model;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Campaign {
    private String title;
    private LocalDate startDate;
    private LocalDate finishDate;
    private Double estimatedCost;
    private List<StaffMember> StaffList = new ArrayList<StaffMember>();
  
    public Campaign(String title, LocalDate startDate, LocalDate finishDate, Double estimatedCost){
    	this.setTitle(title);
    	this.setDate(startDate, finishDate);
    	this.setEstimatedCost(estimatedCost);
    }

    public void setTitle(String ctitle){
        this.title=ctitle;
    }

    public void setDate(LocalDate sDate, LocalDate fDate){
        this.startDate=sDate;
        this.finishDate=fDate;
    }

    public void setEstimatedCost(Double eCost){
        this.estimatedCost=eCost;
    }

    public String getTitle(){
        return this.title;
    }

    public LocalDate getStartDate(){
        return this.startDate;
    }

    public LocalDate getFinishDate(){
        return this.finishDate;
    }

    public Double getEstimatedCost(){
        return this.estimatedCost;
    }
    public void assignStaff(StaffMember staff) {
        this.StaffList.add(staff);
    }
    
    public List<StaffMember> getStaffList(){
        return this.StaffList;
    }
}
