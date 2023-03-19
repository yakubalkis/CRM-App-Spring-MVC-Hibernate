package com.luv2code.springdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {
	
	// setup logger
	private Logger myLogger = Logger.getLogger(getClass().getName());
	
	
	// setup pointcut declarations
	
	// add @Before advice
	
	// add @AfterReturning advice
	
	
}
