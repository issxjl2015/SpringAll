package com.springboot.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="jinlongxu.blog")
@Setter
@Getter
public class ConfigBean {

	private String name;

	private String title;

	private String wholeTitle;
	
}
