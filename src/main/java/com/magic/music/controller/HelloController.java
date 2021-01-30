package com.magic.music.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author laoma
 * @create 2021-01-30 12:07
 */
@RestController
public class HelloController {
    @GetMapping("/")
    public String hello(){
        return "hello music website";
    }
}
