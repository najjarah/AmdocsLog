package com.example.DataBase.Repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.DataBase.domain.DefectInstance;
import com.example.DataBase.domain.ViewDefects;

@RepositoryRestResource
public interface ViewDefectsRepository extends PagingAndSortingRepository<DefectInstance, Long>{
	
	@Query(nativeQuery = true)
	ArrayList<ViewDefects> getViewDefects();
	
}
 


