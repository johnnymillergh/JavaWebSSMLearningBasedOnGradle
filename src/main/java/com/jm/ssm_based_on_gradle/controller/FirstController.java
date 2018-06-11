package com.jm.ssm_based_on_gradle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/10/2018
 * Time: 5:40 PM
 */

@Controller
@RequestMapping(value = "/hello")
public class FirstController {

    @RequestMapping(value = "/firstController")
    public String handleRequest(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {

        // Add data to model
        model.addAttribute("msg", "This is my first Spring MVC program");

        return "first";
    }
}
