package com.Sample.Test.Project.Repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sample.Test.Project.Entity.Quest;

@Repository
public interface QuestRepository extends JpaRepository<Quest, Long>  {
	Quest findAllByQuestCode(String questCode);
}
