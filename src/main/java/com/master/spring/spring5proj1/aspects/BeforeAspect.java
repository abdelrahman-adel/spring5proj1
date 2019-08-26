package com.master.spring.spring5proj1.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * Refer to <code>com.master.spring.spring5proj1.aspects.AfterAspect</code> for
 * more info about aspects.
 * 
 * @author aadel
 * 
 */
@Aspect
@Configuration
public class BeforeAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Before("com.master.spring.spring5proj1.aspects.CommonJoinPointConfig.dataLayerExecution()")
	public void before(JoinPoint joinPoint) {
		// Advice
		logger.trace("Before execution of: {}", joinPoint);
	}

}
