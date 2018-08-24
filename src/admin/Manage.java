package admin;

import controller.Control;
import data.Data;
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
        Control control = new Control();

        control.newEmployee(employees);

    }

    void resources(List<Resource> resources){
        Format format = new Format();
        Menu menu = new Menu();
        Control control = new Control();

        int option = -1;
        while (option != 0) {
            try {
                option = menu.resources();
                switch (option) {
                    case 0:
                        break;
                    case 1:
                        control.manageBuses(resources);
                        break;
                    case 2:
                        control.manageStadium(resources);
                        break;
                    case 3:
                        control.manageTrainingCenter(resources);
                        break;
                    default:
                        throw new InputMismatchException();
                }
            } catch (InputMismatchException e){
                format.invalidInput();
            }
        }
    }

    void reports(Data data){
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
                        reports.employees(data.getEmployeesData());
                        break;
                    case 2:
                        reports.resources(data.getResourcesData());
                        break;
                    case 3:
                        reports.partners(data.getPartnersData());
                        break;
                    case 4:
                        reports.general(data.getEmployeesData(), data.getResourcesData(), data.getPartnersData());
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
