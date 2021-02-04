package com.hefeng.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author rookie
 * @date 2021/02/04 21:45
 **/
public class User implements Serializable {

    private String username;//姓名

    private Date birthday;

    private Integer age;

    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
