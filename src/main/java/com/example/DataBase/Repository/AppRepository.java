package com.example.DataBase.Repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NamedNativeQuery;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.DataBase.domain.App;

public interface AppRepository extends CrudRepository<App, Long>  {
	
	
//	@Query(nativeQuery = true)
//	ArrayList<App> checkAppexist(@Param("appName") String appName,@Param("appType") String appType);

//	@NamedNativeQuery(name = "App.checkAppexist", 
//			query = "select *"
//			+ "from app ap"
//			+ "where ap.name=:appName AND ap.type= :appType ")

	@Query(nativeQuery= true, value = "select * from app ap where ap.name= ?1 AND ap.type= ?2  ")
	List<App> checkAppexist(String name, String type);
	
//	List<App> findByType(String type);
//
//	List<App> findByNameAndType(String name, String type);

}
