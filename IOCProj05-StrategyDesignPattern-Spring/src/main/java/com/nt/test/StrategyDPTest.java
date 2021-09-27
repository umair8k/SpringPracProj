package com.nt.test;


import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Flipkart;

public class StrategyDPTest {
	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
		 reader.loadBeanDefinitions("com/nt/cfg/applicationcontext.xml");
		//get target class object
		Flipkart fpkt=factory.getBean("fpkt", Flipkart.class);
		//invoke b.method
		String resultMsg=fpkt.shopping(new String[] {"T-shirts", "Pant", "Watch"}, 
			                            new float[] {700.40f, 1500.75f, 12000.85f});
		System.out.println(resultMsg);
		
		
	}//main

}//class
