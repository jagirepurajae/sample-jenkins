package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsdemoApplication {

	public void showMessage()
	{
		System.out.println("inside showmessage()");
	}
	public void addData()
	{
		System.out.println("inside addData()");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JenkinsdemoApplication.class, args);
	}

}
