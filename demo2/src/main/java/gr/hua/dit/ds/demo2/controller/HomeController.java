package gr.hua.dit.ds.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("")
    public String home(){

        return "home";
    }

}
