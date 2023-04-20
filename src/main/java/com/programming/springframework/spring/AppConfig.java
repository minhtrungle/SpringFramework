package com.programming.springframework.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.programming.springframework.spring") // Quét cả package
public class AppConfig {

    // Sử dụng AppConfig để thay cho cấu hình theo Beans.xml
    @Bean(name = "basicSpellChecker", initMethod = "init", destroyMethod = "destroy")
    public BasicSpellChecker createBasicSpellChecker() {
        return new BasicSpellChecker();
    }

    @Bean(name = "advancedSpellChecker")
    public AdvancedSpellChecker createAdvancedSpellChecker() {
        return new AdvancedSpellChecker();
    }

    // Gọi 1 trong 2 bean ở trên nó sẽ được truyền vào EmailApplication
    @Bean(name = "emailClient")
    public EmailClient createEmailClient() {
//        EmailClient emailClient = new EmailClient();
//        emailClient.setSpellChecker(createBasicSpellChecker());
        return new EmailClient(createBasicSpellChecker());
    }
}
