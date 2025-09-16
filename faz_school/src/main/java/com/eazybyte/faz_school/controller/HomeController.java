package com.eazybyte.faz_school.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
@Controller
public class HomeController {
    @RequestMapping(value ={"", "/", "home"})
    public String displayHomePage(Model model){
        model.addAttribute("username", "Farouq Okeniyi");
        return "home.html";
    }
}
