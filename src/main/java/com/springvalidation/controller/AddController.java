package com.springvalidation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {

    @RequestMapping("/adding")
    public String addFiles(){
        return "adding";
    }

}
