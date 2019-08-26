package com.master.spring.spring5proj1.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
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
public class AfterThrowingAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@AfterThrowing(pointcut = "com.master.spring.spring5proj1.aspects.CommonJoinPointConfig.dataLayerExecution()", throwing = "result")
	public void afterThrowing(JoinPoint joinPoint, Exception result) {
		// Advice
		logger.trace("After throwing from: {} and Exception thrown: {}", joinPoint, result);
	}

}
