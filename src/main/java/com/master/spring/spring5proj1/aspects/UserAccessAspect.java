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

	/**
	 * NOTE: ASPECTS ONLY INTERCEPT BEANS
	 * 
	 * "@Before": We should tell the annotation what will it run on, it takes this
	 * pattern: execution(RETURN_TYPE PACKAGE.CLASS.METHOD(..)), an asterisk means
	 * any matches.
	 * 
	 * Notice that we can't refer to the package by an asterisk, we have to be
	 * specific about that; However, we can be more generic using 2 ways:
	 * 
	 * - If we replaced the final pkg with an asterisk, this will intercept any
	 * method on the same depth level.
	 * 
	 * - If we remoced the final pkg and left it's place empty like that "..", this
	 * will intercept any method on that level and deeper.
	 * 
	 * 
	 * TERMINOLOGIES:
	 * 
	 * - PointCut: The PointCut is the expression passed to eg.Before annotation,
	 * the interception point.
	 * 
	 * - Advice: Advice is the body of the eg.Before method, the logic we will do
	 * when we intercept a method.
	 * 
	 * - Aspect: The PointCut + Advice is an aspect, what to intercept and what to
	 * do when you intercept is the Aspect.
	 * 
	 * - JoinPoint: The JoinPoint is the point that we joined, the specific method
	 * that we intercepted it's call. If the PointCut matches 100 method, then there
	 * will be 1 PointCut and 100 JoinPoints.
	 * 
	 * @param joinPoint
	 */
	@Before("execution(* com.master.spring.spring5proj1..*.*(..))")
	public void before(JoinPoint joinPoint) {
		// Advise
		logger.info("Checking if the user has the previllage to access ..");
		logger.info("Intercepted method call: {}", joinPoint);
	}

}
