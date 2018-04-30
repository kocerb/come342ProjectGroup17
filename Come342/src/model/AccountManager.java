/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author burakkocer
 */
public class AccountManager extends StaffMember {
        public AccountManager(int staffNo, String staffName, String staffStartDate, String staffEmail){
        super.setStaffNo(staffNo);
        super.setStaffName(staffName);
        super.setStartDate(staffStartDate);
        super.setStaffEmail(staffEmail);
    }
}
