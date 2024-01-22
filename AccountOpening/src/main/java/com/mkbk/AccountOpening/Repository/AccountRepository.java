package com.mkbk.AccountOpening.Repository;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mkbk.AccountOpening.model.LoginCredentials;
import com.mkbk.AccountOpening.model.LoginUserMaker;
import com.mkbk.AccountOpening.model.UserInfo;

@Service
public interface AccountRepository {
	
	public List<UserInfo> dataOfuserAll();
	public List<UserInfo> addUser(UserInfo ureinfo);
	public List<LoginUserMaker> dataOfLoginCredentials();
	public List<LoginUserMaker> addLoginCredentais(LoginUserMaker lgnCred) throws JsonProcessingException;

}
