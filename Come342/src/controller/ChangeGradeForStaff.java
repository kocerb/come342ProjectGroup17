/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author burakkocer
 */
public class ChangeGradeForStaff {
    private static final ChangeGradeForStaff instance = new ChangeGradeForStaff();
    public static ChangeGradeForStaff getInstance() {
        return instance;
    }
    
    private ChangeGradeForStaff(){
    }
}
