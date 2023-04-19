package com.programming.springframework.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmailClient {
    @Autowired
    @Qualifier("advancedSpellChecker")
    // Tiêm object SpellChecker vào EmailClient
    private SpellChecker spellChecker;

    public void sendEmail(String email) {
        spellChecker.checkSpelling(email);
    }
}
