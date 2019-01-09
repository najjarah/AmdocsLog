package com.packt.DataBase.domain;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class LogFile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private Time time;
	private Date date;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "logfile")
    private List<DefectInstance> defects;

//-------------------------------------constructors--------------------------------------------------------------	
	public LogFile() {
	}

	public LogFile(String name, Time time, Date date) {
		super();
		this.name = name;
		this.time = time;
		this.date = date;
	}

//----------------------------------------getters and setters----------------------------------------------------------

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}