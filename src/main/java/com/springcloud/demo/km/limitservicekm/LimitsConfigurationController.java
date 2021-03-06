package com.springcloud.demo.km.limitservicekm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    Configuration configuration;

    @GetMapping("/limits")
    LimitsConfiguration helloWorld(){
        return new LimitsConfiguration(configuration.getMinimum(),configuration.getMaximum());

    }
}
