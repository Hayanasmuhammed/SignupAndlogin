package project.signupAndLogin.signupReq;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class LoginReq {
	
	@Email(message="enter valid email")
	private String email;
	@NotBlank(message="enter password")
	private String password;
	public LoginReq() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginReq(@Email(message = "enter valid email") String email,
			@NotBlank(message = "enter password") String password) {
		super();
		this.email = email;
		this.password = password;
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
	@Override
	public String toString() {
		return "LoginReq [email=" + email + ", password=" + password + "]";
	}
	

}
