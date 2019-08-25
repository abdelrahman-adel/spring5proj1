package com.master.spring.spring5proj1.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.spring.spring5proj1.data.Dao2;

@Service
public class Business2 {

	@Autowired
	Dao2 dao2;

	public String calculateSomething() {
		// Some logic
		return "Business2 " + dao2.retrieveSomething();
	}
}
