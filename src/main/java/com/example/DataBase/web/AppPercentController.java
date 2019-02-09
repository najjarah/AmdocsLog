package com.example.DataBase.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.DataBase.Repository.DefectInstanceRepository;
import com.example.DataBase.domain.AppPercent;
import com.example.DataBase.domain.AppPercentApp;
import com.example.DataBase.domain.AppPercentSeverity;

@RestController
public class AppPercentController {
	@Autowired
	private DefectInstanceRepository repository;
	
	@Autowired
	private DefectInstanceRepository repository2;
	
	@Autowired
	private DefectInstanceRepository repository3;

	@RequestMapping("/AppPercent")
	public ArrayList<AppPercent> getAppPercent() {
		return repository.getAppPercent();
	}
	
	@RequestMapping("/AppPercentApp/{appName2}")
	public ArrayList<AppPercentApp> getAppPercentApp(@PathVariable String appName2) {
		return repository2.getAppPercentApp(appName2);
	}
	
	@RequestMapping("/AppPercentSeverity/{severityName2}")
	public ArrayList<AppPercentSeverity> getAppPercentSeverity(@PathVariable String severityName2) {
		return repository3.getAppPercentSeverity(severityName2);
	}

}


