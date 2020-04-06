package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customers {
    @Id
    private int cid;
    private String cname;
    private String cemail;

    @Override
	public String toString() {
		return "CourseWebAppApplication [cid=" + cid + ", cname=" + cname + ", cemail=" + cemail + "]";
	}

    public int getCid() {
        return this.cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return this.cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCemail() {
        return this.cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail;
    }


}