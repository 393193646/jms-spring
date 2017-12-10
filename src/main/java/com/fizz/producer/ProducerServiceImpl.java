package com.fizz.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * @author fizz
 * @time 2017/12/10 15:53
 */
@Service
public class ProducerServiceImpl implements ProducerService {

	@Autowired
	private JmsTemplate jmsTemplate;

//	@Resource(name = "queueDestination")
	@Resource(name = "topicDestination")
	private Destination destination;

	public void sendMessage(final String message) {
		jmsTemplate.send(destination, (Session session) -> {
			TextMessage textMessage = session.createTextMessage(message);
			return textMessage;
		});
		System.out.println("发送消息: " + message);
	}
}
