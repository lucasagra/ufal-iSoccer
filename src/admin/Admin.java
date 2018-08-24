package admin;

import java.util.InputMismatchException;

import data.Data;
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

    public boolean authenticate(Data data){
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

        authenticated(data);
        return false;
    }

    private void authenticated(Data data){
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
                        manage.employees(data.getEmployeesData());
                        break;
                    case 2:
                        manage.partners(data.getPartnersData(), data.getRanksData());
                        break;
                    case 3:
                        manage.resources(data.getResourcesData());
                        break;
                    case 4:
                        manage.reports(data);
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
