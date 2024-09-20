package com.thvfuturistai.leelacasting.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thvfuturistai.leelacasting.dto.DailyTransactions;

public interface DailyTransactionsDAO extends JpaRepository<DailyTransactions, Long> {

}