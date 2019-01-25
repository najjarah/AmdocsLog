package com.example.DataBase.domain;

import java.math.BigInteger;



public class AppPercent {
	
	private String name;
	private BigInteger defnum;
	private String percentage;
	
	public AppPercent() {}
	
	public AppPercent(String name, BigInteger defnum, String percentage) {
		super();
		this.name = name;
		this.defnum = defnum;
		this.percentage = percentage;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigInteger getDefnum() {
		return defnum;
	}
	public void setDefnum(BigInteger defnum) {
		this.defnum = defnum;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	
}
