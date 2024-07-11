package com.shelltechsolutions.springsecurity.configuration.oauth2;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;

//@RestController
public class OAuthSecurityResource {

    @GetMapping("/")
    public String helloWorld(Authentication authentication) {
        System.out.println(authentication);

        return "Hello World";
    }
}
