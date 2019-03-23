/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patrickgrimard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author raj
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {

@GetMapping
public String index(){
    return "home/index";
} 
@RequestMapping(method = RequestMethod.GET,value = "/home")
@ResponseBody
public String home(){
    return "hello today i am very happy";
}
}
