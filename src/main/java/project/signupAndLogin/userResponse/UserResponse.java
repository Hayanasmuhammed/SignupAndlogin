package project.signupAndLogin.userResponse;

public class UserResponse {
      private String response;

	public UserResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserResponse(String response) {
		super();
		this.response = response;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "UserResponse [response=" + response + "]";
	}
      
}
