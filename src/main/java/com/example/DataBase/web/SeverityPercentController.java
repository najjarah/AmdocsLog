package com.example.DataBase.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DataBase.Repository.DefectInstanceRepository;
import com.example.DataBase.domain.SeverityPercent;

@RestController
public class SeverityPercentController {
	@Autowired
	private DefectInstanceRepository repository;

	@RequestMapping("/SeverityPercent")
	public ArrayList<SeverityPercent> getSeverityPercent() {
		return repository.getSeverityPercent();
	}
}
