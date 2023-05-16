package project.signupAndLogin.model;

import java.time.LocalDateTime;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class UserSignup {
	@Id
	private String id;
	private String fname;
	private String lname;
	private String  email;
	private String password;
	private LocalDateTime signupTime;
	private LocalDateTime delete;
	public UserSignup() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserSignup(String id, String fname, String lname, String email, String password, LocalDateTime signupTime,
			LocalDateTime delete) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.signupTime = signupTime;
		this.delete = delete;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDateTime getSignupTime() {
		return signupTime;
	}
	public void setSignupTime(LocalDateTime signupTime) {
		this.signupTime = signupTime;
	}
	public LocalDateTime getDelete() {
		return delete;
	}
	public void setDelete(LocalDateTime delete) {
		this.delete = delete;
	}
	@Override
	public String toString() {
		return "UserSignup [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", password="
				+ (password) + ", signupTime=" + signupTime + ", delete=" + delete + "]";
	}
	
	

}
