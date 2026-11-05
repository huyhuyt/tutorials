package kevin.lesson8;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "kevin.lesson8")
public class CollegeConfig {

    @Bean
    public Teacher mathTeacherBean(){
        return new MathTeacher();
    }

    @Bean
    public Principal principalBean(){
        return new Principal();
    }


    @Bean(name="colBean")
    public College collegeBean(){
        //return new College(principalBean());
        College college = new College();
        college.setPrincipal(principalBean());
        college.setTeacher(mathTeacherBean());
        return college;
    }
}
