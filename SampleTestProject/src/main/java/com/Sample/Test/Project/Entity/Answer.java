package com.Sample.Test.Project.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="answer")
public class Answer {
	
	@Id
	private String answerCode;
	
	@Column(name="QUEST_CODE")
	private String questCode;
	
	@Column(name="ANSWER")
	private String answer;
	
	@Column(name="SCORE")
	private int score;
}
