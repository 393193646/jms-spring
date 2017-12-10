package com.fizz.consumer;

import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @author fizz
 * @time 2017/12/10 17:38
 */
@Component
public class ConsumerMessageListener implements MessageListener {

	@Override
	public void onMessage(Message message) {
		try {
			System.out.println("接收到: " + ((TextMessage) message).getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}
