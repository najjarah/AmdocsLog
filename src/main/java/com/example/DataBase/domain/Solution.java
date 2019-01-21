package com.example.DataBase.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Solution {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "solution")
    private List<Defect> defects;
	
	String sname;
	String description;

//-------------------------------------------------constructors-------------------------------------------------------------------------
	
	public Solution() { }
	
	
	public Solution(String name, String description) {
		super();
		this.sname = name;
		this.description = description;
	}
	

//-------------------------------------------------getters and setters-------------------------------------------------------------------------
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return sname;
	}

	public void setName(String name) {
		this.sname = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
