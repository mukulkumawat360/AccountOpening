package com.mkbk.AccountOpening.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mkbk.AccountOpening.configuration.DataConfigurationProp;

@RestController
@RequestMapping(value="/portal/")
public class HelloWorldController {

	
	@Autowired
	private DataConfigurationProp dataConfig;
	
	
	@GetMapping(value="Hello")
	public String CallHelloWorld() {
		String sampleVal=dataConfig.getDemoValue();
		return sampleVal==null || sampleVal==""?"Hello World":sampleVal;
	}
}
