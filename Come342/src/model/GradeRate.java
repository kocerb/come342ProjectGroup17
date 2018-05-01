package model;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class GradeRate {
    private double rate;
    private LocalDate rateStartDate;
    private LocalDate rateFinishDate;
    private List<GradeRate> pastRates = new ArrayList<GradeRate>();
  
    public GradeRate(double rate, LocalDate startDate){
        this.setRate(rate);
        this.setStartDate(startDate);
    }

    public void setRate(double rate){
        this.rate = rate;
    }

    public void setStartDate(LocalDate startDate){
        this.rateStartDate = startDate;
    }
    
    public void setFinishDate(LocalDate finishDate){
        this.rateFinishDate = finishDate;
    }

    public double getRate(){
        return this.rate;
    }

    public LocalDate getStartDate(){
        return this.rateStartDate;
    }

    public LocalDate getFinishDate(){
        return this.rateFinishDate;
    }
    
    public void assignLatestRate(double rate){
        LocalDate today = LocalDate.now();
        rateFinishDate = today.minusDays(1);
        pastRates.add(this);
        this.rate = rate;
        this.rateStartDate = today;
        this.rateFinishDate = null;
    }
    
    public void assignLatestRate(double rate, LocalDate startDate){
        rateFinishDate = startDate.minusDays(1);
        pastRates.add(this);
        this.rate = rate;
        this.rateStartDate = startDate;
        this.rateFinishDate = null;
    }
}
