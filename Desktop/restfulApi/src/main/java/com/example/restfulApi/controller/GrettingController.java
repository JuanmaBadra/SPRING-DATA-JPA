package com.example.restfulApi.controller;

import com.example.restfulApi.entity.Gretting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GrettingController {

    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/gretting")
    public Gretting hello(@RequestParam(value = "name",defaultValue = "World")String name){
        return new Gretting(counter.incrementAndGet(),String.format(template,name));
    }
}
