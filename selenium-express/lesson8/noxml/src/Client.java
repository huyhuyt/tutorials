
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.selenium.express.College;
import com.selenium.express.CollegeConfig;
import com.selenium.express.Family;

public class Client {
    public static void main(String[] args) {

        /* College college = new College();
        college.displayInfo(); */

        ApplicationContext ctx = new AnnotationConfigApplicationContext(CollegeConfig.class);
        College college = ctx.getBean("colBean", com.selenium.express.College.class);
        college.displayInfo();
        
        Family f = ctx.getBean("family", com.selenium.express.Family.class);
        f.test();

        
        ((AnnotationConfigApplicationContext)ctx).close();
        
        
        
    }
}
