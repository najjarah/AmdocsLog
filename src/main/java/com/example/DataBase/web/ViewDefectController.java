package com.example.DataBase.web;

import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.felix.bundlerepository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.DataBase.Repository.DefectInstanceRepository;
import com.example.DataBase.domain.ViewDefects;
import com.example.DataBase.domain.ViewDefectsApp;

@RestController
public class ViewDefectController {
	@Autowired
	private DefectInstanceRepository repository;

@Autowired
	private DefectInstanceRepository repository1;

	
	
	@RequestMapping("/ViewDefects/pages/{pageno}")
	
	
	@ResponseBody 
    public ArrayList<ViewDefects> getViewDefects(@PathVariable("pageno") int pageno,
    		HttpServletRequest req, HttpServletResponse res) throws ServletException {
		
		return repository.getViewDefects(new PageRequest(pageno,10));
		
	}

	@RequestMapping("/ViewDefectsApp/{appName}")
	public ArrayList<ViewDefectsApp> getViewDefectsApp(@PathVariable String appName) {
		return repository1.getViewDefectsApp(appName);
		
	}
	@RequestMapping("/ViewDefectsSeverity/{SeverityName}")
	public ArrayList<ViewDefectsApp> getViewDefectsSeverity(@PathVariable String SeverityName) {
		return repository1.getViewDefectsApp(SeverityName);
		
	}

}

