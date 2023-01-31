package com.Sample.Test.Project.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="result")
public class Result {
	
	@Id
	@GeneratedValue
	private long rowNum;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="CODE_TYPE")
	private String codeType;
	
	@Column(name="USER_SCORE")
	private int userScore;
	
	@Column(name="RESULT_URL")
	private String resultUrl;
	
	@Column(name="RESULT02")
	private String result02;
	
	@Column(name="RESULT03")
	private String result03;
	
	@Column(name="RESULT04")
	private String result04;
	
	@Column(name="RESULT05")
	private String result05;
	
	@Column(name="RESULT06")
	private String result06;
	
	@Column(name="RESULT07")
	private String result07;
	
	@Column(name="RESULT08")
	private String result08;
	
	@Column(name="RESULT09")
	private String result09;
	
	@Column(name="RESULT10")
	private String result10;
	
	@Column(name="RESULT11")
	private String result11;
	
	@Column(name="RESULT12")
	private String result12;
	
	@Column(name="RESULT13")
	private String result13;
	
	@Column(name="RESULT14")
	private String result14;
	
	@Column(name="RESULT15")
	private String result15;
}
