package com.springboot.bean.issxjlbean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * @ConfigurationProperties(prefix="test") 指明了属性的通用前缀, 通用前缀加属性名 和 配置文件的属性名一一对应
 * 例如，配置文件中的属性名为 issxjl.ok.context，但是通用前缀为issxjl，属性名为context，那么就会找不到属性值
 * @PropertySource("classpath:issxjltest.properties") 指明了使用哪个配置文件
 */
@Getter
@Setter
//@Configuration
@ConfigurationProperties(prefix = "issxjl")
@PropertySource("classpath:issxjltest.properties")
public class IssxjlConfigBean {

    public String name;

    public String context;

}
