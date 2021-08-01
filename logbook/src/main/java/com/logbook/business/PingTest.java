package com.logbook.business;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingTest {
    @ResponseBody
    @RequestMapping("/hello/test")
    public String test(){
        return "success";
    }
}
