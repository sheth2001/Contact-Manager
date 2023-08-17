package com.kushal.contact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("title", "Home - Smart Contact Manager");
        return "home";
    }
    @GetMapping("/about")
    public String getAbout(Model model) {
        model.addAttribute("title", "About - Smart Contact Manager");
        return "about";
    }

    @GetMapping("/signup")
    public String getSignup(Model model) {
        model.addAttribute("title", "Home - Smart Contact Manager");
        return "signup";
    }
}
