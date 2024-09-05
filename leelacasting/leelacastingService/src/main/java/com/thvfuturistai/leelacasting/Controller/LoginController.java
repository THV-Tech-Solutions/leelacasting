//package com.thvfuturistai.leelacasting.Controller;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.thvfuturistai.leelacasting.Core.Response;
//import com.thvfuturistai.leelacasting.Core.Response.StatusEnum;
//import com.thvfuturistai.leelacasting.Service.LoginService;
//import com.thvfuturistai.leelacasting.exception.LeelacastingServerException;
//
//@RestController
//public class LoginController {
//
//    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
//    
//    
//    @Autowired
//    private LoginService loginService;
//
//    @GetMapping("/test")
//	public ResponseEntity<Response<String>> test(@RequestParam String inputLogin) {
//		try {
//			LOGGER.info("Fetch Appointment by AppointmentId Start");
//			String LoginResponse = loginService.test(inputLogin);
//			LOGGER.info("Fetch Appointment by AppointmentId End");
//			return new ResponseEntity<>(new Response<>(LoginResponse, StatusEnum.SUCCESS, "Data fetched successfully "),
//					HttpStatus.OK);
//		} catch (IllegalArgumentException e) {
//			LOGGER.error("Exception In Fetch Appointment by AppointmentId  " + e.getMessage(), e);
//			throw new IllegalArgumentException("Error fetching data " + e.getMessage(), e);
//		} catch (Exception e) {
//			LOGGER.error("Exception In Fetch Appointment by AppointmentId  " + e.getMessage(), e);
//			throw new LeelacastingServerException(e.getMessage(), e);
//		}
//
//	}
//}
