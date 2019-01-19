package com.example.DataBase.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.ConstructorResult;
import javax.persistence.ColumnResult;

@Entity

@SqlResultSetMapping(
		name="DefectViewMapping",
	    classes={
	        @ConstructorResult(
	        		targetClass=ViewDefects.class,
	            columns={
	                @ColumnResult(name="name", type = String.class),
	                @ColumnResult(name="type", type = String.class),
	                @ColumnResult(name="error_code", type = String.class),
	                @ColumnResult(name="severity", type = String.class),
	              //  @ColumnResult(name="Sol", type = String.class)
	            }
	        )
	    }
	)

@NamedNativeQuery(name = "DefectInstance.getViewDefects", 
		query = "select ap.name, ap.type, d.error_code, d.severity "
		+ "from app ap, defect d, defect_instance di"
		+ " where ap.id=di.appid and d.id=di.defectid ", resultSetMapping = "DefectViewMapping")


public class DefectInstance  {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@ManyToOne
    @JoinColumn(name = "Appid")
    private App app;
	
	@ManyToOne
    @JoinColumn(name = "Defectid")
    private Defect defect;
	
	@ManyToOne
    @JoinColumn(name = "LogFileid")
    private LogFile logfile;
	
//-------------------------------------------------constructors-----------------------------------------------------------------
	
	public DefectInstance() {}
	
	public DefectInstance(long id, App app, Defect defect, LogFile logfile) {
		super();
		this.app = app;
		this.defect = defect;
		this.logfile = logfile;
	}


	
//-------------------------------------------------getters and setters-----------------------------------------------------------
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public App getApp() {
		return app;
	}

	public void setApp(App app) {
		this.app = app;
	}

	public Defect getDefect() {
		return defect;
	}

	public void setDefect(Defect defect) {
		this.defect = defect;
	}

	public LogFile getLogfile() {
		return logfile;
	}

	public void setLogfile(LogFile logfile) {
		this.logfile = logfile;
	}
	
}
