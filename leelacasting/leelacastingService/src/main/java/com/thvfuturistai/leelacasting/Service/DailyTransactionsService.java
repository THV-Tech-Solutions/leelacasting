package com.thvfuturistai.leelacasting.Service;

import com.thvfuturistai.leelacasting.dto.DailyTransactions;

public interface DailyTransactionsService {

	DailyTransactions getTodaysRecords(Long inputLogin);

	String saveTodaysRecords(DailyTransactions dailyTransactions);

}
