/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studentdb.model;
import java.util.Date;
/**
 *
 * @author Admin
 */
public class Course {
    private int courseid;
    private String coursename;
    private Date daystart;
    private Date dayend;
    private boolean status;

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCourse_name(String coursename) {
        this.coursename = coursename;
    }

    public Date getDaystart() {
        return daystart;
    }

    public void setDay_start(Date daystart) {
        this.daystart = daystart;
    }

    public Date getDay_end() {
        return dayend;
    }

    public void setDay_end(Date day_end) {
        this.dayend = dayend;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    
}
