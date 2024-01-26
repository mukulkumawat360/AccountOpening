package com.mkbk.AccountOpening.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerClass {

	
	@ExceptionHandler(value=UserNotFoundException.class)
	public ResponseEntity<Object> usernotfoundMethod(UserNotFoundException unf){
		
		
		return new ResponseEntity<>("User Does Not Exists",HttpStatus.NOT_FOUND);
	}
}
