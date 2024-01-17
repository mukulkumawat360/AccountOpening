package com.mkbk.AccountOpening.RepositoryImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mkbk.AccountOpening.Repository.AccountRepository;
import com.mkbk.AccountOpening.model.LoginCredentials;
import com.mkbk.AccountOpening.model.LoginUserMaker;
import com.mkbk.AccountOpening.model.UserInfo;

@Service
public class AccountRepositoryImpl implements AccountRepository{
	
	private static List<UserInfo> userdata=new ArrayList<>();
	
	
	private static List<LoginUserMaker> loginCredential=new ArrayList<>();
	
	  static int serialNum=0;
	  
	  static int loginsrn=0;
	
	static {
		
		userdata.add(new UserInfo(serialNum++,"mukul","Kumawat","Existing","Live"));
		userdata.add(new UserInfo(serialNum++,"Shivansh","Bhardwaj","New","NA"));
		
		loginCredential.add(new LoginUserMaker(loginsrn++,"mukul","kumawat","mukulEmail.com",new Date(),"123"));
		loginCredential.add(new LoginUserMaker(loginsrn++,"shivansh","pappu","shivuEmail.com",new Date(),"123"));
	}
	
	
	@Override
	public List<LoginUserMaker> dataOfLoginCredentials(){
		return loginCredential;
	}
	
	
	@Override
	public List<LoginUserMaker> addLoginCredentais(LoginUserMaker lgnCred){
		lgnCred.setSrno(loginsrn++);
		loginCredential.add(lgnCred);
		return loginCredential;
	}

	@Override
	public List<UserInfo> dataOfuserAll(){
		return userdata;
	}
	
	
	
	@Override
	public List<UserInfo> addUser(UserInfo ureinfo){
		ureinfo.setSerialnum(serialNum++);
		userdata.add(ureinfo);
		return userdata;
	}
	
}
