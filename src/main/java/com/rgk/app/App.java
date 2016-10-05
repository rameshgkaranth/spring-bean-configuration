package com.rgk.app;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rgk.beans.FarmFreshPizza;
import com.rgk.beans.PNameSpace;
import com.rgk.beans.Person;


public class App {

	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rgk/beans.xml");
		Person person1 = (Person) context.getBean("person");
		Person person2 = (Person) context.getBean("anotherPerson");
		PNameSpace pNameSpace = (PNameSpace) context.getBean("pNameSpace");
		
		LOGGER.info("PERSON 1 : "+person1.toString());
		LOGGER.info("PERSON 2 : "+person2.toString());
		LOGGER.info("Business equaity test for Person : "+(person1.equals(person2)));
		LOGGER.info("Reference equality test for Person : "+(person1 == person2));
		LOGGER.info("Bean created from P-Namespace : "+pNameSpace);
		
		FarmFreshPizza farmFreshPizza1 = (FarmFreshPizza) context.getBean("farmFreshPizza");
		FarmFreshPizza farmFreshPizza2 = (FarmFreshPizza) context.getBean("farmFreshPizza");
		LOGGER.info("Reference equality test for Person : "+(farmFreshPizza1 == farmFreshPizza2));
		
		List<String> registeredBeanName = Arrays.asList(context.getBeanDefinitionNames());
		for (String beanName : registeredBeanName) {
			LOGGER.info(beanName);
		}
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
