package com.model;

public class MemberDTO {
	
	private String email;
	private String pw;
	private String tel;
	private String addr;
	
	public MemberDTO(String email, String pw, String tel, String addr) {
		super();
		this.email = email;
		this.pw = pw;
		this.tel = tel;
		this.addr = addr;
	}
	public MemberDTO(String email, String pw) {
		super();
		this.email = email;
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	

}
