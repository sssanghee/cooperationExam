package com.Sample.Test.Project.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
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
