
package model;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class StaffGrade {
    private LocalDate gradeStartDate;
    private LocalDate gradeFinishDate;
    private Grade staffGrade;    
    private List<StaffGrade> pastGrades = new ArrayList<StaffGrade>();
    
    public StaffGrade(Grade grade, LocalDate startDate){
        this.staffGrade = grade;
        this.gradeStartDate = startDate;
    }
    
    public List<StaffGrade> getStaffGrades() {
        return pastGrades;
    }
    
    public void assignLatestGrade(Grade grade){
        LocalDate today = LocalDate.now();
        gradeFinishDate = today.minusDays(1);
        pastGrades.add(this);
        this.staffGrade = grade;
        this.gradeStartDate = today;
        this.gradeFinishDate = null;
    }
}
