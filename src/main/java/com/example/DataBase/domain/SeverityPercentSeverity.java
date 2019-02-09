package com.example.DataBase.domain;

import java.math.BigInteger;

public class SeverityPercentSeverity {
	private String errorCode;
	private BigInteger defnum;
	private String percentage;
	
//-------------------------------------------------getters and setters-------------------------------------------------------------
	
	public String geterrorCode() {
		return errorCode;
	}
	public void seterrorCode(String errorCode) {
		this.errorCode = errorCode;
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
	
	public SeverityPercentSeverity() {}
	
	public SeverityPercentSeverity(String errorCode, BigInteger defnum, String percentage) {
		super();
		this.errorCode = errorCode;
		this.defnum = defnum;
		this.percentage = percentage;
}
}
