package com.example.jms2;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    @JmsListener(destination = "TrudieValentijn.que", containerFactory = "jmsListenerContainerFactory")
    public void receiveMessage(Email email) {
        System.out.println("Received <" + email + ">");
    }
}
