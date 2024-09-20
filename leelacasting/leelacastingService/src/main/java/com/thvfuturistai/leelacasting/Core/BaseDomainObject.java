package com.thvfuturistai.leelacasting.Core;

 
import java.util.Collection;
import java.util.List;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@MappedSuperclass
@JsonIgnoreProperties(value = { "keyField" })
public abstract class BaseDomainObject<KEY_TYPE> extends BaseSODto {

	private boolean hasValidationErrors = false;
	
	
	@Transient
	@JsonIgnore
	public abstract boolean isKeyNull();
	
	@Transient
	@JsonIgnore
	public abstract KEY_TYPE getId();
	
//	@Transient
//	@JsonIgnore
//	public abstract List<KeyField> getKeyField();
	
	protected void resetValidationMessages() {
		hasValidationErrors = false;
	}
	
	public void setHasValidationErrors(boolean validationErrors) {
		this.hasValidationErrors = validationErrors;
	}
	
	public boolean hasValidationErrors() {
		return hasValidationErrors;
	}

	public void setAuditFields() {
		
	}

	/**
	 * @return the validationMessages
	 */
	
	
//	public void afterClone(OBJECT_TYPE type){
//		
//	}
	
	public void validate(boolean validatePk) {
		
	}
	
}
