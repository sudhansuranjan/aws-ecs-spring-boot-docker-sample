package com.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsEcsController {

    @GetMapping("/getdetails")
    public String print1(){

        return "Welcome in AWS Container";
    }

    @GetMapping("/getdetails/{value}")
    public String print2(@PathVariable String value){

        return value+"Welcome in AWS Container";
    }





}
