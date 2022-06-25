package com.work.main;

import com.work.AppConfigurationn;
import com.work.servicee.Message;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext a=new
                AnnotationConfigApplicationContext(AppConfigurationn.class);
        Message servis=a.getBean("whatsap",Message.class);
        System.out.println(servis.sendMessagee());
    }
}
