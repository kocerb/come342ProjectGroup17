package model;

import java.model.GradeRate;

public class Grade {
    private String gradeName;
    private GradeRate gradeRate;
  
    public Grade(String gradeName, GradeRate gradeRate){
    	this.setName(gradeName);
        this.setRate(gradeRate);
    }

    public void setRate(GradeRate rate){
        this.gradeRate = rate;
    }

    public void setName(name){
        this.gradeName = name;
    }

    public String getName(){
        return this.gradeName;
    }

    public String getGradeRate(){
        return this.gradeRate.rate;
    }

    public String getRateStartDate(){
        return this.gradeRate.rateStartDate;
    }

    public String getRateFinishDate(){
        return this.gradeRate.rateFinishDate;
    }
}
