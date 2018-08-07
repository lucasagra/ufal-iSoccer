import auxiliaries.Control;
import employees.*;
import partners.*;
import resources.*;


import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Manage {

    Manage(){}

    void partners(List<Partner> partners, Ranks ranks) {
        Control control = new Control();
        int option = -1;

        while(option != 0) {
            System.out.printf("Actions available:" +
                    "%n1 - Add partner" +
                    "%n2 - Manage partners" +
                    "%n3 - Set new Partner-Ranks limits" +
                    "%n0 - Cancel%n");
            try {
                option = control.inputSelect();

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
                control.invalidInput();
            }
        }
    }

    void employees(List<Employee> employees){
        Employee.newEmployee(employees);
    }

    void resources(List<Resources> resources){
        Scanner input = new Scanner(System.in);
        Control control = new Control();

        int option = -1;
        while (option != 0) {
            System.out.println("Resources manager:");
            System.out.printf("1 - Bus%n" +
                    "2 - Stadium%n" +
                    "3 - Training Center%n" +
                    "0 - Cancel%n%n");
            try {
                option = control.inputSelect();

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
                control.invalidInput();
            }
        }
    }

    void reports(List<Employee> employees, List<Partner> partners, List<Resources> resources){
        Scanner input = new Scanner(System.in);
        Control control = new Control();
        Reports reports = new Reports();

        int option = -1;
        while(option != 0) {
            System.out.printf("%nReports available:%n" +
                    "1 - Employees report%n" +
                    "2 - Resources report%n" +
                    "3 - Partners report%n" +
                    "4 - General report%n" +
                    "0 - Cancel%n%n");
            try {
                option = control.inputSelect();

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
                control.invalidInput();
            }
        }
    }
}
