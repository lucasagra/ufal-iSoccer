import employees.*;
import resources.*;
import partners.*;
import auxiliaries.*;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Menu {
    private String user;
    private String password;

    Menu(String user, String password){
        this.user = user;
        this.password = password;
    }

    boolean loginPage(List<Employee> employees, List<Partner> partners, Ranks ranks, List<Resources> resources){
        Scanner input = new Scanner(System.in);
        Manage manage = new Manage();
        Control control = new Control();

        System.out.printf("Welcome to iSoccer, football manager.%n%n");
        System.out.printf("Type your account and password to login.%n");
        System.out.printf("0 - Exit%n");

        System.out.print("User:");
        String ID = input.nextLine();
        if (ID.equals("0")){
            return true;
        }
        System.out.print("Password:");
        String password = input.nextLine();

        while(!ID.equals(this.user) || !password.equals(this.password)){
            System.out.println("User/Password does not match.");
            System.out.printf("0 - Leave%n");

            System.out.print("User: ");
            ID = input.nextLine();
            if (ID.equals("0")){
                return true;
            }
            System.out.print("Password: ");
            password = input.nextLine();
        }

        System.out.printf("%nSuccessful login.%n");

        int option = 10;
        while(option != 0) {
            System.out.printf("%n1 - Add employee" +
                    "%n2 - Manage supporters" +
                    "%n3 - Manage resources" +
                    "%n4 - Check reports" +
                    "%n0 - Log out%n%n");

            try {
                System.out.print("Option: ");
                option = control.stringToInt(input.nextLine());

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
                System.out.printf("%nSorry, that option doesn't exists. Try again");
                input.nextLine();
            }
        }

        return false;
    }
}
