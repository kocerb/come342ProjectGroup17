package model;

import java.util.ArrayList;
import java.util.List;
import model.GradeRate;

public class Grade {
    private String gradeName;
    private GradeRate gradeRate;
    private List<GradeRate> pastGradeRates = new ArrayList<GradeRate>();
  
    public Grade(String gradeName, GradeRate gradeRate){
    	this.setName(gradeName);
        this.setRate(gradeRate);
    }

    public void setRate(GradeRate rate){
        this.gradeRate = rate;
    }
    
    public void changeRate(GradeRate rate){
        this.gradeRate.setFinishDate(rate.getStartDate());
        this.pastGradeRates.add(this.gradeRate);
        this.gradeRate = rate;
    }

    public void setName(String name){
        this.gradeName = name;
    }

    public String getName(){
        return this.gradeName;
    }

    public double getGradeRate(){
        return this.gradeRate.getRate();
    }

    public String getRateStartDate(){
        return this.gradeRate.getStartDate();
    }

    public String getRateFinishDate(){
        return this.gradeRate.getFinishDate();
    }
}
