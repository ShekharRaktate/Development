package com.sj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SatudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SatudentApplication.class, args);
		System.out.println("server up");
	}

}
