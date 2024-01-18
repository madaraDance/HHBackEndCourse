package com.example.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello(@RequestParam(name="location",required=false,
        defaultValue="(location value)") String location, @RequestParam(name="name", required=false,
        defaultValue="(name value)") String name) {
        return "Welcome to the " + location + " " + name + " !";
    }
}
