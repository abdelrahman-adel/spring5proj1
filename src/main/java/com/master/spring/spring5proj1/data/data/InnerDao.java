package com.master.spring.spring5proj1.data.data;

import org.springframework.stereotype.Repository;

@Repository
public class InnerDao {

	public String retrieveData() {
		return "InnerDao";
	}
}
