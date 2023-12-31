package com.example.controller;

import com.example.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@AllArgsConstructor
public class MainController {

    UserService userService;
    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("users", userService.getAll());
        return "main";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        userService.delete(id);
        return "redirect:/main";
    }
}
