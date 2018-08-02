package com.yunbang.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SwaggerController {

    @RequestMapping(value = "/swagger")
    String swagger(){
        return "redirect:swagger-ui.html";
    }
}
