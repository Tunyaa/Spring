package com.doit.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MainController {

    @GetMapping("/")// на главную страницу
    public String home( Model model) { //метод
        model.addAttribute("title", "Главная страница"); // параметр передаваемый в метод
        return "home"; // метод шаблона
    }
    
    

}
