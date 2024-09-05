package com.thvfuturistai.leelacasting.Core;
 
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface ISODto {
//	public Object[] getAttrValues();
	@JsonIgnore
	public Map<String, Object> getParams(); 
	
	public void validate(boolean validatePk);
}
