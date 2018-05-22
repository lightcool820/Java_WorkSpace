package com.lt.test.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloAction {
    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(@RequestParam(value="name",required=false) String name) {
        return name + " Hello World!";
    }
}
