package com.thvfuturistai.leelacasting.ServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thvfuturistai.leelacasting.Controller.DailyTransactionsController;
import com.thvfuturistai.leelacasting.Service.DailyTransactionsService;
import com.thvfuturistai.leelacasting.daoimpl.DailyTransactionsDAOHibernateImpl;
import com.thvfuturistai.leelacasting.dto.DailyTransactions;
import com.thvfuturistai.leelacasting.exception.LeelacastingServerException;

import jakarta.transaction.Transactional;

@Service
public class DailyTransactionsServiceImpl implements DailyTransactionsService {

	private static final Logger LOGGER = LoggerFactory.getLogger(DailyTransactionsController.class);

	@Autowired
	private DailyTransactionsDAOHibernateImpl dailyTransactionsDAO;

	@Override
	@Transactional
	public DailyTransactions getTodaysRecords(Long inputLogin) {

//		return dailyTransactionsDAO.findOneByProperty(BaseDailyTransactions.FIELD_dailyTransaction, inputLogin);
		return dailyTransactionsDAO.findById(inputLogin).get();
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
			throw new LeelacastingServerException("Error saving " + e.getMessage());
		}

		return "Succ";
	}

}
