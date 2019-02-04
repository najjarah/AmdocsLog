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

@RestController
public class ViewDefectController {
	@Autowired
	private DefectInstanceRepository repository;

	
	
	@RequestMapping("/ViewDefects/pages/{pageno}")
	
	
	@ResponseBody 
    public ArrayList<ViewDefects> getViewDefects(@PathVariable("pageno") int pageno,
    		HttpServletRequest req, HttpServletResponse res) throws ServletException {
		
		return repository.getViewDefects(new PageRequest(pageno,10));
		
	}

}

