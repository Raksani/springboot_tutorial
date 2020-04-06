package com.example.dependencydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    private int custid;
    private String custname;
    private String coursename;
    @Autowired
    private Technologies techdetail;

    public Technologies getTechdetail(){
        return techdetail;
    }

    public int getCustid() {
        return this.custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public String getCustname() {
        return this.custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getCoursename() {
        return this.coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public void display() {
        System.out.println("Customer's object returned successfully");
        techdetail.tech();
    }

}