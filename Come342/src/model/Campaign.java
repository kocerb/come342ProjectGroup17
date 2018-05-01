package model;

//import come342.Database;
import java.util.ArrayList;
import java.util.List;

public class Campaign {
    private String title;
    private String startDate;
    private String finishDate;
    private Double estimatedCost;
    private List<StaffMember> StaffList = new ArrayList<StaffMember>();
  
    public Campaign(String title, String startDate, String finishDate, Double estimatedCost){
    	this.setTitle(title);
    	this.setDate(startDate, finishDate);
    	this.setEstimatedCost(estimatedCost);
    }

    public void setTitle(String ctitle){
        this.title=ctitle;
    }

    public void setDate(String sDate, String fDate){
        this.startDate=sDate;
        this.finishDate=fDate;
    }

    public void setEstimatedCost(Double eCost){
        this.estimatedCost=eCost;
    }

    public String getTitle(){
        return this.title;
    }

    public String getStartDate(){
        return this.startDate;
    }

    public String getFinishDate(){
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
