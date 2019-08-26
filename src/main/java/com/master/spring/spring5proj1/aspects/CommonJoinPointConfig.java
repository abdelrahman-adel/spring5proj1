package com.master.spring.spring5proj1.aspects;

import org.aspectj.lang.annotation.Pointcut;

/**
 * Rather than defining an explicit <code>PointCut</code> for every aspect, we
 * can define a method and give it an annotation <code>@PointCut</code> and give
 * it the value of the PointCut we want, and when we need to refer to it in the
 * <code>Aspect</code>, we give the Aspect the full qualified name of the
 * method.
 * 
 * @author aadel
 *
 */
public class CommonJoinPointConfig {

	/**
	 * Represents
	 * <code>execution(* com.master.spring.spring5proj1.data.*.*(..))</code>
	 */
	@Pointcut("execution(* com.master.spring.spring5proj1.data.*.*(..))")
	public void dataLayerExecution() {
	}

	/**
	 * Represents
	 * <code>execution(* com.master.spring.spring5proj1.business.*.*(..))</code>
	 */
	@Pointcut("execution(* com.master.spring.spring5proj1.business.*.*(..))")
	public void businessLayerExecution() {
	}

	/**
	 * Represents
	 * <code>execution(* com.master.spring.spring5proj1.data.*.*(..))</code> and
	 * <code>execution(* com.master.spring.spring5proj1.business.*.*(..))</code>
	 */
	@Pointcut("execution(* com.master.spring.spring5proj1.business.*.*(..)) "
			+ "&& execution(* com.master.spring.spring5proj1.data.*.*(..))")
	public void dataAndBusinessLayerExecution() {
	}

	/**
	 * Represents <code>bean(Dao*)</code>
	 */
	@Pointcut("bean(Dao*)")
	public void beansStartsWithDao() {
	}

	/**
	 * Represents <code>bean(*Dao)</code>
	 */
	@Pointcut("bean(*Dao)")
	public void beansEndsWithDao() {
	}

	/**
	 * Represents <code>bean(*Dao*)</code>
	 */
	@Pointcut("bean(*Dao*)")
	public void beansContainsDao() {
	}

	/**
	 * Represents <code>within(com.master.spring.spring5proj1.data..*)</code>
	 */
	@Pointcut("within(com.master.spring.spring5proj1.data..*)")
	public void withingDataLayer() {
	}

	/**
	 * Represents <code>within(com.master.spring.spring5proj1.data..*)</code>
	 */
	@Pointcut("within(com.master.spring.spring5proj1.business..*)")
	public void withingBusinessLayer() {
	}

	/**
	 * Represents
	 * <code>@annotation(com.master.spring.spring5proj1.aspects.TrackExecutionTime)</code>
	 * which refers to any method that has <code>TrackExecutionTime</code>
	 * annotation on it.
	 */
	@Pointcut("@annotation(com.master.spring.spring5proj1.aspects.TrackExecutionTime)")
	public void trackExecutionTimeAnnotation() {
	}

}
