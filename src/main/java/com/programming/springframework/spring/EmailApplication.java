package com.programming.springframework.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailApplication {
    public static void main(String[] args) {

        // Cấu hình bằng xml
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        // Cấu hình bằng java
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        EmailClient emailClient = applicationContext.getBean("emailClient", EmailClient.class);
        emailClient.sendEmail("Text 1");
        emailClient.sendEmail("Text 2");

        // Bean Scopes
        AdvancedSpellChecker advancedSpellChecker = applicationContext.getBean("advancedSpellChecker", AdvancedSpellChecker.class);
        System.out.println(advancedSpellChecker);
        AdvancedSpellChecker advancedSpellChecker1 = applicationContext.getBean("advancedSpellChecker", AdvancedSpellChecker.class);
        System.out.println(advancedSpellChecker1);

        ((AnnotationConfigApplicationContext) applicationContext).registerShutdownHook();
    }
}
