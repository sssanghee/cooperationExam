package com.Sample.Test.Project.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "codetype")
public class CodeType {
	
	@EmbeddedId
	private CodeTypeEmpId codeTypeEmlId;
	
}
