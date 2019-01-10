package com.example.DataBase.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.DataBase.domain.LogFile;

public interface LogFileRepository extends CrudRepository<LogFile, Long> {

}
