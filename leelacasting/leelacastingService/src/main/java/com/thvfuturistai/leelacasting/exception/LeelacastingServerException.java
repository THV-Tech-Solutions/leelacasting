package com.thvfuturistai.leelacasting.exception;

public class LeelacastingServerException extends RuntimeException{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 9040873251432335105L;
	
	public LeelacastingServerException(String message, Exception ex) {
		super(message, ex);
	}
	
	public LeelacastingServerException(String message) {
		super(message);
	}
}
