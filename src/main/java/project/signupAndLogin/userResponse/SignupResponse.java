package project.signupAndLogin.userResponse;

import java.time.LocalDateTime;

public class SignupResponse {

	private String id;
	private String fname;
	private String lname;
	private String  email;
	private LocalDateTime signupTime;
	public SignupResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SignupResponse(String id, String fname, String lname, String email, 
			LocalDateTime signupTime) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		
		this.signupTime = signupTime;
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
	
	
	public LocalDateTime getSignupTime() {
		return signupTime;
	}
	public void setSignupTime(LocalDateTime signupTime) {
		this.signupTime = signupTime;
	}
	@Override
	public String toString() {
		return "SignupResponse [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", signupTime=" + signupTime + "]";
	}
   
	
}
