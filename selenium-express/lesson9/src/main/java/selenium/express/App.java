package selenium.express;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(StudentConfig.class);
        StudentDao stu = ctx.getBean("studentDao", selenium.express.StudentDao.class);

        stu.connectDB();
    
        ctx.close();
    }
}
