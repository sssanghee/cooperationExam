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
import com.Sample.Test.Project.Entity.RegisterUser;
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
	
	@PostMapping("/registerUser")
	public ResponseEntity<String> registerUser(@RequestBody RegisterUser params){
		String result = qAService.registerUser(params);
		switch(result) {
			case "success":
				return new ResponseEntity<>(result, HttpStatus.OK);
			
			default:
				return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
