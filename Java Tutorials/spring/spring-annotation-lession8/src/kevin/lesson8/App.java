package kevin.lesson8;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        //ApplicationContext ctx = new AnnotationConfigApplicationContext(CollegeConfig.class);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CollegeConfig.class);
        College college = ctx.getBean("colBean", College.class);
        college.test();
                //((AnnotationConfigApplicationContext)ctx).close();
        ctx.close();
        
    }
}
