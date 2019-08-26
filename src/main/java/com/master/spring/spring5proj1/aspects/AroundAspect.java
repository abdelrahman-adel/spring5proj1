package com.master.spring.spring5proj1.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
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
public class AroundAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * The method annotated with <code>@Around</code>, intercepts the the call of
	 * the JoinPoint and get's the control over when to proceed with the body of it,
	 * and what to return. The <code>proceed()</code> method is to proceed with the
	 * method body, and <code>proceed()</code>'s returned object is the method
	 * returned object.
	 * 
	 * Here we're tracking the performance of any method that have the annotation
	 * <code>TrackExecutionTime</code>
	 * 
	 * @param proceedingJoinPoint
	 * @return
	 * @throws Throwable
	 */
	@Around("com.master.spring.spring5proj1.aspects.CommonJoinPointConfig.trackExecutionTimeAnnotation()")
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		logger.info("Before advice of: {}", proceedingJoinPoint);

		Object returnedObj = proceedingJoinPoint.proceed();

		long timeTaken = System.currentTimeMillis() - startTime;
		logger.info("After advice, time taken: {}", timeTaken);
		return returnedObj + " from Around";
	}

}
