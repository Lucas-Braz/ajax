package com.example.ajax.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class C_Home {
    @GetMapping("/")
    public String renderHome(){
        return "index";
    }

    @PostMapping("/")
    @ResponseBody
    public double postExponenciacao(@RequestParam("number") double number) {
        return Math.pow(number,2);
    }
}
