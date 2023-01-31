package com.Sample.Test.Project;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.Sample.Test.Project.Entity.Quest;
import com.Sample.Test.Project.Repository.QuestRepository;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
//@DataJpaTest
//@Slf4j
class JpaTest {
	
	@Autowired
	QuestRepository questRepository;
	
	
	@Test
	void findAllTest() {
		List<Quest> list = questRepository.findAll();
		for(Quest A : list) System.out.println("[findAll]: " + A.getQuest());
	}
}
