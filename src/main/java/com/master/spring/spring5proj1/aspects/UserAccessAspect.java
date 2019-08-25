package com.master.spring.spring5proj1.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Before("execution(* com.master.spring.spring5proj1.business.*.*(..))")
	public void before(JoinPoint joinPoint) {
		logger.info("Checking if the user has the previllage to access ..");
		logger.info("Intercepted method call: {}", joinPoint);
	}

}
