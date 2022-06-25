package com.tpe.app;

import com.tpe.AppConfiguration;
import com.tpe.service.MessagService;
import com.tpe.thirdparty.ThirtPartyComponent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(AppConfiguration.class);

      //  MessagService service=context.getBean("whatsApService", MessagService.class);
       // System.out.println(service.sendMessage());

        MessagService service2=context.getBean("mailService", MessagService.class);
        System.out.println(service2.sendMessage());


        ThirtPartyComponent thirdtPartyComponent= context.
                getBean("thirdPartyComponent", ThirtPartyComponent.class);

        System.out.println(thirdtPartyComponent.getMessage());




        context.close();

    }
}
