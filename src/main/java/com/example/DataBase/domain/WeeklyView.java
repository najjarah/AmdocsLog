package com.example.DataBase.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class WeeklyView {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String sName;
    private String totalWeekly;
    //------------------------------------
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	public String getTotalWeekly() {
		return totalWeekly;
	}
	public void setTotalWeekly(String totalWeekly) {
		this.totalWeekly = totalWeekly;
	}
	
    public WeeklyView() {}
	public WeeklyView(String sName, String totalWeekly) {
		super();
		this.sName = sName;
		this.totalWeekly = totalWeekly;
	}

}
