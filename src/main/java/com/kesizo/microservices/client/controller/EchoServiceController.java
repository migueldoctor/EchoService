package com.kesizo.microservices.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class EchoServiceController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/")
    public String echoService(){
        return "Echo Service " + "from port "+port;
    }

    @GetMapping("/{id}")
    public String echoService(@PathVariable String id){
        return id + " from port "+port;
    }
}
