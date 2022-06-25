package com.tpe.service;



import com.tpe.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("whatsApService")
public class WhatsAppService implements MessagService {

    //Dependency injection
    //Otomatik olarak bu nesneyi bu sınıfa bağla


    /*Field injection
     * @Autowired
     * @Qualifier("dbRepository")
     * private Repository repository;
     */


    /*Contructor injection
    private Repository repository;
    @Autowired
    public WhatsAppService(@Qualifier("dbRepository") Repository repository ) {
        this.repository=repository;
    }
    */

    //Setter Injection

    //Filed injection
    @Autowired
    @Qualifier("dbRepository")
    private Repository repository;
    public void setRepository( Repository repository){
        this.repository=repository;
    }

    @Override
    public String sendMessage() {
        repository.saveMessage("I am a Whatsapp Service, I sent a wa message");
        return "I am a Whatsapp Service, I sent a wa message";
    }
}
