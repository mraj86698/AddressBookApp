package com.example.demo.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.Utility.MailSender;

@Configuration
public class UserConfig {
    @Bean
    public MailSender emailSenderService()
    {
        return new MailSender();
    }
}