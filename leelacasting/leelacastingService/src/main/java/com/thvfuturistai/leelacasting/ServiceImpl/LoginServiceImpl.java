package com.thvfuturistai.leelacasting.ServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thvfuturistai.leelacasting.Controller.LoginController;
import com.thvfuturistai.leelacasting.Service.LoginService;
import com.thvfuturistai.leelacasting.dao.DailyTransactionsDAO;

import jakarta.transaction.Transactional;


@Service
public class LoginServiceImpl implements LoginService{
	
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
    
    
    @Autowired
    private DailyTransactionsDAO dailyTransactionsDAO;


	@Override
	public String test(String inputLogin) {
 		return dailyTransactionsDAO.test(inputLogin);
	}


	

}
