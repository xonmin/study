package com.example.study.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // LocalHost :8000/api

public class GetController {

   @RequestMapping(method =RequestMethod.GET, path ="/getMethod") // LocalHost:8080/api/getMethod


        public String getRequest () {
            return " Hi getMethod";
    }


    }

