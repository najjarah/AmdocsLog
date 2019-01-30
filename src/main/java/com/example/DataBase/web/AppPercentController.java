package com.example.DataBase.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.DataBase.Repository.DefectInstanceRepository;
import com.example.DataBase.domain.AppPercent;

@RestController
public class AppPercentController {
	@Autowired
	private DefectInstanceRepository repository;

	@RequestMapping("/AppPercent")
	public ArrayList<AppPercent> getAppPercent() {
		return repository.getAppPercent();
	}

}


