package com.loa2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zacharywasserman on 10/31/16.
 */
@RestController
public class demoController {

    @RequestMapping("/loa")
    public String welcome(){return "Welcome to Loa";}
}
