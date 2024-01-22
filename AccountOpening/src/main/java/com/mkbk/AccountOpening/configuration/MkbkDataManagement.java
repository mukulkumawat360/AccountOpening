package com.mkbk.AccountOpening.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.springframework.stereotype.Controller;

@Controller
public class MkbkDataManagement {

	
	
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
			 String dataOfuser=p.get(key).toString();
			 System.out.println("dataOfuser;::"+dataOfuser);
			ins.close();
			exists=true;

		}catch(Exception e) {
			System.out.println("there is no user ");
		}
		
		
		return exists ;
	}
	
	
}
