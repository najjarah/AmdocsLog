package com.example.DataBase.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.DataBase.domain.Defect;

public interface DefectRepository extends CrudRepository<Defect, Long>  {
		
}
