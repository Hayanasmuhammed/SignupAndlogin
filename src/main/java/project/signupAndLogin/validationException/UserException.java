package project.signupAndLogin.validationException;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;

public class UserException {
          public void setMessage(String message) {
		this.message = message;
	}
	
	public void setHttpstatus(HttpStatus httpstatus) {
		this.httpstatus = httpstatus;
	}
	public void setTimestamp(ZonedDateTime timestamp) {
		this.timestamp = timestamp;
	}
		public String getMessage() {
		return message;
	}
	
	
	public HttpStatus getHttpstatus() {
		return httpstatus;
	}
	public ZonedDateTime getTimestamp() {
		return timestamp;
	}
		 private String message;
         
          private HttpStatus httpstatus;
          private ZonedDateTime timestamp;
		public UserException() {
			super();
			// TODO Auto-generated constructor stub
		}
		public UserException(String message, HttpStatus httpstatus, ZonedDateTime timestamp) {
			super();
			this.message = message;
			
			this.httpstatus = httpstatus;
			this.timestamp = timestamp;
		}
		
          
}
