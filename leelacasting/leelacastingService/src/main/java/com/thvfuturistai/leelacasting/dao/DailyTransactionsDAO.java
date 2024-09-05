package com.thvfuturistai.leelacasting.dao; 

import com.thvfuturistai.leelacasting.Core.IDAO;
import com.thvfuturistai.leelacasting.dto.DailyTransactions;

public interface DailyTransactionsDAO extends IDAO<DailyTransactions,Long >{

	String test(String inputLogin);


}