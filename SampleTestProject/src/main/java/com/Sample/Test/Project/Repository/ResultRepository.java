package com.Sample.Test.Project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sample.Test.Project.Entity.Result;

import jakarta.persistence.Entity;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long>  {

}
