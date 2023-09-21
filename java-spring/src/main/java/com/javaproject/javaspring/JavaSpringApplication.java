package com.javaproject.javaspring;

import java.sql.Date;
import java.time.Instant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.auditing.CurrentDateTimeProvider;

import com.javaproject.javaspring.models.TodoItem;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class })
public class JavaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringApplication.class, args);

		Instant creationAt = Instant.now();
		
		
	
		

}
}