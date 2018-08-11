package admin;

import java.util.InputMismatchException;
import java.util.List;

import models.employees.Employee;
import models.partners.*;
import models.resources.Resource;
import utils.Format;
import utils.Getinfo;
import views.Menu;


public class Admin {
    private String user;
    private String password;

    public Admin(String user, String password){
        this.user = user;
        this.password = password;
    }

    public boolean authenticate(List<Employee> employees, List<Partner> partners, Ranks ranks, List<Resource> resources){
        Getinfo info = new Getinfo();
        String user = info.inputAdminUser();
        if (user.equals("0")){
            return true;
        }

        String password = info.inputAdminPassword();

        while(!user.equals(this.user) || !password.equals(this.password)){
            System.out.println("User/Password does not match.");
            System.out.printf("0 - Leave%n");

            user = info.inputAdminUser();
            if (user.equals("0")){
                return true;
            }
            password = info.inputAdminPassword();
        }

        authenticated(employees, partners, ranks, resources);
        return false;
    }

    private void authenticated(List<Employee> employees, List<Partner> partners, Ranks ranks, List<Resource> resources){
        Menu menu = new Menu();
        Manage manage = new Manage();
        Format format = new Format();

        System.out.printf("%nSuccessful login.%n");

        int option = -1;
        while(option != 0) {
            try {
                option = menu.main();

                switch (option){
                    case 0:
                        break;
                    case 1:
                        manage.employees(employees);
                        break;
                    case 2:
                        manage.partners(partners, ranks);
                        break;
                    case 3:
                        manage.resources(resources);
                        break;
                    case 4:
                        manage.reports(employees, partners, resources);
                        break;
                    default:
                        throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                format.invalidInput();
            }
        }
    }
}
