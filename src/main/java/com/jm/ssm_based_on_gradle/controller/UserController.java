package com.jm.ssm_based_on_gradle.controller;

import com.jm.ssm_based_on_gradle.pojo.User;
import com.jm.ssm_based_on_gradle.pojo.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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

    @RequestMapping("/toUser")
    public String toUser() {
        return "user";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(Integer[] ids) {
        if (ids != null) {
            for (Integer id : ids) {
                System.out.println("Delete user: " + id);
            }
        } else {
            System.out.println("ids = null");
        }
        return "success";
    }

    @RequestMapping("/toUserEdit")
    public String toUserEdit() {
        return "user_edit";
    }

    @RequestMapping("/editUsers")
    public String editUsers(UserVo userVo) {
        List<User> users = userVo.getUsers();
        for (User user : users) {
            if (user.getId() != null) {
                System.out.println("Edit user: " + user.getId() + ", username = " + user.getUsername());
            }
        }
        return "success";
    }
}
