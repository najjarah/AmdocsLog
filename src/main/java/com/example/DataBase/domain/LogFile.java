package com.example.DataBase.domain;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class LogFile {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String ftime;
	private String fdate;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "logfile")
    private List<DefectInstance> defects;
	

//-------------------------------------constructors--------------------------------------------------------------	
	public LogFile() {
	}

	public LogFile(String name, String ftime, String fdate) {
		super();
		this.name = name;
		this.ftime = ftime;
		this.fdate = fdate;
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
	public String getTime() {
		return ftime;
	}
	public void setTime(String ftime) {
		this.ftime = ftime;
	}
	public String getDate() {
		return fdate;
	}
	public void setDate(String fdate) {
		this.fdate = fdate;
	}
	
	
}