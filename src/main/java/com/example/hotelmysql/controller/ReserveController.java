package com.example.hotelmysql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReserveController {

    @RequestMapping({"/reserve"})
    public String notImplemented(){
        return "nim";
    }

}