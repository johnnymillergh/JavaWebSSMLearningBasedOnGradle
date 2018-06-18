package com.jm.ssm_based_on_gradle.controller;

import com.jm.ssm_based_on_gradle.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/11/2018
 * Time: 8:57 PM
 */

@Controller
public class UserController {

//    /**
//     * Default binding data type: HttpServletRequest request
//     * Other binding data type:
//     * HttpServletResponse response, HttpSession session, Model model, ModelMap map
//     *
//     * @param request
//     * @return
//     */
//    @RequestMapping("/selectUser")
//    public String selectUser(HttpServletRequest request) {
//        String id = request.getParameter("id");
//        System.out.println("id=" + id);
//        return "success";
//    }

    @RequestMapping("/selectUser")
    public String selectUser(@RequestParam(value = "user_id", defaultValue = "1") Integer id) {
        System.out.println("id=" + id);
        return "success";
    }

    @RequestMapping("/toRegister")
    public String toRegister() {
        return "register";
    }

    @RequestMapping("/registerUser")
    public String registerUser(User user) {
        String username = user.getUsername();
        Integer password = user.getPassword();
        System.out.println(username);
        System.out.println(password);
        return "success";
    }
}
