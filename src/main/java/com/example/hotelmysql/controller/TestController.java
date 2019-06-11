package com.example.hotelmysql.controller;


import com.example.hotelmysql.commands.TestCommand;
import com.example.hotelmysql.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping("/tests")
    public String showTest(Model model){
        model.addAttribute("tests", testService.findAll());
        return "showTest";
    }


    @GetMapping("/tests/new")
    public String newTest(Model model){
        model.addAttribute("tests", new TestCommand());
        return "testForm";
    }

    @GetMapping("tests/{id}/update")
    public String updateRecipe(@PathVariable String id, Model model){
        model.addAttribute("recipe", testService.findCommandById(Long.valueOf(id)));
        return "testForm";
    }

}
