package com.example.demo.domain;

import lombok.Data;

/**
 * @author yuanzhijian
 */
@Data
public class User {

    private String userName;

    private int age;

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }
}
