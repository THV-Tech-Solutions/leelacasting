package com.thvfuturistai.leelacasting.daoimpl;

import java.util.Collection;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.thvfuturistai.leelacasting.Core.DAOResult;
import com.thvfuturistai.leelacasting.dao.DailyTransactionsDAO;
import com.thvfuturistai.leelacasting.dto.DailyTransactions;

import jakarta.transaction.Transactional;

@Repository
public class DailyTransactionsDAOHibernateImpl implements DailyTransactionsDAO{

	@Override
	public Collection<DailyTransactions> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DailyTransactions findById(Long key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DailyTransactions> findByProperty(String propertyName, Object propertyValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DailyTransactions findOneByProperty(String propertyName, Object propertyValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DailyTransactions> findByPropertyValues(String propertyName, List propertyValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(DailyTransactions type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Collection<DailyTransactions> types) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DAOResult<DailyTransactions, Long> saveWithRetry(Collection<DailyTransactions> types) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(DailyTransactions object) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Collection<DailyTransactions> object) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String test(String inputLogin) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	

//	extends BaseDailyTransactionsDAOHibernate
	
	
	
	
}