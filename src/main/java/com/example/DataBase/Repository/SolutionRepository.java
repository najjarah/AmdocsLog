package com.example.DataBase.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.example.DataBase.domain.Solution;

public interface SolutionRepository extends CrudRepository<Solution, Long> {

	@Query(nativeQuery= true, value = "select * from solution s where s.sname= ?1 AND s.description= ?2  ")
	List<Solution> checkSolexist(String name, String description);

}
