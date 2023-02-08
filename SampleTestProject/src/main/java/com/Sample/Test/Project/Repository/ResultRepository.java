package com.Sample.Test.Project.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Sample.Test.Project.Entity.Result;

import jakarta.persistence.Entity;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long>  {
	
	@Query(value = "SELECT :resultColumn FROM RESULT WHERE ROWNUM = :userNum", nativeQuery = true)
	public String selectResultValById(@Param(value = "resultColumn") String resultColumn,
								   @Param(value = "userNum") long userNum);			
										
}
