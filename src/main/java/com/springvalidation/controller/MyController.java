package com.springvalidation.controller;

import com.springvalidation.entities.LoginData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.*;


@Controller
public class MyController {

    @GetMapping("/form")
    public String openForm(Model model){
        System.out.println("Opening form");
        model.addAttribute("loginData", new LoginData());
        return "form";
    }

    //handler for processing from
    @PostMapping("/process")
    public String processForm( @Valid @ModelAttribute("loginData") LoginData loginData,  BindingResult bindingResult,Model model){
        if (bindingResult.hasErrors()){
            System.out.println("--------has errors--------");
            System.out.println(bindingResult);
            return "form";
        }

        System.out.println(bindingResult);
        System.out.println(loginData);
        return "success";
    }


}
