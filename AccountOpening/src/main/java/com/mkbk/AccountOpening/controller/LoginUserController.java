package com.mkbk.AccountOpening.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mkbk.AccountOpening.Exceptions.UserAlreadyExists;
import com.mkbk.AccountOpening.Repository.AccountRepository;
import com.mkbk.AccountOpening.configuration.MkbkDataManagement;
import com.mkbk.AccountOpening.model.LoginCredentials;
import com.mkbk.AccountOpening.model.LoginUserMaker;
import com.mkbk.AccountOpening.services.LoginValidation;

@RestController
@RequestMapping(value="/login/")
public class LoginUserController {
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private LoginValidation loginValidation;
	
	@Autowired 
	MkbkDataManagement userdata;	
	
	@RequestMapping(value="/validateCredentials",
			method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<String> ValidatelogInCredentials(
				@RequestBody LoginCredentials lgnCred) {
		String result=loginValidation.userLoginValidation(lgnCred)=="Y"?"Y":"N";
		return ResponseEntity.status(HttpStatus.CREATED).body(result);
		}
	
	@RequestMapping(value="/loginCredentials",
			method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<List<LoginUserMaker>> logInCredentials() {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(accountRepository.dataOfLoginCredentials());
		}
	
	@RequestMapping(value="/crtlgncred",
			method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<String> createLogin(@RequestBody LoginUserMaker lum) throws JsonProcessingException {
		
		if(userdata.UserDataReader(lum.getEmail(),"NewUserdata.properties")) {
			return (ResponseEntity<String>) ResponseEntity.status(HttpStatus.CREATED).body("Exists");
		}
		System.out.println("LoginUserMaker::"+lum);
		List<LoginUserMaker> response =accountRepository.addLoginCredentais(lum);
		LoginCredentials returnCred= new LoginCredentials(lum.getSrno(),lum.getEmail().toString(),lum.getPassword());
		return  (ResponseEntity<String>) ResponseEntity.status(HttpStatus.CREATED).body("New");
	}

	private boolean isEmpty(String string) {
		// TODO Auto-generated method stub
		return false;
	}

}
