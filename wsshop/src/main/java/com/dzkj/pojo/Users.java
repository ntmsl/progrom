package com.dzkj.pojo;

public class Users {
	private Integer userid;
	private String uname;
	private String uzname;
	private String usex;
	private String birthday;
	private String tellphone;
	private String email;
	private String pwd;
	private String time;
	private String paypwd;
	private String imgurl;
	private Integer recharge;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUzname() {
		return uzname;
	}
	public void setUzname(String uzname) {
		this.uzname = uzname;
	}
	public String getUsex() {
		return usex;
	}
	public void setUsex(String usex) {
		this.usex = usex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getTellphone() {
		return tellphone;
	}
	public void setTellphone(String tellphone) {
		this.tellphone = tellphone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPaypwd() {
		return paypwd;
	}
	public void setPaypwd(String paypwd) {
		this.paypwd = paypwd;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public Integer getRecharge() {
		return recharge;
	}
	public void setRecharge(Integer recharge) {
		this.recharge = recharge;
	}
	@Override
	public String toString() {
		return "Users [userid=" + userid + ", uname=" + uname + ", uzname=" + uzname + ", usex=" + usex + ", birthday="
				+ birthday + ", tellphone=" + tellphone + ", email=" + email + ", pwd=" + pwd + ", time=" + time
				+ ", paypwd=" + paypwd + ", imgurl=" + imgurl + ", recharge=" + recharge + "]";
	}
	
	
}
