package com.reptile.code.entity;

import java.io.Serializable;
import java.util.Date;

public class DataInfo implements Serializable {
    private String issueid;

    private String userid;

    private String issueclassify;

    private String issueheadline;

    private String issuedescribe;

    private Date startdata;

    private Date updata;

    private String state;

    private String issuerank;

    private String reverse1;

    private String reverse2;

    private String reverse3;

    private static final long serialVersionUID = 1L;

    public String getIssueid() {
        return issueid;
    }

    public void setIssueid(String issueid) {
        this.issueid = issueid == null ? null : issueid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getIssueclassify() {
        return issueclassify;
    }

    public void setIssueclassify(String issueclassify) {
        this.issueclassify = issueclassify == null ? null : issueclassify.trim();
    }

    public String getIssueheadline() {
        return issueheadline;
    }

    public void setIssueheadline(String issueheadline) {
        this.issueheadline = issueheadline == null ? null : issueheadline.trim();
    }

    public String getIssuedescribe() {
        return issuedescribe;
    }

    public void setIssuedescribe(String issuedescribe) {
        this.issuedescribe = issuedescribe == null ? null : issuedescribe.trim();
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getIssuerank() {
        return issuerank;
    }

    public void setIssuerank(String issuerank) {
        this.issuerank = issuerank == null ? null : issuerank.trim();
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