package project.signupAndLogin.validationException;




public class UserNotFoundException extends RuntimeException {

	


	public UserNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public UserNotFoundException(String message,Throwable cause) {
		super(message,cause);
	}


	

}
