package com.example.employeecrudsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {


        @GetMapping("/all")
        public String allAccess() {
            return "Public Content.";
        }

        @GetMapping("/employee")
        @PreAuthorize("hasRole('EMPLOYEE') or hasRole('HR') or hasRole('MANAGER')")
        public String userAccess() {
            return "Employee Content.";
        }

        @GetMapping("/hr")
        @PreAuthorize("hasRole('HR')")
        public String moderatorAccess() {
            return "HR Board.";
        }

        @GetMapping("/manager")
        @PreAuthorize("hasRole('Manager')")
        public String adminAccess() {
            return "Manager Board.";
        }

}
