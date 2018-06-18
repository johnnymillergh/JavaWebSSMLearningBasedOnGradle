package com.jm.ssm_based_on_gradle.pojo;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/15/2018
 * Time: 11:15 AM
 */

public class Orders {
    private Integer ordersId;
    private User user;

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "ordersId=" + ordersId +
                ", user=" + user +
                '}';
    }
}
