package dev.xamacardoso.course_jpa_hibernate.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"dev.xamacardoso.course_jpa_hibernate"})
@EntityScan(basePackages = {"dev.xamacardoso.course_jpa_hibernate"})
@EnableJpaRepositories(basePackages = {"dev.xamacardoso.course_jpa_hibernate"})
public class CourseJpaHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseJpaHibernateApplication.class, args);
	}

}
