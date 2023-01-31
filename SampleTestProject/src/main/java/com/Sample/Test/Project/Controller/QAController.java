package com.Sample.Test.Project.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Sample.Test.Project.Entity.CodeType;
import com.Sample.Test.Project.Entity.NextQuestParam;
import com.Sample.Test.Project.Service.QAService;

@RestController
public class QAController {

	@Autowired
	QAService qAService;
	
	@GetMapping("/getQuestType")
	public ResponseEntity<List<CodeType>> getQuestType(){ 
		try {
			return new ResponseEntity<>(qAService.getQuestList(), HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);			
		}
	}
	
//	@GetMapping("/getNext/{questId}")
//	public ResponseEntity<List<Map<String, Object>>> getNextQuest(@PathVariable("questId") String questId){
//		try {
//			System.out.println(questId);
//			return new ResponseEntity<>(qAService.getNextQuest(questId), HttpStatus.OK);
//		} catch(Exception e) {
//			e.printStackTrace();
//			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);			
//		}
//	}
	
	@PostMapping("/getNext")
	public ResponseEntity<List<Map<String, Object>>> getNextQuest(@RequestBody NextQuestParam memberInfo){
		try {
			System.out.println(memberInfo);
			return new ResponseEntity<>(qAService.getNextQuest(memberInfo), HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);			
		}
	}
	
	
//	@GetMapping("/getPrev/{questId}")
//	public ResponseEntity<List<Map<String, Object>>> getPrevQuest(@PathVariable("questId") String questId){
//		try {
//			System.out.println(questId);
//			return new ResponseEntity<>(qAService.getPrevQuest(questId), HttpStatus.OK);
//		} catch(Exception e) {
//			e.printStackTrace();
//			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);			
//		}		
//	}
}
