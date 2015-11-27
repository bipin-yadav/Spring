package com.javasnippet.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		//with spring-framework
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		Person person = (Person) context.getBean("person");	
		/*
		 * //without spring-framework
		Person per =  new Person();
		person.speak();
		*/
	}

}
