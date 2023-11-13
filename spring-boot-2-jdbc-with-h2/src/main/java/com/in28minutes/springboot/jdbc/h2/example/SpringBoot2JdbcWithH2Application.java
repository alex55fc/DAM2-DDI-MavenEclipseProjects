package com.in28minutes.springboot.jdbc.h2.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.springboot.jdbc.h2.example.repository.StudentjdbcRepository;
import com.in28minutes.springboot.jdbc.h2.example.student.Student;

@SpringBootApplication
public class SpringBoot2JdbcWithH2Application implements CommandLineRunner{

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    StudentjdbcRepository repository;
    
	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2JdbcWithH2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	    logger.info("Student id 10001 -> {}", repository.findbyid(10001));

	    logger.info("All students -> {}", repository.findAll());

	    logger.info("Inserting -> {}", repository.insert(new Student(10010, "john", "a1234657")));

	    logger.info("Update 10001 -> {}", repository.update(new Student(10001, "name-updated", "new-passport")));

	    repository.deleteById(10002);

	    logger.info("All students after deletion -> {}", repository.findAll());
	}

}
