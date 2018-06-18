package com.jm.ssm_based_on_gradle.pojo;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/15/2018
 * Time: 10:37 AM
 */

public class User {
    private Integer id;
    private String username;
    private Integer password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password=" + password +
                '}';
    }
}
