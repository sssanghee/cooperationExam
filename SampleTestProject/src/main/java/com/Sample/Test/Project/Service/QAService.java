package com.Sample.Test.Project.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sample.Test.Project.Entity.Answer;
import com.Sample.Test.Project.Entity.CodeType;
import com.Sample.Test.Project.Entity.Quest;
import com.Sample.Test.Project.Entity.RegisterUser;
import com.Sample.Test.Project.Entity.Result;
import com.Sample.Test.Project.Repository.AnswerRepository;
import com.Sample.Test.Project.Repository.CodeTypeRepository;
import com.Sample.Test.Project.Repository.QuestRepository;
import com.Sample.Test.Project.Repository.ResultRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QAService {

	@Autowired
	CodeTypeRepository codeTypeRepository;
	
	@Autowired
	QuestRepository questRepository;
	
	@Autowired
	AnswerRepository answerRepository;
	
	@Autowired
	ResultRepository resultRepository;
	
	public List<CodeType> getQuestList() {		
		return codeTypeRepository.findAll();
	}
	
	public String registerUser(RegisterUser params) {
		
		try {
			String userName = params.getUserName();
			String userQuestType = params.getQuestCode();
			
			Result result = Result.builder().userName(userName).codeType(userQuestType).build();
			resultRepository.save(result);
			
			return "success";
			
		} catch(Exception e) {
			e.printStackTrace();
			return "fail";
		}
		
	}
	
	
}
