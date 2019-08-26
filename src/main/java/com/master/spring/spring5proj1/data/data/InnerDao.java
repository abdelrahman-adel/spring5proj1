package com.master.spring.spring5proj1.data.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.master.spring.spring5proj1.aspects.TrackExecutionTime;

@Repository
public class InnerDao {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@TrackExecutionTime
	public String retrieveData() {
		return "InnerDao.retrieveData()";
	}

	@TrackExecutionTime
	public void noDataRetrieval() {
		logger.info("noDataRetrieval()");
	}
}
