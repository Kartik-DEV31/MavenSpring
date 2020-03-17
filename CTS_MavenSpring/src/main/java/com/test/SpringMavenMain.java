package com.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMavenMain {

	public static void main(String[] args) {
		
ApplicationContext obj = new ClassPathXmlApplicationContext("MavenSpringConfig.xml");

springMavenBean bean = (springMavenBean)obj.getBean("MavenSpring");

System.out.println("ID : "+bean.getI()+"  "+"Name :"+bean.getName());



bean.display();


	}

}
