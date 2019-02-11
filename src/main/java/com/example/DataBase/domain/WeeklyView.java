package com.example.DataBase.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WeeklyView {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String appName;
    private int totalWeekly;
    //------------------------------------
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public int getTotalWeekly() {
		return totalWeekly;
	}
	public void setTotalWeekly(int totalWeekly) {
		this.totalWeekly = totalWeekly;
	}
	
    public WeeklyView() {}
	public WeeklyView(String appName, int totalWeekly) {
		super();
		this.appName = appName;
		this.totalWeekly = totalWeekly;
	}

}
