package com.edigest.journalApp.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTests {

    @Autowired
    private EmailService emailService ;

    @Test
    public void sendEmailTest(){

        emailService.sendEmail(
                "22_vyankatesh.kamod@ges-coengg.org",
                "Application for cricket match",
                "Please register your self"
        );
    }
}
