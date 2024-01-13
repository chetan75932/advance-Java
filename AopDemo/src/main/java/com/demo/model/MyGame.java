package com.demo.model;

import org.springframework.stereotype.Component;

@Component
public class MyGame
{
	public void m1()
	{
		System.out.println("in m1 method");
	}
	
	public void m2(int n)
	{
		System.out.println("in m2 method "+n);
	}
	
	public void m3()
	{
		System.out.println("in m3 method");
	}
}
