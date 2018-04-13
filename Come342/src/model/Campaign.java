import java.util.ArrayList;
import java.util.List;

package model;

public class Campaign {
    private String title;
    private String startDate;
    private String finishDate;
    private Double estimatedCost;
  
    public Campaign(title, startDate, finishDate, estimatedCost){
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
}
