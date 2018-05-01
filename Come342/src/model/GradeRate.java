package model;

public class GradeRate {
    private double rate;
    private String rateStartDate;
    private String rateFinishDate;
  
    public GradeRate(double rate, String startDate){
        this.setRate(rate);
        this.setStartDate(startDate);
    }

    public void setRate(double rate){
        this.rate = rate;
    }

    public void setStartDate(String startDate){
        this.rateStartDate = startDate;
    }
    
    public void setFinishDate(String finishDate){
        this.rateFinishDate = finishDate;
    }

    public double getRate(){
        return this.rate;
    }

    public String getStartDate(){
        return this.rateStartDate;
    }

    public String getFinishDate(){
        return this.rateFinishDate;
    }
}
