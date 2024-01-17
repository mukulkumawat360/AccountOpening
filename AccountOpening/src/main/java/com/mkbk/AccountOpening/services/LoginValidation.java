package com.mkbk.AccountOpening.services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mkbk.AccountOpening.Repository.AccountRepository;
import com.mkbk.AccountOpening.model.LoginCredentials;
import com.mkbk.AccountOpening.model.LoginUserMaker;


@Controller
public class LoginValidation {
	
	@Autowired
	private AccountRepository accountRepository;
	
	public String userLoginValidation(LoginCredentials loginData) {
		
		List<LoginUserMaker> loginUsersData=accountRepository.dataOfLoginCredentials();
		
/*		Stream<Boolean> result= loginUsersData.stream().filter(loginUsersDatavar -> {
				return loginData.getUsername().toString().equalsIgnoreCase(loginUsersDatavar.getEmailId().toString()) && loginData.getPassword().toString().equals(loginUsersDatavar.getPassword().toString());
				});*/
		for( LoginUserMaker loginUsersData1 :  loginUsersData) {
			if(loginData.getUsername().toString().equalsIgnoreCase(loginUsersData1.getEmailId().toString()) && loginData.getPassword().toString().equals(loginUsersData1.getPassword().toString())){
			return "Y"	;
			}
			
		}
		
		
		return "N";
	}

}
