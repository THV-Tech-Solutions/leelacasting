package com.thvfuturistai.leelacasting.dto; 


import javax.persistence.Entity;
import javax.persistence.Table;

import com.thvfuturistai.leelacasting.domain.BaseDailyTransactions; 



@SuppressWarnings({ "serial"})
@Entity 
@Table (name="DAILYTRANSACTIONS")
public class DailyTransactions extends BaseDailyTransactions{
}