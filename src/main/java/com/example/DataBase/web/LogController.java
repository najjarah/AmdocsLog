package com.example.DataBase.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DataBase.Repository.AppRepository;
import com.example.DataBase.domain.App;

@RestController
public class LogController {
	 @Autowired
     private AppRepository repository;

	 
	 @RequestMapping("/app")
     public Iterable<App> getApp() {
		 return repository.findAll();
     } 

}
