package com.packt.DataBase.domain;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class Defect {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
  
	private String severity, errorCode;
   
    private long idSolution;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "app")
    private App app;

    //-----------------------------------------Constructors---------------------------------------------------
  
    public Defect() {}

    public Defect(String Severity, String errorCode, long idSolution) {
      super();
      this.severity = Severity;
      this.errorCode = errorCode;
      this.idSolution = idSolution;
    
    }

    //-----------------------------------------getters and setters---------------------------------------------
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		severity = severity;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public long getIdSolution() {
		return idSolution;
	}
	public void setIdSolution(long idSolution) {
		this.idSolution = idSolution;
	}

}
