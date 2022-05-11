package com.chinmaybiswaltec.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "db")
@RefreshScope
public class DbProp {
	
	private String host;
	private int port;
	private String username;
	private String password;

}
