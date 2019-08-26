package com.master.spring.spring5proj1.data;

import org.springframework.stereotype.Repository;

import com.master.spring.spring5proj1.aspects.TrackExecutionTime;

@Repository
public class Dao2 {

	@TrackExecutionTime
	public String retrieveSomething() {
		return "Dao2";
	}
}
