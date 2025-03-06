package dev.xamacardoso.course_jpa_hibernate.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"dev.xamacardoso.course_jpa_hibernate"})
public class CourseJpaHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseJpaHibernateApplication.class, args);
	}

}
