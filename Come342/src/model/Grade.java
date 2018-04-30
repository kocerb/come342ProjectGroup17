package model;

import model.GradeRate;

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
        return this.gradeRate.getRateStartDate();
    }

    public String getRateFinishDate(){
        return this.gradeRate.getRateFinishDate();
    }
}
