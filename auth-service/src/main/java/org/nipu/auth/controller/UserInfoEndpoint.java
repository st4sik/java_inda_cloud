package org.nipu.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserInfoEndpoint {

    @GetMapping("/validate/user")
    public Principal currentUser(Principal principal) {
        return principal;
    }
}
