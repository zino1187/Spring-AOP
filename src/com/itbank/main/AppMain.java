package com.itbank.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		String path="classpath:com/itbank/spring/context/main-context.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
		MainFrame mainFrame=(MainFrame)context.getBean("mainFrame");
		
		mainFrame.init();
	}
}
