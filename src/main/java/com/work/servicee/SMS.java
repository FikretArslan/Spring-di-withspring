package com.work.servicee;

import org.springframework.stereotype.Component;

@Component("sms")
public class SMS implements Message{
    @Override
    public String sendMessagee() {
        return "SMS mesaj";
    }
}
