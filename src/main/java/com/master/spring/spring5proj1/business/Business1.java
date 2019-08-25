package com.master.spring.spring5proj1.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.spring.spring5proj1.data.Dao1;

@Service
public class Business1 {

	@Autowired
	Dao1 dao1;

	public String calculateSomething() {
		// Some logic
		return "Business1 " + dao1.retrieveSomething();
	}
}
