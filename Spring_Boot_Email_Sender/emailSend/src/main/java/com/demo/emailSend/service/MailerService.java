package com.demo.emailSend.service;

import com.demo.emailSend.model.MailerInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MailerService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(MailerInfo mailer){
        try {
            System.out.println("mailer"+mailer);
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setTo(mailer.getEmailId());
            simpleMailMessage.setSubject(mailer.getSubject());
            simpleMailMessage.setText(mailer.getBody());

            javaMailSender.send(simpleMailMessage);
        }
        catch (Exception e){
            log.error("Exception while sendEmail ", e);
        }

    }

}
