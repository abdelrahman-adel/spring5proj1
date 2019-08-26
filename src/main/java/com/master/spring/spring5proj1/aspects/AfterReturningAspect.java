package com.master.spring.spring5proj1.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
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
public class AfterReturningAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@AfterReturning(value = "com.master.spring.spring5proj1.aspects.CommonJoinPointConfig.dataAndBusinessLayerExecution()", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		// Advice
		logger.trace("After returning from: {} and returned: {}", joinPoint, result);
	}

}
