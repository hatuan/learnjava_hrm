package org.example.StudentManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorControllerHandler implements ErrorController {

    @GetMapping("/error")
    public String customError() {
        return "error";
    }
}