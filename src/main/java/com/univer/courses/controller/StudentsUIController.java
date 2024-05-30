package com.univer.courses.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/front/univer")
public class StudentsUIController {


    @PostMapping("/student")
    public String student(@RequestBody MultiValueMap request){
        System.out.println(request);
        return "success";
    }

}
