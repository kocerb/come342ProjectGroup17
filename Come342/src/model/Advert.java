package model;

import java.time.LocalDate;

abstract public class Advert {
    private String advertTitle;
    private LocalDate targetCompletionDate;
    private double estimatedAdvertCost;
    private double actualAdvertCost;

    public Advert() {}
    
    public void setAdvertTitle(String title){
        this.advertTitle = title;
    }
    public void setTargetCompletionDate(LocalDate date){
        this.targetCompletionDate = date;
    }
    public void setEstimatedAdvertCost(Double cost){
        this.estimatedAdvertCost = cost;
    }
    public void setActualAdvertCost(Double cost){
        this.actualAdvertCost = cost;
    }
    public String getAdvertTitle(){
        return this.advertTitle;
    }
    public LocalDate getTargetCompletionDate(){
        return this.targetCompletionDate;
    }
    public Double getEstimatedAdvertCost(){
        return this.estimatedAdvertCost;
    }
    public Double getActualAdvertCost(){
        return this.actualAdvertCost;
    }
}
