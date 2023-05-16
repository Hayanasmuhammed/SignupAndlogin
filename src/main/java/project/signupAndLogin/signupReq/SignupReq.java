package project.signupAndLogin.signupReq;



import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class SignupReq {
	@NotBlank(message="enter first name")
	private String fname;
	@NotBlank(message="enter last name")
	private String lname;
	@NotBlank(message="enter email")
	@Email(message="enter a valid email")
	private String email;
	@Pattern (regexp="^(?=.*[0-9])[a-zA-Z0-9].{6,15}$",message="password contain atleast one digit and minimum 6 alphabets")
	@NotBlank(message="enter password")
	private String password;
	public SignupReq() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SignupReq(@NotBlank(message = "enter first name") String fname,
			@NotBlank(message = "enter last name") String lname, @Email(message = "enter a valid email") String email,
			@Pattern(regexp ="^(?=.*[0-9])[a-zA-Z0-9].{6,15}$", message = "password contain atleast one digit and minimum 6 alphabets") String password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
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
	@Override
	public String toString() {
		return "SignupReq [fname=" + fname + ", lname=" + lname + ", email=" + email + ", password=" + password + "]";
	}
	
	
	

}
