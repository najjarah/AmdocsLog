package com.example.DataBase.Repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.DataBase.domain.AppPercent;
import com.example.DataBase.domain.DefectInstance;
import com.example.DataBase.domain.SeverityPercent;
import com.example.DataBase.domain.ViewDefectsApp;


public interface DefectInstanceRepository extends CrudRepository<DefectInstance, Long>{

	
	@Query(nativeQuery = true)
	ArrayList<SeverityPercent> getSeverityPercent();

	@Query(nativeQuery = true)
	ArrayList<AppPercent> getAppPercent();
	
//	@Query(nativeQuery = true)
//	ArrayList<ViewDefectsApp> getViewDefectsApp();
}
