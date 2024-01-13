package com.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspects
{
	@After("execution(* com.demo.*.*.*(..))")
	public void addPoint()
	{
		System.out.println("points added");
	}
	
	@Before("execution (* com.demo.*.*.g(..))")
	public void welcome()
	{
		System.out.println("Welcome in game zone");
	}
	
	@After("execution (* com.demo.*.*.*(int))")
	public void logFile()
	{
		System.out.println("logged filed enterted");
	}
	
	@Around("execution(* com.demo.*.*.*(..))")
	public Object arondAdvice(ProceedingJoinPoint  joinPoint)
	{
		System.out.println("game started");
		System.out.println("points are adding");
		
		Object ob=null;
		try {
			ob = joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch blocks
			e.printStackTrace();
		}
		
		System.out.println("record calculated");
		return ob;
		
	}
}
