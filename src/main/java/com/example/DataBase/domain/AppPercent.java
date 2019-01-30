package com.example.DataBase.domain;

import java.math.BigInteger;

public class AppPercent {
	
	private String name;
	private BigInteger defnum;
	private String percentage;
	private BigInteger critical;
	private BigInteger error;
	private BigInteger warning;
//-------------------------------------------------getters and setters-------------------------------------------------------------
	
	public BigInteger getCritical() {
		return critical;
	}
	public void setCritical(BigInteger critical) {
		this.critical = critical;
	}
	public BigInteger getError() {
		return error;
	}
	public void setError(BigInteger error) {
		this.error = error;
	}
	public BigInteger getWarning() {
		return warning;
	}
	public void setWarning(BigInteger warning) {
		this.warning = warning;
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

//----------------------------------------------------constructors----------------------------------------------------------------
	
	public AppPercent() {}
	
	public AppPercent(String name, BigInteger defnum, String percentage,BigInteger critical ,BigInteger error ,BigInteger warning) {
		super();
		this.name = name;
		this.defnum = defnum;
		this.percentage = percentage;
		this.critical = critical;
		this.error = error;
		this.warning = warning;
		
}
}
