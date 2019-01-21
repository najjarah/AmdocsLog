package com.example.DataBase.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.example.DataBase.domain.LogFile;

public interface LogFileRepository extends CrudRepository<LogFile, Long> {

	
	@Query(nativeQuery= true, value = "select * from log_file logf where logf.name= ?1")
	List<LogFile> checkLogexist(String name);
}
