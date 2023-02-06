package com.Sample.Test.Project.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class CodeTypeKey implements Serializable {
	
	@Column(name="CODE_TYPE")
	private String codeType;
	
	@Column(name="CODE_DETAIL")
	private String codeDetail;
}
