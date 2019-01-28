package com.example.DataBase.domain;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;

@SqlResultSetMapping(
		name="DefectViewMapping",
	    classes={
	        @ConstructorResult(
	        		targetClass=ViewDefects.class,
	            columns={
	            	@ColumnResult(name="id", type = long.class),
	            	@ColumnResult(name="name", type = String.class),
	                @ColumnResult(name="type", type = String.class),
	                @ColumnResult(name="error_code", type = String.class),
	                @ColumnResult(name="severity", type = String.class),
	                @ColumnResult(name="sname", type = String.class)
	            }
	        )
	    }
	)

@NamedNativeQuery(name = "ViewDefects.getViewDefects", 
query = "select di.id, ap.name, ap.type, d.error_code, d.severity, s.sname, s.description "
+ "from app ap, defect d, defect_instance di, solution s"
+ " where ap.id=di.appid and d.id=di.defectid and s.id=d.idsolution", resultSetMapping = "DefectViewMapping")

public class ViewDefects {
	


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
	
	public ViewDefects() {}
	
	public ViewDefects(long seqid,String appName, String appType, String defCode, String severity, String solname) {
		super();
		this.seqid = seqid;
		this.appName = appName;
		this.appType = appType;
		this.defCode = defCode;
		this.severity = severity;
		this.solname = solname;
	}
	
	

}
