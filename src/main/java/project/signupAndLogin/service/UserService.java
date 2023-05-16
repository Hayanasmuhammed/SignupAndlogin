package project.signupAndLogin.service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.client.HttpClientErrorException.BadRequest;

import jakarta.validation.Valid;
import project.signupAndLogin.model.UserSignup;
import project.signupAndLogin.repository.UserRepository;
import project.signupAndLogin.signupReq.LoginReq;
import project.signupAndLogin.signupReq.SignupReq;
import project.signupAndLogin.userResponse.SignupResponse;
import project.signupAndLogin.validationException.UserNotFoundException;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public SignupResponse signupUser(SignupReq req) {

		BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
		String encryptedPassword = bcrypt.encode(req.getPassword());
		UserSignup ur = new UserSignup(null, req.getFname(), req.getLname(), req.getEmail(), req.getPassword(),
				LocalDateTime.now(), null);

		Optional<UserSignup> user = userRepo.findByEmail(ur.getEmail());
		if (user.isPresent()) {
			throw new UserNotFoundException("Already registerd");

		} else {
			ur.setPassword(encryptedPassword);

			userRepo.save(ur);
			SignupResponse br = new SignupResponse(ur.getId(), ur.getFname(), ur.getLname(), ur.getEmail(),
					ur.getSignupTime());
			return br;

		}
	}

	public List<SignupResponse> findAllUsers() {
		List<UserSignup> users = userRepo.findAll();
		List<SignupResponse> res = new ArrayList<>();
		Iterator<UserSignup> iterator = users.iterator();
		while (iterator.hasNext()) {
			UserSignup user = (UserSignup) iterator.next();
			SignupResponse br = new SignupResponse(user.getId(), user.getFname(), user.getLname(), user.getEmail(),
					user.getSignupTime());
			res.add(br);
		}
		return res;

	}

	public SignupResponse loginUser(LoginReq req) {
		Optional<UserSignup> ur = userRepo.findByEmail(req.getEmail());
		BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
		if (ur.isPresent()) {
			UserSignup br = ur.get();

			if (bcrypt.matches(req.getPassword(), br.getPassword())) {

				SignupResponse user = new SignupResponse(br.getId(), br.getFname(), br.getLname(), br.getEmail(),
						br.getSignupTime());
				return user;

			} else {
				throw new UserNotFoundException("Invalid combination of email and password");
			}

		} else
			throw new UserNotFoundException("Invalid combination of email and password");

	}
}