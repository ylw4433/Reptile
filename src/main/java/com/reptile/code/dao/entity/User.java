package com.reptile.code.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String userid;

    private String username;

    private String password;

    private String sex;

    private Date birthday;

    private String phone;

    private String email;

    private String identitycard;

    private String state;

    private Date creatdata;

    private Date updata;

    private String reverse1;

    private String reverse2;

    private String reverse3;

    private static final long serialVersionUID = 1L;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getIdentitycard() {
        return identitycard;
    }

    public void setIdentitycard(String identitycard) {
        this.identitycard = identitycard == null ? null : identitycard.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getCreatdata() {
        return creatdata;
    }

    public void setCreatdata(Date creatdata) {
        this.creatdata = creatdata;
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

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", sex=" + sex
				+ ", birthday=" + birthday + ", phone=" + phone + ", email=" + email + ", identitycard=" + identitycard
				+ ", state=" + state + ", creatdata=" + creatdata + ", updata=" + updata + ", reverse1=" + reverse1
				+ ", reverse2=" + reverse2 + ", reverse3=" + reverse3 + "]";
	}
    
}