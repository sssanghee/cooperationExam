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
@Table(name="quest")
public class Quest {
	
	@Id
	private String questCode;
	
	@Column(name="CODE_TYPE")
	private String codeType;
		
	@Column(name="QUEST")
	private String quest;
	
	@Column(name="IMG_URL")
	private String imgUrl;
}
