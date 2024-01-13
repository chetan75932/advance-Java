package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.MyGame;

public class TestAspect {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		MyGame mg=(MyGame)ctx.getBean("myGame");
		
		mg.m1();

	}

}
