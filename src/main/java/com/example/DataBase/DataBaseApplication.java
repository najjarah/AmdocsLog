package com.example.DataBase;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.DataBase.domain.AppRepository;
import com.example.DataBase.domain.DefectRepository;

import org.springframework.beans.factory.annotation.Autowired;


@SpringBootApplication
public class DataBaseApplication {

	/*  @Autowired 
      private AppRepository AppRepository;

	  @Autowired 
      private DefectRepository DefRepository;*/
	  
	public static void main(String[] args) {
		SpringApplication.run(DataBaseApplication.class, args);
	}
	 @Bean
     CommandLineRunner runner(){
       return args -> {
         // Place your code here
       };
	 }
}

