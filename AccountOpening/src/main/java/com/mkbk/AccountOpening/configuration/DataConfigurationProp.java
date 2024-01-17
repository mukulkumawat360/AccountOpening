package com.mkbk.AccountOpening.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:DataConfigurationFile.properties")
public class DataConfigurationProp {

@Value("${samplevar}")
private String demoValue;

public String getDemoValue() {
	return demoValue;
}

public void setDemoValue(String demoValue) {
	this.demoValue = demoValue;
}
	
}
