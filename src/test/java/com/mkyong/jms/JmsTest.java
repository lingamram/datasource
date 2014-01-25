
package com.mkyong.jms;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jms.TextMessage;
import javax.management.Notification;


@ContextConfiguration(locations={"/spring/config/test-BeanLocations.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class JmsTest extends TestCase {

    @Autowired
    @Qualifier("producer")
    private Producer producer;

    @Autowired
    @Qualifier("consumer")
    private Consumer consumer;

    @Autowired
    @Qualifier("asyncReceiver")
    private AsyncListner asyncReceiver;


    /*@Test
    public void testSynchronizedReceiving() throws Exception {
        producer.convertAndSendMessage("message");
        System.out.println("Sync Message sent");
        Thread.sleep(2000);
        TextMessage message = (TextMessage) consumer.receive();
        assertEquals("message",message.getText());
    }*/

    @Test
    public void testASynchronizedReceiving() throws Exception {
        producer.convertAndSendMessageToQueue("test.async.queue","2");
        Thread.sleep(2000);
        assertTrue(asyncReceiver.getRegistry().contains("2"));
    }}
