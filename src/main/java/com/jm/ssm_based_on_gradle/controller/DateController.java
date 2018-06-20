package com.jm.ssm_based_on_gradle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/18/2018
 * Time: 10:52 AM
 */

@Controller
public class DateController {
    @RequestMapping("/customDate")
    public String customDate(Date date) {
        System.out.println("Date: " + date);
        return "success";
    }
}
