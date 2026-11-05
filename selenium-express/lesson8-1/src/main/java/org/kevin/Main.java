package org.kevin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = ctx.getBean("student", Student.class);
        College college = ctx.getBean("college", College.class);
        college.showStudent(student);
    }
}