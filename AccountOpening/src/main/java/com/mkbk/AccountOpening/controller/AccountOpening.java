package com.mkbk.AccountOpening.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mkbk.AccountOpening.Repository.AccountRepository;
import com.mkbk.AccountOpening.model.LoginCredentials;
import com.mkbk.AccountOpening.model.LoginUserMaker;
import com.mkbk.AccountOpening.model.UserInfo;

@RestController
@RequestMapping(value="services/customers/")
public class AccountOpening {

	
	@Autowired
	private AccountRepository accountRepository;
	
	@GetMapping(value="gtcustomers")
	public List<UserInfo> getCreatedCustomer() {
		return   accountRepository.dataOfuserAll();//"customer data is here  ";
	}
	
	
	@RequestMapping(value="createCustomers",
			method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> createCustm(@RequestBody UserInfo uerinfo ) {
		System.out.println(uerinfo.toString());
		accountRepository.addUser(uerinfo);
		return ResponseEntity.status(HttpStatus.OK).body("user Has Been created");//"created user ";
	 }

	

}
