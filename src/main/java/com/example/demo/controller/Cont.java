package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by RESO on 10/28/2017.
 */
@Controller
public class Cont {

    @RequestMapping(value={"/" , "/login"})
    public String home(Map<String, Object> model) {
        model.put("message", "HowToDoInJava Reader !!");
        return "Home";
    }

}
