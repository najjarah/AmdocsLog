package com.example.DataBase.domain;

public class ViewDefectsApp {

	


	long seqid;
	String appName;
	String appType;
	String defCode;
	String severity;
	String solname;

//---------------------------------------------------------------getters and setters---------------------------------------------------------
	public long getSeqid() {
		return seqid;
	}
	public void setSeqid(long seqid) {
		this.seqid = seqid;
	}
	
	public String getSolname() {
		return solname;
	}
	public void setSolname(String solname) {
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

//------------------------------------------------------constructors------------------------------------------------------------------------
	
	public ViewDefectsApp() {}
	
	public ViewDefectsApp(long seqid,String appName, String appType, String defCode, String severity, String solname) {
		super();
		this.seqid = seqid;
		this.appName = appName;
		this.appType = appType;
		this.defCode = defCode;
		this.severity = severity;
		this.solname = solname;
	}
}
	