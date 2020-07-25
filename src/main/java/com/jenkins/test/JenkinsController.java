package com.jenkins.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    @RequestMapping(value = "/testJenkins")
    public String testJenkins(){
        return "Hello Jenkins";
    }
}
