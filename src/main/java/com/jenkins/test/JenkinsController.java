package com.jenkins.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    @RequestMapping(value = "/testJenkins")
    public String testJenkins(){
        return "Hello Jenkins";
    }

    @RequestMapping(value = "/testJenkins2")
    public String testJenkins2(){
        return "GUANGUAN";
    }

    @RequestMapping(value = "/guanguan")
    public String woman(){
        return "abcd";
    }
}
