package com.demo.emailSend.controller;

import com.demo.emailSend.model.MailerInfo;
import com.demo.emailSend.service.MailerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
@Tag(name="Email APIs", description = "Email related APIs")

public class MailerController {

    @Autowired
    private MailerService mailerService;

    @PostMapping("/send")
    public void sendEmail(@RequestBody MailerInfo mailerInfo){

        mailerService.sendEmail(mailerInfo);

    }

    @GetMapping("/test")
    public String test(){
        return "test API";
    }
}
