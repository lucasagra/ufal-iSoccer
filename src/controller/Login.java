package controller;

import admin.Admin;
import data.Data;

public class Login {
    private String user;
    private String password;

    public Login(String user, String password){
        this.user = user;
        this.password = password;
    }

    public boolean loginPage(Data data){
        Admin admin = new Admin(this.user, this.password);

        System.out.printf("Welcome to iSoccer, football manager.%n%n");
        System.out.printf("Type your account and password to login.%n");
        System.out.printf("0 - Exit%n");

        return admin.authenticate(data);
    }
}
