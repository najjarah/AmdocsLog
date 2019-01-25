package com.example.DataBase.domain;

import java.math.BigInteger;

public class ViewDefects {
	


	BigInteger seqId;
	String appName;
	String appType;
	String defCode;
	String severity;
	String solname;

//---------------------------------------------------------------getters and setters---------------------------------------------------------
	
	public String getsolname() {
		return solname;
	}
	public void setsolname(String solname) {
		this.solname = solname;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppType() {
		return appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}
	public String getDefCode() {
		return defCode;
	}
	public void setDefCode(String defCode) {
		this.defCode = defCode;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	
	public BigInteger getSeqid() {
		return seqId;
	}
	public void setSeqid(BigInteger seqid) {
		this.seqId = seqid;
	}
	public String getSolname() {
		return solname;
	}
	public void setSolname(String solname) {
		this.solname = solname;
	}

//------------------------------------------------------constructors------------------------------------------------------------------------
	
	public ViewDefects() {}
	
	public ViewDefects(BigInteger seqid, String appName, String appType, String defCode, String severity, String solname) {
		super();
		this.seqId = seqid;
		this.appName = appName;
		this.appType = appType;
		this.defCode = defCode;
		this.severity = severity;
		this.solname = solname;
	}
	
	

}
