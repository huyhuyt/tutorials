import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kevin.value.Student;

public class App {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Student student = ctx.getBean("student", Student.class);
        student.displayStudentInfo();
    }
}
