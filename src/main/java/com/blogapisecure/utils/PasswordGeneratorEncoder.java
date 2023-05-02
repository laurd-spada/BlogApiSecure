package com.blogapisecure.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordGeneratorEncoder {
    public static void main(String[] args) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(); // an instance of the password encoder to encrypt a value for testing... not a part of the project being done
        System.out.println(passwordEncoder.encode("admin")); // encrypting the word admin
        System.out.println(passwordEncoder.encode("1234")); // encrypting the word "1234"
    }
}
