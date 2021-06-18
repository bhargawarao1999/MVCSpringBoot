package com.vm.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @RequestMapping("/")
    public String index(
        @RequestParam(value = "participant", required = false) String participant,
        Model model
    ) {
        System.out.println(participant);
        return "index";
    }
}