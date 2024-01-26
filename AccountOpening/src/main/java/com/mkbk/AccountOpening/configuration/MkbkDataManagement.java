package com.mkbk.AccountOpening.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.stereotype.Controller;

import com.mkbk.AccountOpening.Exceptions.UserNotFoundException;
import com.mkbk.AccountOpening.model.LoginCredentials;

@Controller
public class MkbkDataManagement {

	public String _key="";
	public String _value="";
	
	public void UserDataSaver(String key , String data ,String FileName) {
		
		
		StringBuilder sbr=  new StringBuilder();
		sbr.append(System.getProperty("user.dir")).append(File.separator).append("UserConfig").append(File.separator).append(FileName);
		Properties p = null;
		try {
			p = loadProperties(sbr.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try(OutputStream fos=new FileOutputStream(sbr.toString())){
			
			p.setProperty(key, data);
			p.store(fos, null);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
    private static Properties loadProperties(String filePath) throws IOException {
        Properties properties = new Properties();
        try (InputStream input = new FileInputStream(filePath)) {
            properties.load(input);
        }
        return properties;
    }
    
    
	
	
	public boolean UserDataReader(String key ,String FileName) {
		Properties p= new Properties();
		boolean exists=false;
		StringBuilder sbr=  new StringBuilder();
		sbr.append(System.getProperty("user.dir")).append(File.separator).append("UserConfig").append(File.separator).append(FileName);
		
		System.out.println("sbr;::"+sbr);
		try(InputStream ins=new FileInputStream(sbr.toString())){
			p.load(ins);
			this._key=key;
			 System.out.println("dataOfuser;::"+_key);
			 this._value=p.get(key).toString();
			 
			ins.close();
			exists=true;


		}catch(Exception e) {
			System.out.println("there is no user ");
		}
		
		
		return exists ;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<LoginCredentials> userValidator(LoginCredentials lgc){
		List<LoginCredentials> userData= new ArrayList<>();
		UserDataReader(lgc.getUsername().toString() ,"LoginCredential.properties");
		System.out.println("key Is "+ _key);
		System.out.println("value is  "+ _value);
		if(_value=="") {
			throw new UserNotFoundException();
		}
		userData.add(new LoginCredentials(3,_key,_value));
		return  userData;
	}
	
	
}
