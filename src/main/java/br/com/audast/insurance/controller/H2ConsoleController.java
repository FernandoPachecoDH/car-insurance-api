package br.com.audast.insurance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class H2ConsoleController {
    @GetMapping("/h2")
    public String h2Console() {
        return "redirect:/h2";
    }
}
