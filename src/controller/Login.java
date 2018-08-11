package controller;

import admin.Admin;
import models.employees.*;
import models.resources.*;
import models.partners.*;

import java.util.List;

public class Login {
    private String user;
    private String password;

    public Login(String user, String password){
        this.user = user;
        this.password = password;
    }

    public boolean loginPage(List<Employee> employees, List<Partner> partners, Ranks ranks, List<Resource> resources){
        Admin admin = new Admin(this.user, this.password);

        System.out.printf("Welcome to iSoccer, football manager.%n%n");
        System.out.printf("Type your account and password to login.%n");
        System.out.printf("0 - Exit%n");

        return admin.authenticate(employees, partners, ranks, resources);
    }
}
