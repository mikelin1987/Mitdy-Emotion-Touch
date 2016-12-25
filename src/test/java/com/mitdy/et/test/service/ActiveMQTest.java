package com.mitdy.et.test.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mitdy.core.jms.MessageSender;
import com.mitdy.et.test.base.BaseTest;

public class ActiveMQTest extends BaseTest {

    @Autowired
    private MessageSender messageSender;

    @Test
    public void sendMessageTest1() throws Exception {
        messageSender.sendSimpleMessage("Mike Lam");

        Thread.sleep(3000L);

    }

}
