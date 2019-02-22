package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String homePage() {
        return "index";
    }

    @GetMapping("/AboutBootCamp")
    public String bootCamp() {
        return "AboutBootCamp";
    }

    @GetMapping("/AboutDeveloper")
    public String developer() {
        return "AboutDeveloper";
    }

    @GetMapping("/html5")
    public String html5() {
        return "html5";
    }

    @GetMapping("/css")
    public String css() {
        return "css";
    }

    @GetMapping("/javascript")
    public String javascript() {
        return "javascript";
    }

    @GetMapping("/mysql")
    public String mysql() {
        return "mysql";
    }

    @GetMapping("/springBoot")
    public String spring(){
        return "SpringBoot";
    }
    @GetMapping("/bootstrap")
    public String bootstrap(){
        return "BootStrap";
    }

}
