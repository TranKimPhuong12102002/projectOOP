/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studentdb.model;

import java.io.Serializable;

public class Teacher implements Serializable{
    private String teacherid;
    private String firstname;
    private String surname;
    private String address;
    private String gender;
    private String mobile;
    private String email;
    private String status;

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Teacher(String teacherid, String firstname, String surname, String address, String gender, String mobile, String email, String status) {
        this.teacherid = teacherid;
        this.firstname = firstname;
        this.surname = surname;
        this.address = address;
        this.gender = gender;
        this.mobile = mobile;
        this.email = email;
        this.status = status;
    }
    

    @Override
    public String toString() {
       return "StudentID: "+teacherid+"\n" + "Firstname: "+firstname+"\n" +"Surname: "+surname+"\n"+ "Address: "+address+"\n"+ "Gender: "+gender+"\n"
                +"mobile: "+mobile+"\n"+"Email: "+email+"\n"+"Status: "+ status;
    }
}
