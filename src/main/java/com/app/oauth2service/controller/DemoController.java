package com.app.oauth2service.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/demo")
@RequiredArgsConstructor
public class DemoController {

    @GetMapping(value = "/hallo")
    private String getHallo(){
        return "hallo from security !";
    }
}
