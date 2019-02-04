package com.example.DataBase.Repository;

import java.util.ArrayList;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.DataBase.domain.AppPercent;
import com.example.DataBase.domain.AppPercentApp;
import com.example.DataBase.domain.DefectInstance;
import com.example.DataBase.domain.SeverityPercent;
import com.example.DataBase.domain.SeverityPercentApp;
import com.example.DataBase.domain.ViewDefects;
import com.example.DataBase.domain.ViewDefectsApp;


public interface DefectInstanceRepository extends CrudRepository<DefectInstance, Long>{

	
	@Query(nativeQuery = true)
	ArrayList<SeverityPercent> getSeverityPercent();

	@Query(nativeQuery = true)
	ArrayList<AppPercent> getAppPercent();
	
	@Query(nativeQuery = true)
	ArrayList<ViewDefects> getViewDefects();
	
	@Query(nativeQuery = true)
	ArrayList<ViewDefectsApp> getViewDefectsApp(@Param("appName") String appName);
	//
	@Query(nativeQuery = true)
	ArrayList<SeverityPercentApp> getSeverityPercentApp(@Param("appName1") String appName1);
	
	@Query(nativeQuery = true)
	ArrayList<AppPercentApp> getAppPercentApp(@Param("appName2") String appName2);
}