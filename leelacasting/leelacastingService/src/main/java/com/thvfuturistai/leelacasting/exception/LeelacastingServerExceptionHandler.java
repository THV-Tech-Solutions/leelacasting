package com.thvfuturistai.leelacasting.exception;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.thvfuturistai.leelacasting.Core.Response;
import com.thvfuturistai.leelacasting.Core.Response.StatusEnum;

@RestControllerAdvice
public class LeelacastingServerExceptionHandler {

	private static Logger logger = LoggerFactory.getLogger(LeelacastingServerExceptionHandler.class);
	
	
	// @Autowired
	// private AppProperties appProperties;
	
	// @Autowired
	// private LoggingService loggingService;
	
	@ExceptionHandler(value = LeelacastingServerException.class)
	public ResponseEntity<Response<String>> handleGenericException(LeelacastingServerException dse, Exception ex) {
		Response<String> response = new Response<>();
		response.setMessage(dse.getMessage());
		response.setStatus(StatusEnum.FAILURE.name());
	//	loggingService.sendErrorMessageMail(mailProperties, "Exception in Doctor", appProperties.getSmtp().getErrorMessageEmail(), ex);
		logger.error(dse.getMessage(), ex);
		
		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	} 

	@ExceptionHandler(value = IllegalRequestException.class)
	public ResponseEntity<Response<String>> handleIllegalRequestException(IllegalRequestException dse) {
		Response<String> response = new Response<>();
		response.setMessage(dse.getMessage());
		response.setStatus(StatusEnum.FAILURE.name());
		
		//loggingService.sendErrorMessageMail(mailProperties, "Exception in Doctor", appProperties.getSmtp().getErrorMessageEmail(), dse);
		logger.error(dse.getMessage(), dse);
		
	
		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	} 
	
	@ExceptionHandler(value = IllegalArgumentException.class)
	public ResponseEntity<Response<String>> handleIllegalRequestException(IllegalArgumentException dse) {
		Response<String> response = new Response<>();
		response.setMessage(dse.getMessage());
		response.setStatus(StatusEnum.FAILURE.name());
		
		//loggingService.sendErrorMessageMail(mailProperties, "Exception in Doctor", appProperties.getSmtp().getErrorMessageEmail(), dse);
		logger.error(dse.getMessage(), dse);
		
		
		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	} 

}

