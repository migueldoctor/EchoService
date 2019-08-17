package com.kesizo.microservices.client.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class EchoServiceController {


    @RequestMapping(value = "/")
    public String echoService(){
        return "Echo Service ";
    }

    @GetMapping("/{id}")
    public String echoService(@PathVariable String id){

        return id;
    }
}
