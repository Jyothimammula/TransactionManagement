package com.ssd.transcation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TranscationManagementApplication {

	public static void main(String[] args) {

		SpringApplication.run(TranscationManagementApplication.class, args);
		System.out.println("first maven project of transcation");
		
	}

}
