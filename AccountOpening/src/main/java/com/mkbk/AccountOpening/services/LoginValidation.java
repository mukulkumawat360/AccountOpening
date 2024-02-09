package com.mkbk.AccountOpening.services;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.google.gson.Gson;
import com.mkbk.AccountOpening.Repository.AccountRepository;
import com.mkbk.AccountOpening.configuration.MkbkDataManagement;
import com.mkbk.AccountOpening.model.LoginCredentials;


@Controller
public class LoginValidation {
	
	@Autowired
	private AccountRepository accountRepository;
	
	
	@Autowired
	private MkbkDataManagement mkbkd;
	
	public String userLoginValidation(LoginCredentials loginData) {
		
		List<LoginCredentials> loginUsersData=mkbkd.userValidator(loginData);//accountRepository.dataOfLoginCredentials();
		System.out.println("loginData::"+loginData.toString());
		
/*		Stream<Boolean> result= loginUsersData.stream().filter(loginUsersDatavar -> {
				return loginData.getUsername().toString().equalsIgnoreCase(loginUsersDatavar.getEmailId().toString()) && loginData.getPassword().toString().equals(loginUsersDatavar.getPassword().toString());
				});*/
		for( LoginCredentials loginUsersData1 :  loginUsersData) {
			System.out.println("loginUsersData::"+loginUsersData1.toString());
			if(loginData.getUsername().toString().equalsIgnoreCase(loginUsersData1.getUsername().toString()) && loginData.getPassword().toString().equals(loginUsersData1.getPassword().toString())){
				String str= new StringBuffer().append("Time is= ").append(new Date()).toString();
				mkbkd.UserDataReader(loginData.getUsername().toString() ,"LoginActivity.properties");
				mkbkd.UserDataSaver(loginData.getUsername().toString(),mkbkd._value+"***"+str ,"LoginActivity.properties");
				return "Y"	;
			}
			
		}
		
		
		return "N";
	}

}
