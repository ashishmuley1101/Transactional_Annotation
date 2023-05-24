package com.bridgelabz.transaction;

import com.bridgelabz.transaction.model.LazyExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TransactionApplication {

	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext("com/bridgelabz/tranction.*");

		// Checking the design pattern.
		ConfigurableApplicationContext context= SpringApplication.run(TransactionApplication.class, args);

		LazyExample lazyExample = context.getBean(LazyExample.class);

	}

}
