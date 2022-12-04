package com.ohk.hss.itemapi.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController(value = "/s")
public class SampleController {

    @GetMapping(value = {"/sample"})
    public Map<String, Object> getHelloWorld() {
        Map<String, Object> map = new HashMap<>();
        map.put("sample", "Hello World!");
        return map;
    }
}