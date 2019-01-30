package com.example.DataBase.Repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.DataBase.domain.DefectInstance;
import com.example.DataBase.domain.ViewDefects;
import com.example.DataBase.domain.ViewDefectsApp;

public interface ViewDefectsRepository extends PagingAndSortingRepository<DefectInstance, Long>{
	
	@Query(nativeQuery = true)
	ArrayList<ViewDefects> getViewDefects();
	
	@Query(nativeQuery = true)
	ArrayList<ViewDefectsApp> getViewDefectsApp();
}
 


