package com.example.DataBase.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.DataBase.domain.App;

public interface AppRepository extends CrudRepository<App, Long>  {
	
	/*
	@Query("SELECT a.id FROM app a WHERE a.name = ?1 and a.type = ?2 ")
	List<App> findByName(String name, String type);
	
	List<App> findByType(String type);

	List<App> findByNameAndType(String name, String type);
*/
}
