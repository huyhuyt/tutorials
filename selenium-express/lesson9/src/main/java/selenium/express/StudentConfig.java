package selenium.express;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "selenium.express")
@PropertySource("classpath:selenium/express/stu-info.properties")
public class StudentConfig {
    
}
