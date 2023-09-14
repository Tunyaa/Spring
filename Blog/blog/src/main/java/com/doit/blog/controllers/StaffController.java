
package com.doit.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaffController {
    @GetMapping("/staff")
    public String staffMain(Model model){
        model.addAttribute("title", "Снаряжение");
        return "staff";
    }
}
