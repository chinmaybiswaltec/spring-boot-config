package com.chinmaybiswaltec.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
	
	@Value("${app.greet: default value}")
	private String greetingMsg;
	
	@Value("${my.list.values}")
	private List<String> stringList ;
	
	@Value("#{${dbValues}}")
	private Map<String, String> map;
	
	@Autowired
	private DbProp prop;
	
	@Autowired
	private Environment env;
	
	@GetMapping("/greeting")
	public String getConfigValue() {
		return greetingMsg+ stringList + map+ "db properties "+prop.getHost()+" "+prop.getPort();
	}
	
	@GetMapping("/envdetails")
	public String getEnvDetails() {
		return env.toString();
	}

}
