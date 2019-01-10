package com.example.DataBase.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AppRepository extends CrudRepository<App, Long>  {
	
	/*@Query("select a from App a where a.name = ?1")
	List<App> findByName(String name);
	
	List<App> findByType(String type);

	List<App> findByNameAndType(String name, String type);*/

}
