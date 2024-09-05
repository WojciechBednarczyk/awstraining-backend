package com.awstraining.backend.business.notifyme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotifyMeService {

    private final MessageSender messageSender;
    private final Translator translator;
//    private final Sentiment sentiment;
    // TODO: lab1
    //  1. Inject MessageSender.
    // TODO lab2
    //  1. Inject Translator
    // TODO lab3
    //  1. Inject sentiment detector

    @Autowired
    public NotifyMeService(MessageSender messageSender, Translator translator) {
        this.messageSender = messageSender;
        this.translator = translator;
    }
    
    public String notifyMe(NotifyMeDO notifyMe) {
        // TODO: lab1
        var message = notifyMe.text();
        //  1. Send text using sender.
        //  2. Return sent message.
        // TODO: lab2
        //  1. Translate text from using translator.
        //  2. Change sending of text to "translated text" and return it.
        var translatedMessage = translator.translate(notifyMe);
        messageSender.send(translatedMessage);
        // TODO: lab3
        //  1. Detect sentiment of translated message.
        //  2. Change sending of text to "setiment: translated text" and return it.
        return translatedMessage;
    }
    
}
