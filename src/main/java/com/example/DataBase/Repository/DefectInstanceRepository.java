package com.example.DataBase.Repository;

import java.util.ArrayList;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.DataBase.domain.AppPercent;
import com.example.DataBase.domain.AppPercentApp;
import com.example.DataBase.domain.AppPercentSeverity;
import com.example.DataBase.domain.DefectInstance;
import com.example.DataBase.domain.SeverityPercent;
import com.example.DataBase.domain.SeverityPercentApp;
import com.example.DataBase.domain.SeverityPercentSeverity;
import com.example.DataBase.domain.ViewDefects;
import com.example.DataBase.domain.ViewDefectsApp;
import com.example.DataBase.domain.WeeklyView;


public interface DefectInstanceRepository extends CrudRepository<DefectInstance, Long>{

	
	@Query(nativeQuery = true)
	ArrayList<SeverityPercent> getSeverityPercent();

	@Query(nativeQuery = true)
	ArrayList<AppPercent> getAppPercent();
	
	@Query(nativeQuery = true)
	ArrayList<ViewDefects> getViewDefects(PageRequest pageRequest);
	
	ArrayList<ViewDefectsApp> getViewDefectsApp(@Param("appName") String appName,@Param("todayDate") String todayDate,@Param("limit") int limit,@Param("offset") int offset);
	//
	@Query(nativeQuery = true)
	ArrayList<SeverityPercentApp> getSeverityPercentApp(@Param("appName1") String appName1);
	
	@Query(nativeQuery = true)
	ArrayList<AppPercentApp> getAppPercentApp(@Param("appName2") String appName2);
	
	@Query(nativeQuery = true)
	ArrayList<ViewDefects> getViewDefectsSeverity(@Param("severityName") String severityName);
	
	@Query(nativeQuery = true)
	ArrayList<SeverityPercentSeverity> getSeverityPercentSeverity(@Param("severityName1") String severityName1);
	
	@Query(nativeQuery = true)
	ArrayList<AppPercentSeverity> getAppPercentSeverity(@Param("severityName2") String severityName2);
	
	@Query(nativeQuery = true)
	ArrayList<WeeklyView> getWeeklyView1(@Param("currdate") String currdate, @Param("weekbefore") String weekbefore);
	
	@Query(nativeQuery = true)
	ArrayList<WeeklyView> getWeeklyView2(@Param("currdate") String currdate, @Param("weekbefore") String weekbefore);
	@Query(nativeQuery = true)
	ArrayList<WeeklyView> getWeeklyView3(@Param("currdate") String currdate, @Param("weekbefore") String weekbefore);
}
