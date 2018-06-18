package com.jm.ssm_based_on_gradle.controller;

import com.jm.ssm_based_on_gradle.pojo.Orders;
import com.jm.ssm_based_on_gradle.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/15/2018
 * Time: 11:19 AM
 */

@Controller
public class OrdersController {
    @RequestMapping("/toFindOrdersWithUser")
    public String toFindOrdersWithUser() {
        return "orders";
    }

    @RequestMapping("/findOrdersWithUser")
    public String findOrdersWithUser(Orders orders) {
        Integer ordersId = orders.getOrdersId();
        User user = orders.getUser();

        String username = user.getUsername();
        System.out.println("ordersId=" + ordersId);
        System.out.println("username=" + username);

        return "success";
    }
}
