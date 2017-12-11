package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by daime on 2017/11/27.
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/ribbon-consumer")
    public String helloConsumer() {
        //return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
        return restTemplate.getForObject("http://HELLO-SERVICE/hello", String.class);
    }
}
