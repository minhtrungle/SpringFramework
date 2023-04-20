package com.programming.springframework.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
@PropertySource(value = "classpath:/application.properties")
public class AdvancedSpellChecker implements SpellChecker, InitializingBean, DisposableBean { //Lifecycle


    @Value("${app.database.uri}")
    private String databaseUri;

    @Override
    public void checkSpelling(String emailMessage) {
        if (emailMessage != null) {
            // Determining the Language of the email Message
            // Check grammatical errors in the email Message
            // Check spellings in the email Message
            System.out.println("Checking Spelling using Advanced Spell Checker..");
            System.out.println("Spell Checking Completed!!");

            System.out.println("DB URI: " + databaseUri);
        } else {
            throw new RuntimeException("An exception occurred while checking Spelling");
        }
    }
    @Override
    public void destroy() {
        System.out.println("Destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Setting Properties after Bean is initialized");
    }
}
