package com.fizz.producer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fizz
 * @time 2017/12/10 17:09
 */
public class AppProducer {

	public static void main(String [] args){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("producer.xml");
		ProducerService producerService = applicationContext.getBean(ProducerServiceImpl.class);
		for (int i = 0; i < 10; i++) {
			producerService.sendMessage("发送第" + i + "条消息");
		}
		applicationContext.close();
	}
}
