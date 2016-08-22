package com.kitchen.cook.bean;

import com.kitchen.cook.service.IUserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ManagedBean
@SessionScoped
public class UserBean {

    @Inject
    private IUserService userService;

    public String message = "Hello World";

    public String getMessage() {
        return message;
    }

    public String printMsgFromSpring() {
        return userService.getMessage();
    }
}
