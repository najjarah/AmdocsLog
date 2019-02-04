package com.example.DataBase.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DataBase.Repository.DefectInstanceRepository;
import com.example.DataBase.domain.SeverityPercent;
import com.example.DataBase.domain.SeverityPercentApp;

@RestController
public class SeverityPercentController {
	@Autowired
	private DefectInstanceRepository repository;
	
	@Autowired
	private DefectInstanceRepository repository1;

	@RequestMapping("/SeverityPercent")
	public ArrayList<SeverityPercent> getSeverityPercent() {
		return repository.getSeverityPercent();
	}
	
	@RequestMapping("/SeverityPercentApp/{appName1}")
	public ArrayList<SeverityPercentApp> getSeverityPercentApp(@PathVariable String appName1) {
		return repository1.getSeverityPercentApp(appName1);
	}
}
