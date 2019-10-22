package com.dzkj.pojo;

public class Userss {
	private Integer u_id;
	private String u_name;
	private String pwd;
	public Integer getU_id() {
		return u_id;
	}
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Userss [u_id=" + u_id + ", u_name=" + u_name + ", pwd=" + pwd + "]";
	}
	
}
