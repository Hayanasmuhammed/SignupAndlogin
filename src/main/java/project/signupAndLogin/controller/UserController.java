package project.signupAndLogin.controller;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import project.signupAndLogin.validationException.UserNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import project.signupAndLogin.service.UserService;
import project.signupAndLogin.signupReq.LoginReq;
import project.signupAndLogin.signupReq.SignupReq;
import project.signupAndLogin.userResponse.SignupResponse;
import project.signupAndLogin.userResponse.UserResponse;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/signup")
	public SignupResponse signupUser(@Valid @RequestBody SignupReq req) throws UserNotFoundException {

		SignupResponse res=userService.signupUser(req);
		return res;

	}

	@GetMapping("/viewall")
	public List<SignupResponse> findAllUsers() {
		List<SignupResponse> res = userService.findAllUsers();
		return res;
	}

	@PostMapping("/login")
	public SignupResponse loginUser(@Valid @RequestBody LoginReq req) throws UserNotFoundException {

		SignupResponse res=userService.loginUser(req);
		return res;
	}

}
