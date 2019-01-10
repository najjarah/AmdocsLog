package com.example.DataBase.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.DataBase.domain.App;

public interface AppRepository extends CrudRepository<App, Long>  {
	
	/*@Query("select a from App a where a.name = ?1")
	List<App> findByName(String name);
	
	List<App> findByType(String type);

	List<App> findByNameAndType(String name, String type);*/

}
