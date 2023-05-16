package project.signupAndLogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
@Validated
@EnableEncryptableProperties
@SpringBootApplication
public class SignupAndLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SignupAndLoginApplication.class, args);
	}

}
