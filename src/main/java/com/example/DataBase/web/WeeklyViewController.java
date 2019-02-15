package com.example.DataBase.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

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
	
	@RequestMapping("/WeeklyView1")
	public ArrayList<WeeklyView> getWeeklyView1() {
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		 Calendar calendar = Calendar.getInstance();
		    calendar.setTime(Calendar.getInstance().getTime());
		    calendar.add(Calendar.DATE, -7);
		return repository.getWeeklyView1(dateformat.format(Calendar.getInstance().getTime()),dateformat.format(calendar.getTime()));
		
	}
	
	@RequestMapping("/WeeklyView2")
	public ArrayList<WeeklyView> getWeeklyView2() {
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		 Calendar calendar = Calendar.getInstance();
		 Calendar calendarsecond = Calendar.getInstance();
		    calendar.setTime(Calendar.getInstance().getTime());
		    calendar.add(Calendar.DATE, -7);
		
		    calendarsecond.setTime(Calendar.getInstance().getTime());
		    calendarsecond.add(Calendar.DATE, -14);
		return repository.getWeeklyView2(dateformat.format(calendar.getTime()),dateformat.format(calendarsecond.getTime()));
		
	}
	
	@RequestMapping("/WeeklyView3")
	public ArrayList<WeeklyView> getWeeklyView3() {
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		 Calendar calendar = Calendar.getInstance();
		 Calendar calendarsecond = Calendar.getInstance();
		    calendar.setTime(Calendar.getInstance().getTime());
		    calendar.add(Calendar.DATE, -14);
		
		    calendarsecond.setTime(Calendar.getInstance().getTime());
		    calendarsecond.add(Calendar.DATE, -21);
		return repository.getWeeklyView3(dateformat.format(calendar.getTime()),dateformat.format(calendarsecond.getTime()));
		
	}
	
	@RequestMapping("/WeeklyViews")
	public ArrayList<WeeklyView> getWeeklyViews() {
		ArrayList<WeeklyView>rrrr =new ArrayList<WeeklyView>();
		ArrayList<WeeklyView> r=getWeeklyView1();
		ArrayList<WeeklyView> rr=getWeeklyView2();
		ArrayList<WeeklyView> rrr=getWeeklyView3();
		rrrr.addAll(r);
		rrrr.addAll(rr);
//		rrrr.addAll(rrr);
		//return repository.getWeeklyView3(dateformat.format(calendar.getTime()),dateformat.format(calendarsecond.getTime()));
		return rrrr;
	}
	
	
	
}
