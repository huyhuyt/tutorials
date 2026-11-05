package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.course.Family;
import com.example.course.MathTeacher;
import com.example.course.Teacher;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		for (int i=0; i<=10; i++){
			System.out.println("test " + i);
			

		}
		//Family f = new Family();
		Teacher mathTeacher = new MathTeacher(new Family());
		mathTeacher.teach();
	}

}

