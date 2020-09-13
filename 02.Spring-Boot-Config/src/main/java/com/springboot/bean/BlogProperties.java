package com.springboot.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class BlogProperties {
	
	@Value("${jinlongxu.blog.name}")
	private String name;
	
	@Value("${jinlongxu.blog.title}")
	private String title;
	
}
