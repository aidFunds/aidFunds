package main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getController {
    @RequestMapping("/")
    public String getMessage() {
        return "Greetings from aidFunds Organization! new world begins";
    }
}
