package com.demo.emailSend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class MailerInfo {

    private String emailId;
    private String subject;
    private String body;
}
