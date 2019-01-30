package com.example.DataBase.domain;

import java.math.BigInteger;

public class AppPercentApp {
	private String errorCode;
	private BigInteger defnum;
	private String percentage;
	
//-------------------------------------------------getters and setters-------------------------------------------------------------
	
	public String geterrorCode() {
		return errorCode;
	}
	public void seterrorCode(String name) {
		this.errorCode = name;
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

//----------------------------------------------------constructors----------------------------------------------------------------
	
	public AppPercentApp() {}
	
	public AppPercentApp(String name, BigInteger defnum, String percentage) {
		super();
		this.errorCode = name;
		this.defnum = defnum;
		this.percentage = percentage;
		
}
}
