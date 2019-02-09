package com.example.DataBase.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

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
	private DefectInstanceRepository repositoryApp;

@Autowired
private DefectInstanceRepository repository2;

	
	
	@RequestMapping("/ViewDefects/pages/{pageno}")
	
	
	@ResponseBody 
    public ArrayList<ViewDefects> getViewDefects(@PathVariable("pageno") int pageno,
    		HttpServletRequest req, HttpServletResponse res) throws ServletException {
		
		return repository.getViewDefects(new PageRequest(pageno,10));
		
	}

	@RequestMapping("/ViewDefectsApp/{appName}/{pageSize}/{PageNumber}")
	public ArrayList<ViewDefectsApp> getViewDefectsApp(@PathVariable String appName, @PathVariable("pageSize") int pageSize,
			@PathVariable("PageNumber") int pageNumber) throws ServletException{

		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		int limit = pageSize;
		int offset = pageNumber - 1;
		offset = offset * limit;
		return repositoryApp.getViewDefectsApp(appName,dateformat.format(Calendar.getInstance().getTime()), limit, offset);

	}
	@RequestMapping("/ViewDefectsSeverity/{severityName}")
	public ArrayList<ViewDefects> getViewDefectsSeverity(@PathVariable String severityName) {
		return repository2.getViewDefectsSeverity(severityName);
		
	}

}

