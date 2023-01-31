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
import com.Sample.Test.Project.Entity.NextQuestParam;
import com.Sample.Test.Project.Entity.Quest;
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
	
//	public List<Map<String, Object>> getNextQuest(String questId){
//
//		List<Map<String, Object>> result = new ArrayList<>();
//		Map<String, Object> resultMap = new HashMap<>();
//		
//		Quest quest = questRepository.findAllByQuestCode(questId);
//		resultMap.put("QUEST", quest);
//		
//		List<Answer> answer = answerRepository.findAllByQuestCode(questId);
//		resultMap.put("answer", answer);
//		
//		result.add(resultMap);
//		
//		return result;
//	}
					/*param : {
						name: 00000,
						questCode : A01,
						answerCode : A0101,
						
					
					
					}
					*/
	public List<Map<String, Object>> getNextQuest(NextQuestParam memberInfo){
		
//		if(memberInfo.getAnswerCode().toString().equals("start")) {
//			//첫 다음 클릭, 회원정보 인서트
//		} else if(memberInfo.getAnswerCode().toString().equals("end")) {
//			//마지막 다음클릭 === 결과창 보여줌
//		} else {
//			//그냥 다음클릭 누를 때,
//			//이전버튼을 클릭한 다음 누른 다음 버튼인지 ( 답을 체크한적 있는지 없는 지 체크해야됌 )
//		}
				
		List<Map<String, Object>> result = new ArrayList<>();
		Map<String, Object> resultMap = new HashMap<>();
		
		Quest quest = questRepository.findAllByQuestCode(memberInfo.getUserName().toString());
		resultMap.put("QUEST", quest);
		
		List<Answer> answer = answerRepository.findAllByQuestCode(memberInfo.getUserName().toString());
		resultMap.put("answer", answer);
		
		result.add(resultMap);
		
		return result;
	}
	
//	public List<Map<String, Object>> getPrevQuest(String questId){
//		
//		List<Map<String, Object>> result = new ArrayList<>();
//		Map<String, Object> resultMap = new HashMap<>();
//		
//		
//	}
	
	
}
