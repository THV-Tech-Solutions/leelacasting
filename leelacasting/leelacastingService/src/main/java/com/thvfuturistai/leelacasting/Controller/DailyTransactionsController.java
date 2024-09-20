package com.thvfuturistai.leelacasting.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thvfuturistai.leelacasting.Core.Response;
import com.thvfuturistai.leelacasting.Core.Response.StatusEnum;
import com.thvfuturistai.leelacasting.Service.DailyTransactionsService;
import com.thvfuturistai.leelacasting.dto.DailyTransactions;
import com.thvfuturistai.leelacasting.exception.LeelacastingServerException;

@RestController
//@RequestMapping("dialyTransactions")
public class DailyTransactionsController {
	 private static final Logger LOGGER = LoggerFactory.getLogger(DailyTransactionsController.class);
	    
	    
	    @Autowired
	    private DailyTransactionsService dailyTransactionsService;
	    
	    @PostMapping("/saveTodaysRecords")
		public ResponseEntity<Response<String>> saveTodaysRecords(@RequestBody DailyTransactions dailyTransactions) {
			try {
				LOGGER.info("Save todays record Start");
				String LoginResponse = dailyTransactionsService.saveTodaysRecords(dailyTransactions);
				LOGGER.info("Save todays record End");
				return new ResponseEntity<>(new Response<>(LoginResponse, StatusEnum.SUCCESS, "Data saved successfully "),
						HttpStatus.OK);
			} catch (IllegalArgumentException e) {
				LOGGER.error("Exception In Save todays record" + e.getMessage(), e);
				throw new IllegalArgumentException("Error saving data " + e.getMessage(), e);
			} catch (Exception e) {
				LOGGER.error("Exception In Save todays record " + e.getMessage(), e);
				throw new LeelacastingServerException(e.getMessage(), e);
			}
		}

	    @GetMapping("/getTodaysRecords")
		public ResponseEntity<Response<DailyTransactions>> getTodaysRecords(@RequestParam Long inputLogin) {
			try {
				LOGGER.info("Fetch todays record Start");
				DailyTransactions LoginResponse = dailyTransactionsService.getTodaysRecords(inputLogin);
				LOGGER.info("Fetch todays record End");
				return new ResponseEntity<>(new Response<>(LoginResponse, StatusEnum.SUCCESS, "Data fetched successfully "),
						HttpStatus.OK);
			} catch (IllegalArgumentException e) {
				LOGGER.error("Exception In Fetch todays record" + e.getMessage(), e);
				throw new IllegalArgumentException("Error fetching data " + e.getMessage(), e);
			} catch (Exception e) {
				LOGGER.error("Exception In Fetch todays record " + e.getMessage(), e);
				throw new LeelacastingServerException(e.getMessage(), e);
			}
		}

}
