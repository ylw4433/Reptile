package com.reptile.code.entity;

import java.io.Serializable;
import java.util.Date;

public class ClassifyInfo implements Serializable {
    private String classifyid;

    private String userid;

    private String classifyname;

    private String start;

    private Date startdata;

    private Date updata;

    private String reverse1;

    private String reverse2;

    private String reverse3;

    private static final long serialVersionUID = 1L;

    public String getClassifyid() {
        return classifyid;
    }

    public void setClassifyid(String classifyid) {
        this.classifyid = classifyid == null ? null : classifyid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getClassifyname() {
        return classifyname;
    }

    public void setClassifyname(String classifyname) {
        this.classifyname = classifyname == null ? null : classifyname.trim();
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start == null ? null : start.trim();
    }

    public Date getStartdata() {
        return startdata;
    }

    public void setStartdata(Date startdata) {
        this.startdata = startdata;
    }

    public Date getUpdata() {
        return updata;
    }

    public void setUpdata(Date updata) {
        this.updata = updata;
    }

    public String getReverse1() {
        return reverse1;
    }

    public void setReverse1(String reverse1) {
        this.reverse1 = reverse1 == null ? null : reverse1.trim();
    }

    public String getReverse2() {
        return reverse2;
    }

    public void setReverse2(String reverse2) {
        this.reverse2 = reverse2 == null ? null : reverse2.trim();
    }

    public String getReverse3() {
        return reverse3;
    }

    public void setReverse3(String reverse3) {
        this.reverse3 = reverse3 == null ? null : reverse3.trim();
    }
}