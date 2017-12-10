package com.fizz.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fizz
 * @time 2017/12/10 18:13
 */
public class AppConsumer {

	public static void main(String [] args){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
	}
}
