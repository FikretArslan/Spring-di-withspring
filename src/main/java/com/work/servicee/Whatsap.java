package com.work.servicee;

import com.work.repositoryy.MessageR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("whatsap")
public class Whatsap implements Message {

    @Autowired
    private MessageR repositoryy;
    @Override
    public String sendMessagee() {
        repositoryy.saveMessagee("");
        return "whatsap mesaj";
    }
}
