package project.signupAndLogin.validationException;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class CustomhandlerException extends ResponseEntityExceptionHandler {




@Override
protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
		HttpHeaders headers, HttpStatusCode status, WebRequest request) {
	System.out.println("gvdhg");
//	return super.handleMethodArgumentNotValid( headers, status, request);
	Map<String, Object> body = new LinkedHashMap<>();
	body.put("timestamp", new Date());
	body.put("status", status.value());

	// Get all errors
	List<String> errors = ex.getBindingResult().getFieldErrors().stream().map(x -> x.getDefaultMessage())
			.collect(Collectors.toList());

	body.put("errors", errors);

	return new ResponseEntity<>(body, headers, status);      
}




@ExceptionHandler(value= {UserNotFoundException.class})
public ResponseEntity<Object> handleBusinessException (UserNotFoundException ex){
	HttpStatus badRequest =HttpStatus.BAD_REQUEST;
	UserException userException = new UserException(ex.getMessage(),
			
			badRequest,
			ZonedDateTime.now()
			);

	return new ResponseEntity<>(userException,badRequest);
}
}