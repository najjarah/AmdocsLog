package com.example.DataBase;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.packt.DataBase.domain.AppRepository;
import com.packt.DataBase.domain.DefectRepository;
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

