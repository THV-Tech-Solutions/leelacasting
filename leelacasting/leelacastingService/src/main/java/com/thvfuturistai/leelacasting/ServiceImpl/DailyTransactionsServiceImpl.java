package com.thvfuturistai.leelacasting.ServiceImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thvfuturistai.leelacasting.Controller.DailyTransactionsController;
import com.thvfuturistai.leelacasting.Service.DailyTransactionsService;
import com.thvfuturistai.leelacasting.dao.DailyTransactionsDAO;
import com.thvfuturistai.leelacasting.domain.BaseDailyTransactions;
import com.thvfuturistai.leelacasting.dto.DailyTransactions;
import com.thvfuturistai.leelacasting.exception.LeelacastingServerException;

import jakarta.transaction.Transactional;

@Service
public class DailyTransactionsServiceImpl implements DailyTransactionsService{
	
	 private static final Logger LOGGER = LoggerFactory.getLogger(DailyTransactionsController.class);

	
	@Autowired
	private DailyTransactionsDAO dailyTransactionsDAO;
	
	
	@Autowired
    private SessionFactory sessionFactory;

	@Override
	@Transactional
	public DailyTransactions getTodaysRecords(String inputLogin) {
		// TODO Auto-generated method stub
		return dailyTransactionsDAO.findOneByProperty(BaseDailyTransactions.FIELD_dailyTransaction, inputLogin);
	}

	@Override
	@Transactional
	public String saveTodaysRecords(DailyTransactions dailyTransactions) {
		// TODO Auto-generated method stub
		try {
			LOGGER.info("Save todays record Start");
//			Session session = sessionFactory.getCurrentSession();
			dailyTransactionsDAO.save(dailyTransactions);
			LOGGER.info("Save todays record End");

		} catch (Exception e) {
			throw new LeelacastingServerException("Error saving ailments " + e.getMessage());
		}
		
		 return "Succ";
	}
	
	

}
