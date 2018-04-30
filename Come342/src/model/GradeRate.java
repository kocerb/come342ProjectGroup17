package model;

public class GradeRate {
    private double rate;
    private String rateStartDate;
    private String rateFinishDate;
  
    public GradeRate(double rate, String startDate, String finishDate){
        this.setRate(rate);
        this.setDate(startDate, finishDate);
    }

    public void setRate(double rate){
        this.rate = rate;
    }

    public void setDate(String startDate, String finishDate){
        this.rateStartDate = startDate;
        this.rateFinishDate = finishDate;
    }

    public double getRate(){
        return this.rate;
    }

    public String getRateStartDate(){
        return this.rateStartDate;
    }

    public String getRateFinishDate(){
        return this.rateFinishDate;
    }
}
