/**
 * 1.0-Spring-Hello-World-Application
 * 3:33:38 PM
 * Bipin Yadav
 */
package com.javasnippet.spring.home;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author Bipin Yadav
 *
 */
public class App {
	static Person person;
	/*
	 * Class Path Contexts.
	 * 
	 * ApplicationContext : Central interface to provide configuration for an application. 
	 * This is read-only while the application is running,
	 * but may be reloaded.
	 * Create a new FileSystemXmlApplicationContext, loading the definitions from the given XML
	 * file and automatically refreshing the context. 
	 * Parameters:configLocation file pathThrows:
	 * BeansException - if context creation failed
	 * */
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/java/com/javasnippet/spring/beans/beans.xml");
		person = (Person) context.getBean("person");	
		person.speak();
		((AbstractApplicationContext) context).close();
	}
}
