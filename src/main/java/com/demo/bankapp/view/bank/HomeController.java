package com.demo.bankapp.view.bank;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

   @GetMapping("home")
       public ModelAndView home(){ return new ModelAndView("bank/home");}
    }

