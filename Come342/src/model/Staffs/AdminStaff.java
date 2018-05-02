package model.Staffs;

import java.time.LocalDate;
import model.StaffMember;

public class AdminStaff extends StaffMember {
        public AdminStaff(int staffNo, String staffName, LocalDate staffStartDate, String staffEmail){
        super.setStaffNo(staffNo);
        super.setStaffName(staffName);
        super.setStartDate(staffStartDate);
        super.setStaffEmail(staffEmail);
    }
}