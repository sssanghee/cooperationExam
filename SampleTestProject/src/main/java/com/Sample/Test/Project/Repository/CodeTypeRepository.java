package com.Sample.Test.Project.Repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sample.Test.Project.Entity.CodeType;

@Repository
public interface CodeTypeRepository extends JpaRepository<CodeType, Long> {

}
