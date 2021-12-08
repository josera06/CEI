package gob.cmalm.cei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String viewHomePage(Model model) {
        return "index";
    }    
    
    @GetMapping("/component-alert")
    public String componentAlertPage(Model model) {
        return "component-alert";
    }    
}
