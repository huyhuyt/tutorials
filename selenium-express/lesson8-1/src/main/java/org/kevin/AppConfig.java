package org.kevin;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "org.kevin")
@PropertySource("classpath:app.properties")
public class AppConfig {

}
