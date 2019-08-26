package com.master.spring.spring5proj1.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.master.spring.spring5proj1.business.Business1;
import com.master.spring.spring5proj1.business.Business2;
import com.master.spring.spring5proj1.data.data.InnerDao;
import com.master.spring.spring5proj1.data.data.SomeClass;

@ComponentScan(basePackages = "com.master.spring.spring5proj1")
@SpringBootApplication
public class Spring5proj1Application implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private SomeClass SomeClass = new SomeClass();

	@Autowired
	private InnerDao innerDao;

	@Autowired
	private Business1 business1;

	@Autowired
	private Business2 business2;

	public static void main(String[] args) {
		SpringApplication.run(Spring5proj1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(business1.calculateSomething());
		logger.info(business2.calculateSomething());
		logger.info(innerDao.retrieveData());
		logger.info(SomeClass.saySomething());
		innerDao.noDataRetrieval();
	}

}
