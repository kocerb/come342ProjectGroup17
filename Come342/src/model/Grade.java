package model;

public class Grade {
    private String gradeName;
    public GradeRate gradeRate;
  
    public Grade(String gradeName){
    	this.setName(gradeName);
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
}
