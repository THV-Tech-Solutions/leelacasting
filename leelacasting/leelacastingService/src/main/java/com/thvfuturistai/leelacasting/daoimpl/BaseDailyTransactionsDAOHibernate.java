package com.thvfuturistai.leelacasting.daoimpl;

import com.thvfuturistai.leelacasting.dao.DailyTransactionsDAO;
import com.thvfuturistai.leelacasting.dao.hibernate.BaseHibernateDAO;
import com.thvfuturistai.leelacasting.dto.DailyTransactions;

/**
 * @author Generated Code - Please DO NOT MODIFY.
 * */
public abstract class BaseDailyTransactionsDAOHibernate extends BaseHibernateDAO<DailyTransactions, Long> implements DailyTransactionsDAO {
	private static final String TABLE_CLASS = "DailyTransactions";
	
	/* (non-Javadoc)
	 * @see com.vcube.dataaccess.dao.hibernate.BaseHibernateDAO#getTableClassName()
	 */
	@Override
	public String getTableClassName() {
		return TABLE_CLASS;
	}
	
	/* (non-Javadoc)
	 * @see com.vcube.dataaccess.dao.hibernate.BaseHibernateDAO#getTableClass()
	 */
	@Override
	public Class<DailyTransactions> getTableClass() {
		return DailyTransactions.class;
	}
	
		
//	/* (non-Javadoc)
//	 * @see com.vcube.dataaccess.dao.hibernate.IHibernateDAO#getCriteria()
//	 */
//	public Criteria getCriteria() {
//		return super.getCriteria(DailyTransactions.class);
//	}
}
