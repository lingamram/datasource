package com.mkyong.jms;

import antlr.debug.MessageListener;
import org.springframework.jms.core.JmsTemplate;
import java.util.*;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;


public class AsyncListner implements javax.jms.MessageListener {

    private Set<String> registry = new HashSet<String>();

    public void onMessage(Message message) {
        TextMessage txtMsg = (TextMessage) message;
        System.out.println("____message received__ : " + txtMsg);
        try {
            registry.add(txtMsg.getText());
            message.acknowledge();
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

    public Set<String> getRegistry() {
        return registry;
    }

    public void setRegistry(Set<String> registry) {
        this.registry = registry;
    }
}