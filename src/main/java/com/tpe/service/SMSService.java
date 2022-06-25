package com.tpe.service;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SMSService implements MessagService {
    @Override
    public String sendMessage() {
        return "I am an SMS Service,I  sent a SMS";
    }
}
