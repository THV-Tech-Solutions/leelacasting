package com.thvfuturistai.leelacasting.daoimpl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thvfuturistai.leelacasting.dto.DailyTransactions;

@Repository
public interface DailyTransactionsDAOHibernateImpl extends JpaRepository<DailyTransactions, Long> {

}