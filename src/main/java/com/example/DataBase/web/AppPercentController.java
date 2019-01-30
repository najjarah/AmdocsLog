package com.example.DataBase.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.DataBase.Repository.DefectInstanceRepository;
import com.example.DataBase.domain.AppPercent;
import com.example.DataBase.domain.AppPercentApp;

@RestController
public class AppPercentController {
	@Autowired
	private DefectInstanceRepository repository;
	
	@Autowired
	private DefectInstanceRepository repository2;

	@RequestMapping("/AppPercent")
	public ArrayList<AppPercent> getAppPercent() {
		return repository.getAppPercent();
	}
	
	@RequestMapping("/AppPercentApp/{appName2}")
	public ArrayList<AppPercentApp> getAppPercentApp(@PathVariable String appName2) {
		return repository2.getAppPercentApp(appName2);
	}

}


