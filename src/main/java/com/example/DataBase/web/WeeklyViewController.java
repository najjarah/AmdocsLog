package com.example.DataBase.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DataBase.Repository.DefectInstanceRepository;

import com.example.DataBase.domain.WeeklyView;

@RestController
public class WeeklyViewController {

	@Autowired
	private DefectInstanceRepository repository;
	
	@RequestMapping("/WeeklyView")
	public ArrayList<WeeklyView> getWeeklyView() {
		return repository.getWeeklyView();
		
	}
	
}
