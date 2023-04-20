package com.programming.springframework.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class BasicSpellChecker implements SpellChecker{
    // Trước khi khởi tạo phương thức
    public void init() {
        System.out.println("Before create method");
    }

    @Override
    public void checkSpelling(String emailMessage) {
        if (emailMessage != null) {
            System.out.println("Spell Checking Completed!!");
        } else {
            throw new RuntimeException("Error");
        }
    }

    public void destroy() {
        System.out.println("Destroy method");
    }
}
