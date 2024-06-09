package com.okta.developer.crud.controller.WebController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.core.Authentication;

@Controller
public class CommonController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @GetMapping("/dashboard")
    public String showDashboard(Authentication authentication) {
        if (authentication != null && authentication.isAuthenticated()) {
            if (hasRole(authentication, "ROLE_ADMIN")) {
                return "admin";
            } else if (hasRole(authentication, "ROLE_CUSTOMER")) {
                return "customer";
            }
        }
        // Redirect to login page if authentication fails or roles are not found
        return "redirect:/login?error";
    }

    private boolean hasRole(Authentication authentication, String role) {
        return authentication.getAuthorities().stream()
                .anyMatch(auth -> auth.getAuthority().equals(role));
    }
}
