package com.mkyong.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import javax.jms.Message;

import javax.jms.MessageListener;
import javax.management.Notification;


public class Consumer {

    private JmsTemplate jmsTemplate;

    public Message receive(){
        Message message = jmsTemplate.receive();
        System.out.println(message.getClass());
        return message;
    }

    public JmsTemplate getJmsTemplate() {
        return jmsTemplate;
    }

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }
}