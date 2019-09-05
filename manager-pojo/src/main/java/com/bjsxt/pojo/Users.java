package com.bjsxt.pojo;

/**
 * @ClassName Users
 * @Description Users类模型
 * @Author gaobin
 * @Date 2019/9/4 15:59
 * @Version 1.0
 **/

public class Users {
    private Integer userId;
    private String username;
    private Integer userage;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }
}
