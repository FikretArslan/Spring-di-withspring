package com.work.servicee;

import org.springframework.stereotype.Component;

@Component("mail")
public class Mail implements Message{
    @Override
    public String sendMessagee() {
        return "mail mesaj";
    }
}
