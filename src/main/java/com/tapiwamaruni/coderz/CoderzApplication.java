package com.tapiwamaruni.coderz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.tapiwamaruni.coderz"})
public class CoderzApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoderzApplication.class, args);
	}

}
