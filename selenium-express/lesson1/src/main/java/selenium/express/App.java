package selenium.express;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/beans.xml");
        System.out.println("config loaded");
        Sim sim = ctx.getBean("sim", Sim.class);
        sim.calling();
        sim.data();
        ctx.close();
    }
}
