package com.jm.ssm_based_on_gradle.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/10/2018
 * Time: 5:40 PM
 */

public class FirstController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // Create ModelAndView object
        ModelAndView modelAndView = new ModelAndView();

        // Add data to model
        modelAndView.addObject("msg", "This is my first Spring MVC program");

        // Set logic view name
        modelAndView.setViewName("first.jsp");

        return modelAndView;
    }
}
