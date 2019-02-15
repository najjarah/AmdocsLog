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

import java.math.BigInteger;

import javax.persistence.ColumnResult;

@Entity

//------------------------------------------------------sql result mapping------------------------------------------------------------

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

@SqlResultSetMapping(
		name="SeverityPercentMapping",
	    classes={
	        @ConstructorResult(
	        		targetClass=SeverityPercent.class,
	            columns={
	                @ColumnResult(name="severity", type = String.class),
	                @ColumnResult(name="defnum", type = BigInteger.class),
	                @ColumnResult(name="percentage", type = String.class)
	            }
	        )
	    }
	)

@SqlResultSetMapping(
        name="AppPercentMapping",
        classes={
            @ConstructorResult(
                    targetClass=AppPercent.class,
                columns={
                    @ColumnResult(name="name", type = String.class),
                    @ColumnResult(name="defnum", type = BigInteger.class),
                    @ColumnResult(name="percentage", type = String.class),
                    @ColumnResult(name="critical", type = BigInteger.class),
                    @ColumnResult(name="error", type = BigInteger.class),
                    @ColumnResult(name="warning", type = BigInteger.class)
                }
            )
        }
    )

@SqlResultSetMapping(
		name="DefectViewAppMapping",
	    classes={
	        @ConstructorResult(
	        		targetClass=ViewDefectsApp.class,
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

@SqlResultSetMapping(
		name="SeverityPercentAppMapping",
	    classes={
	        @ConstructorResult(
	        		targetClass=SeverityPercentApp.class,
	            columns={
	                @ColumnResult(name="severity", type = String.class),
	                @ColumnResult(name="defnum", type = BigInteger.class),
	                @ColumnResult(name="percentage", type = String.class)
	            }
	        )
	    }
	)
@SqlResultSetMapping(
		name="AppPercentAppMapping",
	    classes={
	        @ConstructorResult(
	        		targetClass=AppPercentApp.class,
	            columns={
	                @ColumnResult(name="error_code", type = String.class),
	                @ColumnResult(name="defnum", type = BigInteger.class),
	                @ColumnResult(name="percentage", type = String.class)
	            }
	        )
	    }
	)
//---------------------------------------
@SqlResultSetMapping(
		name="DefectViewSeverityMapping",
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

@SqlResultSetMapping(
		name="SeverityPercentSeverityMapping",
	    classes={
	        @ConstructorResult(
	        		targetClass=SeverityPercentSeverity.class,
	            columns={
	                @ColumnResult(name="error_code", type = String.class),
	                @ColumnResult(name="defnum", type = BigInteger.class),
	                @ColumnResult(name="percentage", type = String.class)
	            }
	        )
	    }
	)

@SqlResultSetMapping(
        name="AppPercentSeverityMapping",
        classes={
            @ConstructorResult(
                    targetClass=AppPercentSeverity.class,
                columns={
                    @ColumnResult(name="name", type = String.class),
                    @ColumnResult(name="defnum", type = BigInteger.class),
                    @ColumnResult(name="percentage", type = String.class),
                    @ColumnResult(name="critical", type = BigInteger.class),
                    @ColumnResult(name="error", type = BigInteger.class),
                    @ColumnResult(name="warning", type = BigInteger.class)
                }
            )
        }
    )

@SqlResultSetMapping(
        name="WeeklyViewMapping1",
        classes={
            @ConstructorResult(
                    targetClass=WeeklyView.class,
                columns={
                    @ColumnResult(name="s_name", type = String.class),
                    @ColumnResult(name="total_weekly", type = String.class)
                }
            )
        }
    )

@SqlResultSetMapping(
        name="WeeklyViewMapping2",
        classes={
            @ConstructorResult(
                    targetClass=WeeklyView.class,
                columns={
                    @ColumnResult(name="s_name", type = String.class),
                    @ColumnResult(name="total_weekly", type = String.class)
                }
            )
        }
    )

@SqlResultSetMapping(
        name="WeeklyViewMapping3",
        classes={
            @ConstructorResult(
                    targetClass=WeeklyView.class,
                columns={
                    @ColumnResult(name="s_name", type = String.class),
                    @ColumnResult(name="total_weekly", type = String.class)
                }
            )
        }
    )
//------------------------------------------------------sql query---------------------------------------------------------------------


@NamedNativeQuery(name = "DefectInstance.getViewDefects", 
		query = "select di.id, ap.name, ap.type, d.error_code, d.severity, s.sname, s.description "
		+ "from app ap, defect d, defect_instance di, solution s"
		+ " where ap.id=di.appid and d.id=di.defectid and s.id=d.idsolution", resultSetMapping = "DefectViewMapping")


@NamedNativeQuery(name = "DefectInstance.getSeverityPercent",
		query ="select d.severity, count(*) As defnum,concat(cast(cast( count(*) as float)/ cast((select count(*) from defect_instance di) as float)*100 as decimal(7,2)),'%') AS percentage"
		+" from defect d, defect_instance di"
		+" where d.id=di.defectid"
		+" group by severity", resultSetMapping = "SeverityPercentMapping")


@NamedNativeQuery(name = "DefectInstance.getAppPercent",
query = "select ap.name, count(*) As defnum,"
+" concat(cast(cast( count(*) as float)/ cast((select count(*) from defect_instance di) as float)*100 as decimal(7,2)),'%') AS percentage,"
+" SUM(CASE WHEN (d.id=di.defectid And d.severity = 'Critical' )  THEN 1 ELSE 0 END) AS critical,"
+" SUM(CASE WHEN (d.id=di.defectid And d.severity = 'Error' )THEN 1 ELSE 0 END) AS error,"
+" SUM(CASE WHEN (d.id=di.defectid And d.severity = 'Warning') THEN 1 ELSE 0 END) AS warning"
+" from app ap, defect_instance di, defect d"
+" where ap.id=di.appid and d.id=di.defectid"
+" group by ap.name", resultSetMapping = "AppPercentMapping")

//--------------------------------------------------------------

@NamedNativeQuery(name = "DefectInstance.getViewDefectsApp", 
query = "select di.id, ap.name, ap.type, d.error_code, d.severity, s.sname, s.description "
		+ "from app ap, defect d, defect_instance di, solution s , log_file l"
		+ " where ((ap.name)=:appName) and d.id=di.defectid and s.id=d.idsolution and l.id=di.log_fileid and  ((l.fdate)=:todayDate) "
		+" LIMIT (:limit) OFFSET (:offset)", resultSetMapping = "DefectViewAppMapping")

@NamedNativeQuery(name = "DefectInstance.getSeverityPercentApp",
query ="select d.severity, count(*) As defnum,concat(cast(cast( count(*) as float)/ cast((select count(*) from defect_instance di) as float)*100 as decimal(7,2)),'%') AS percentage"
+" from defect d, defect_instance di, app ap"
+" where d.id=di.defectid and ((ap.name)=:appName1)"
+" group by severity", resultSetMapping = "SeverityPercentAppMapping")

@NamedNativeQuery(name = "DefectInstance.getAppPercentApp", 
query = "select d.error_code, count(*) As defnum,concat(cast(cast( count(*) as float)/ cast((select count(*) from defect_instance di) as float)*100 as decimal(7,2)),'%') AS percentage"
+ " from app ap, defect_instance di, defect d" 
+ " where ap.id=di.appid and ((ap.name)=:appName2) and d.id=di.defectid"
+ " group by error_code ", resultSetMapping = "AppPercentAppMapping")
//and d.app_name=ap.name

//----------------------------------------------------
@NamedNativeQuery(name = "DefectInstance.getViewDefectsSeverity", 
query = "select di.id, ap.name, ap.type, d.error_code, d.severity, s.sname, s.description "
+ "from app ap, defect d, defect_instance di, solution s"
+ " where ap.id=di.appid and d.id=di.defectid and s.id=d.idsolution and ((d.severity)=:severityName) ", resultSetMapping = "DefectViewSeverityMapping")
//and ((d.severity)=:severityName)

@NamedNativeQuery(name = "DefectInstance.getSeverityPercentSeverity", 
query = "select d.error_code, count(*) As defnum,concat(cast(cast( count(*) as float)/ cast((select count(*) from defect_instance di) as float)*100 as decimal(7,2)),'%') AS percentage"
+ " from app ap, defect_instance di, defect d" 
+ " where ap.id=di.appid and ((d.severity)=:severityName1) and d.id=di.defectid"
+ " group by error_code ", resultSetMapping = "SeverityPercentSeverityMapping")

@NamedNativeQuery(name = "DefectInstance.getAppPercentSeverity",
query = "select ap.name, count(*) As defnum,"
+" concat(cast(cast( count(*) as float)/ cast((select count(*) from defect_instance di) as float)*100 as decimal(7,2)),'%') AS percentage,"
+" SUM(CASE WHEN (d.id=di.defectid And d.severity = 'Critical' )  THEN 1 ELSE 0 END) AS critical,"
+" SUM(CASE WHEN (d.id=di.defectid And d.severity = 'Error' )THEN 1 ELSE 0 END) AS error,"
+" SUM(CASE WHEN (d.id=di.defectid And d.severity = 'Warning') THEN 1 ELSE 0 END) AS warning"
+" from app ap, defect_instance di, defect d"
+" where ap.id=di.appid and d.id=di.defectid and ((d.severity)=:severityName2)"
+" group by ap.name", resultSetMapping = "AppPercentSeverityMapping")
//-----------------------------------------------------------------

@NamedNativeQuery(name = "DefectInstance.getWeeklyView2", 
query = "select d.severity as s_name,  concat(cast(cast(count(*) as float)/ cast((select count(*) from defect_instance di, log_file f where f.id=di.log_fileid and f.fdate BETWEEN :weekbefore AND :currdate) as float)*100 as decimal(7,2)),'%') AS total_weekly"
+ " from defect_instance di, defect d, log_file f" 
+ " where di.log_fileid=f.id and d.id=di.defectid and f.fdate BETWEEN :weekbefore AND :currdate "
+" group by d.severity" ,resultSetMapping = "WeeklyViewMapping2")
//concat(cast(cast( count(*) as float)/ cast((select count(*) from defect_instance di) as float)*100 as decimal(7,2)),'%') AS percentage
@NamedNativeQuery(name = "DefectInstance.getWeeklyView1", 
query = "select d.severity as s_name,   concat(cast(cast(count(*) as float)/ cast((select count(*) from defect_instance di, log_file f where f.id=di.log_fileid and f.fdate BETWEEN :weekbefore AND :currdate) as float)*100 as decimal(7,2)),'%') AS total_weekly"
+ " from defect_instance di, defect d, log_file f" 
+ " where di.log_fileid=f.id and d.id=di.defectid and f.fdate BETWEEN :weekbefore AND :currdate"
+" group by d.severity" ,resultSetMapping = "WeeklyViewMapping1")


@NamedNativeQuery(name = "DefectInstance.getWeeklyView3", 
query = "select d.severity as s_name,    concat(cast(cast(count(*) as float)/ cast((select count(*) from defect_instance di, log_file f where f.id=di.log_fileid and f.fdate BETWEEN :weekbefore AND :currdate) as float)*100 as decimal(7,2)),'%') AS total_weekly"
+ " from defect_instance di, defect d, log_file f" 
+ " where di.log_fileid=f.id and d.id=di.defectid and f.fdate BETWEEN :weekbefore AND :currdate "
+" group by d.severity" ,resultSetMapping = "WeeklyViewMapping3")
//--------------------------------------------------------------
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
