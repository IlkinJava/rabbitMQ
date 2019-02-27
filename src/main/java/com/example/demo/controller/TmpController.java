package com.example.demo.controller;

import com.example.demo.service.TmpService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TmpController {

    private final TmpService tmpService;

    public TmpController(TmpService tmpService) {
        this.tmpService = tmpService;
    }


    @GetMapping("/{data}")
    public void sendMessage(@PathVariable String data) {
        tmpService.sendMessage(data);
    }

}
