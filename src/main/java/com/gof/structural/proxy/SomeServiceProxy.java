package com.gof.structural.proxy;

public class SomeServiceProxy implements SomeService {

    public static final String ADMIN = "admin";

    @Override
    public String getData() {
        if (getRoleFromSession().equals(ADMIN)) {
            return new SomeServiceImpl().getData();
        }
        else {
            return "You are not admin";
        }
    }

    public String getRoleFromSession(){
        return ADMIN;
    }
}
