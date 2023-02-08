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
import com.Sample.Test.Project.Entity.Result;
import com.Sample.Test.Project.Entity.Params.RegisterUser;
import com.Sample.Test.Project.Repository.AnswerRepository;
import com.Sample.Test.Project.Repository.CodeTypeRepository;
import com.Sample.Test.Project.Repository.QuestRepository;
import com.Sample.Test.Project.Repository.ResultRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
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
	
	//문제유형 보내주기
	public List<CodeType> getQuestList() {		
		return codeTypeRepository.findAll();
	}
	
	//사용자 등록하기
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
	
	//다음/ 이전문제 보내주기
	public Map<String, Object> getPrevNextQuest(String questType, int questNum, String prevOrNext, long userNum){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		String questName = questType;
		String resultColumn = "RESULT";
		if(prevOrNext == "prev") {
			questNum -= 1;
		}else {
			questNum += 1;
		}
		
		if((int)(Math.log10(questNum)+1) == 1) {
			questName += "0" + questNum;
			resultColumn += "0" + questNum;
		}else {
			questName += questNum;
			resultColumn += questNum;
		}
		System.out.println(resultColumn);
		System.out.println(userNum);
		
		Quest quest = questRepository.findByQuestCode(questName);
		List<Answer> answer = answerRepository.findAllByQuestCode(questName);
		
		String selectQry = "SELECT " + resultColumn + " FROM RESULT WHERE ROWNUM = " + userNum;
//		String isChecked = resultRepository.selectResultValById(resultColumn, userNum);

				
		
		
		resultMap.put("quest", quest);
		resultMap.put("answer", answer);
//		resultMap.put("isChecked", isChecked); 
		
		return resultMap;
	}
	
}
