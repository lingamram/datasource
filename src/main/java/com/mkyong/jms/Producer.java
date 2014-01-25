package com.mkyong.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.apache.activemq.command.ActiveMQQueue;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Message;
import javax.management.Notification;

public class Producer {

    private JmsTemplate jmsTemplate;


    public void convertAndSendMessage(final String notification){
        jmsTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                TextMessage message = session.createTextMessage(notification);
                return message;
            }
        });
    }

    public void convertAndSendMessageToQueue(final String destination,final String notification){
        jmsTemplate.send(destination,new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                TextMessage message = session.createTextMessage(notification);
                return message;
            }
        });
//        jmsTemplate.convertAndSend(notification);
    }


    public static void main(String[] args) {
        System.out.println("Hello");
    }

    public JmsTemplate getJmsTemplate() {
        return jmsTemplate;
    }

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

}