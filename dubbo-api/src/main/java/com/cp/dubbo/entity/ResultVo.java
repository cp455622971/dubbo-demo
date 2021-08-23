package com.cp.dubbo.entity;

import java.io.Serializable;

/**
 * @className: User
 * @description: TODO 类描述
 * @author: cp
 * @date: 2021-08-19
 **/
public class ResultVo implements Serializable {

    private String name;

    private String text;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
