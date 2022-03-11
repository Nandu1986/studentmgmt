package com.fidelity.studentmgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages =  "com.fidelity.studentmgmt")
@SpringBootApplication
public class StudentmgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentmgmtApplication.class, args);
	}

}
