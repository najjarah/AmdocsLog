package com.example.DataBase.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.DataBase.domain.App;
import com.example.DataBase.domain.Defect;

public interface DefectRepository extends CrudRepository<Defect, Long>  {

	@Query(nativeQuery= true, value = "select * from defect d where d.error_code= ?1")
	List<Defect> checkDefectexist(String errorCode);
}
