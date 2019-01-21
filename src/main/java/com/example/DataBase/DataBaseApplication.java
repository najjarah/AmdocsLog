package com.example.DataBase;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;

import com.example.DataBase.Repository.AppRepository;
import com.example.DataBase.Repository.DefectInstanceRepository;
import com.example.DataBase.Repository.DefectRepository;
import com.example.DataBase.Repository.LogFileRepository;
import com.example.DataBase.Repository.SolutionRepository;
import com.example.DataBase.Routing.LogFileRouting;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;


@SpringBootApplication
public class DataBaseApplication {
	  @Autowired 
  private AppRepository appRepository;

  @Autowired 
  private DefectRepository defectRepository;
  
  @Autowired 
  private LogFileRepository logFileRepository;
  
  @Autowired 
  private DefectInstanceRepository defectInstanceRepository;
	
  @Autowired 
  private SolutionRepository solutionRepository;
	  
	public static void main(String[] args) {
		SpringApplication.run(DataBaseApplication.class, args);
	}
	 @Bean
     CommandLineRunner runner(){
       return args -> {
    	   
    	   String searchStr = "Caused by";
   			File file = new File("C:\\Users\\Rental-Media\\Desktop\\CMServer.20170924_1557.log");
   			LogFileRouting routingtotables = new LogFileRouting();
   			routingtotables.SearchDefects(file, searchStr,appRepository,defectRepository, logFileRepository,defectInstanceRepository, solutionRepository);
   			
   		
       };
	 }
}

