package com.rajneesh.poc.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
   @GetMapping("/")
   public String sayHello() {
      return "Hello Spring Boot!";
   }
   
   
   @GetMapping("/hello/{name}")
   public String hello(@PathVariable("name") String name) {
      return "Helloworld Spring POC !!!!!!! " + name;
   }
   
   
   
}
