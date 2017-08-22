package com.raya.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/loadForm")
    public String loadFormPage(){
        return "formTemplate";
    }

    @RequestMapping("/processForm")
    public String loadPage(@RequestParam("login") String login, Model model){
        model.addAttribute("loginValue",login);
        return "confirm";
    }
}
