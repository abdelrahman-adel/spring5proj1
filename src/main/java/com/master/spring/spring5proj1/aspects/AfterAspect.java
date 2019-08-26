package com.master.spring.spring5proj1.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * <strong>NOTE: ASPECTS ONLY INTERCEPT BEANS</strong><br/>
 * <br/>
 * 
 * "@Before": We should tell the annotation what will it run on, it takes this
 * pattern: execution(RETURN_TYPE PACKAGE.CLASS.METHOD(..)), an asterisk means
 * any matches.<br/>
 * <br/>
 * 
 * Notice that we can't refer to the package by an asterisk, we have to be
 * specific about that; However, we can be more generic using 2 ways:<br/>
 * 
 * - If we replaced the final pkg with an asterisk, this will intercept any
 * method on the same depth level.<br/>
 * 
 * - If we remoced the final pkg and left it's place empty like that "..", this
 * will intercept any method on that level and deeper.<br/>
 * <br/>
 * 
 * 
 * <strong>TERMINOLOGIES:</strong><br/>
 * <br/>
 * 
 * <strong>- PointCut:</strong> The PointCut is the expression passed to
 * eg.Before annotation, the interception point.<br/>
 * <br/>
 * 
 * <strong>- Advice:</strong> Advice is the body of the eg.Before method, the
 * logic we will do when we intercept a method.<br/>
 * <br/>
 * 
 * <strong>- Aspect:</strong> The PointCut + Advice is an aspect, what to
 * intercept and what to do when you intercept is the Aspect.<br/>
 * <br/>
 * 
 * <strong>- JoinPoint:</strong> The JoinPoint is the point that we joined, the
 * specific method that we intercepted it's call. If the PointCut matches 100
 * method, then there will be 1 PointCut and 100 JoinPoints.<br/>
 * <br/>
 * 
 * <strong>- Weaving:</strong> The process that scans the application according
 * to the PointCut and making sure that this method will run at the right time
 * is called weaving. The process that implements AOP in the application is
 * called weaving.<br/>
 * <br/>
 * 
 * <strong>- Weaver:</strong> The framework that does the weaving, that
 * implements the weaving is called weaver.<br/>
 * 
 * @author aadel
 * 
 */
@Aspect
@Configuration
public class AfterAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@After("execution(* com.master.spring.spring5proj1.business.*.*(..))")
	public void afterReturning(JoinPoint joinPoint) {
		// Advice
		logger.trace("After execution of: {}", joinPoint);
	}

}
