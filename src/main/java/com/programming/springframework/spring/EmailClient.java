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

    //Qualifier thì bỏ đoạn dưới dùng contructor và setter
//    public EmailClient() {
//    }
//
//    @Autowired
//    EmailClient(SpellChecker spellChecker) {
//        this.spellChecker = spellChecker;
//    }
//
//    public SpellChecker getSpellChecker() {
//        return spellChecker;
//    }
//
//    @Autowired
//    public void setSpellChecker(SpellChecker spellChecker) {
//        this.spellChecker = spellChecker;
//    }

    public EmailClient(BasicSpellChecker basicSpellChecker) {
    }

    public void sendEmail(String email) {
        spellChecker.checkSpelling(email);
    }
}
