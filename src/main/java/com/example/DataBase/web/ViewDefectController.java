package com.example.DataBase.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DataBase.Repository.DefectInstanceRepository;
import com.example.DataBase.Repository.ViewDefectsRepository;
import com.example.DataBase.domain.ViewDefects;
import com.example.DataBase.domain.ViewDefectsApp;

@RestController
public class ViewDefectController {
	@Autowired
	private ViewDefectsRepository repository;
	
	@Autowired
	private DefectInstanceRepository repository1;

	@RequestMapping("/ViewDefects")
	public ArrayList<ViewDefects> getViewDefects() {
		return repository.getViewDefects();
		
	}
	
	@RequestMapping("/ViewDefectsApp/{appName}")
	public ArrayList<ViewDefectsApp> getViewDefectsApp(@PathVariable String appName) {
		return repository1.getViewDefectsApp(appName);
		
	}

}

