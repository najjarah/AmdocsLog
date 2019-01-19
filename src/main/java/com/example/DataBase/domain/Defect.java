package com.example.DataBase.domain;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

@Entity
public class Defect {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
  
	private String severity, errorCode;
   
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idsolution")
    private Solution solution;
    
    
    @OneToMany(cascade = CascadeType.ALL ,fetch = FetchType.LAZY, mappedBy = "defect")
    private List<DefectInstance> defects;
    

    //-----------------------------------------Constructors---------------------------------------------------
  
    public Defect() {}

    public Defect(String Severity, String errorCode) {
      super();
      this.severity = Severity;
      this.errorCode = errorCode;
    
    }

    //-----------------------------------------getters and setters---------------------------------------------
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Solution getSolution() {
		return solution;
	}

	public void setSolution(Solution solution) {
		this.solution = solution;
	}

	public List<DefectInstance> getDefects() {
		return defects;
	}

	public void setDefects(List<DefectInstance> defects) {
		this.defects = defects;
	}

	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	
//----------------------------------------------------------@Override-----------------------------------------------------------------
	
//	@Override
//  public boolean equals(Object object)
//  {
//      boolean sameSame = false;
//
//      if (object != null && object instanceof Defect)
//      {
//          sameSame = this.getErrorCode() == ((Defect) object).getErrorCode();
//      }
//
//      return sameSame;
  //}

}
