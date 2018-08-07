import employees.*;
import resources.*;
import partners.*;
import auxiliaries.*;

import java.util.InputMismatchException;
import java.util.List;

class Menu {
    private String user;
    private String password;

    Menu(String user, String password){
        this.user = user;
        this.password = password;
    }

    boolean loginPage(List<Employee> employees, List<Partner> partners, Ranks ranks, List<Resources> resources){
        Manage manage = new Manage();
        Control control = new Control();
        Getinfo info = new Getinfo();

        System.out.printf("Welcome to iSoccer, football manager.%n%n");
        System.out.printf("Type your account and password to login.%n");
        System.out.printf("0 - Exit%n");

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

        System.out.printf("%nSuccessful login.%n");

        int option = -1;
        while(option != 0) {
            System.out.printf("%n1 - Add employee" +
                    "%n2 - Manage supporters" +
                    "%n3 - Manage resources" +
                    "%n4 - Check reports" +
                    "%n0 - Log out%n%n");

            try {
                option = control.inputSelect();

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
                control.invalidInput();
            }
        }

        return false;
    }
}
