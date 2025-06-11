package com.example.super_springboot;

import java.util.List;

public class NestedData {
    List<username_password> user;
    List<username_password> account;

    public NestedData(List<username_password> user, List<username_password> account)
    {
        this.user = user;
        this.account = account;
    }

    public List<username_password> getUser() {
        return user;
    }
    public List<username_password> getAccount() {
        return account;
    }
}

