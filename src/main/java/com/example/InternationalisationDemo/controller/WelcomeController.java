package com.example.InternationalisationDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController
{
    @GetMapping("/welcome")
    public String renderHtmlFromTemplate(Model model)
    {
        model.addAttribute("userName", "John Doe");
        return "my-html-template";
    }
}

