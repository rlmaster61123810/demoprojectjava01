package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {
    @GetMapping("/page")
    public String testPage(Model model, String name) {

        model.addAttribute("name", name);
        return "page";
    }

}