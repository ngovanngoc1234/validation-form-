package com.ngovanngoc.validationsubmitform.controller;


import com.ngovanngoc.validationsubmitform.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class CustomerController {

    @GetMapping("/")
    public ModelAndView getFormRegister() {
        return new ModelAndView("register", "customer", new Customer());
    }

    @PostMapping("/register")
    public String save(@Valid @ModelAttribute("customer")Customer customer, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "register";
        }
        return "success";
    }

}
