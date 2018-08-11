package admin;

import utils.Format;
import models.employees.*;
import models.partners.*;
import models.resources.*;
import views.*;

import java.util.InputMismatchException;
import java.util.List;

class Manage {

    Manage(){}

    void partners(List<Partner> partners, Ranks ranks) {
        Format format = new Format();
        Menu menu = new Menu();

        int option = -1;

        while(option != 0) {
            try {
                option = menu.partners();
                switch (option) {
                    case 0:
                        break;
                    case 1:
                        Partner aux = Partner.newPartner(partners, ranks);
                        if (aux != null) {
                            partners.add(aux);
                            System.out.printf("%nPartner successfully added%n");
                        }
                        break;
                    case 2:
                        Partner.showPartners(partners);
                        break;
                    case 3:
                        ranks.updateValues(partners, ranks);
                        break;
                    default:
                        throw new InputMismatchException();
                }
            } catch (InputMismatchException e){
                format.invalidInput();
            }
        }
    }

    void employees(List<Employee> employees){
        Employee.newEmployee(employees);
    }

    void resources(List<Resource> resources){
        Format format = new Format();
        Menu menu = new Menu();

        int option = -1;
        while (option != 0) {
            try {
                option = menu.resources();
                switch (option) {
                    case 0:
                        break;
                    case 1:
                        Bus.manage(resources);
                        break;
                    case 2:
                        Stadium.manage(resources);
                        break;
                    case 3:
                        TrainingCenter.manage(resources);
                        break;
                    default:
                        throw new InputMismatchException();
                }
            } catch (InputMismatchException e){
                format.invalidInput();
            }
        }
    }

    void reports(List<Employee> employees, List<Partner> partners, List<Resource> resources){
        Menu menu = new Menu();
        Format format = new Format();
        Reports reports = new Reports();

        int option = -1;
        while(option != 0) {

            try {
                option = menu.reports();
                switch (option) {
                    case 0:
                        break;
                    case 1:
                        reports.employees(employees);
                        break;
                    case 2:
                        reports.resources(resources);
                        break;
                    case 3:
                        reports.partners(partners);
                        break;
                    case 4:
                        reports.general(employees, resources, partners);
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
