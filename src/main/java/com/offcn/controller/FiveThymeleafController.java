package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FiveThymeleafController {

    @GetMapping("/five")
    public String indexPage(Model model) {
        model.addAttribute("tag", true);
        model.addAttribute("menu", "admin");
        model.addAttribute("mamager", "manager");
        return "index5";
    }
}