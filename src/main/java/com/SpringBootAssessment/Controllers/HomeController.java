package com.SpringBootAssessment.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


////     I will always associate / with root
@Controller
public class HomeController {
    @GetMapping("/")
    public String root(){
        return "index";
    }
}
