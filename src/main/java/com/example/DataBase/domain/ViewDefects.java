package com.example.DataBase.domain;

public class ViewDefects {
	String appName;
	String appType;
	String defCode;
	String severity;

//---------------------------------------------------------------getters and setters---------------------------------------------------------
	
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

//------------------------------------------------------constructors------------------------------------------------------------------------
	
	public ViewDefects() {}
	
	public ViewDefects(String appName, String appType, String defCode, String severity) {
		super();
		this.appName = appName;
		this.appType = appType;
		this.defCode = defCode;
		this.severity = severity;
	}
	
	

}
