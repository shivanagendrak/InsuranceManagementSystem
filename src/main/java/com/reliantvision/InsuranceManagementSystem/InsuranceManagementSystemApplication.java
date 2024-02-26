package com.reliantvision.InsuranceManagementSystem;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InsuranceManagementSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(InsuranceManagementSystemApplication.class, args);
	}
public  ModelMapper modelMapper(){
		return new ModelMapper();
}
}
