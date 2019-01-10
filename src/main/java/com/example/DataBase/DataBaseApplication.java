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

import com.example.DataBase.Repository.AppRepository;
import com.example.DataBase.Repository.DefectInstanceRepository;
import com.example.DataBase.Repository.DefectRepository;
import com.example.DataBase.Repository.LogFileRepository;
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
	  
	public static void main(String[] args) {
		SpringApplication.run(DataBaseApplication.class, args);
	}
	 @Bean
     CommandLineRunner runner(){
       return args -> {
    	   
    	   String searchStr = "Caused by";
   			File file = new File("C:\\Users\\Rental-Media\\Desktop\\CMServer.20170914_2028.log");
   			LogFileRouting routingtotables = new LogFileRouting();
   			routingtotables.SearchDefects(file, searchStr);
   			
   			defectRepository.saveAll(routingtotables.defList);
			logFileRepository.saveAll(routingtotables.logFList);
			appRepository.saveAll(routingtotables.appList);
			defectInstanceRepository.saveAll(routingtotables.defInsList);
       };
	 }
}

