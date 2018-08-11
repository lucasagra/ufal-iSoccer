package admin;

import utils.Format;
import models.employees.*;
import models.partners.*;
import models.resources.*;

import java.util.List;
import java.util.Scanner;

class Reports {
    Reports(){}

    private void printTeamInformation(List<Employee> employees){
        System.out.printf("%nTeam information:%n%n");
        System.out.printf("Coach:%n");
        int j = 0;
        for(Employee employee: employees){
            if(employee instanceof Coach){
                employee.getInfo();
                j++;
            }
        }
        if(j == 0){
            System.out.printf("  No data available%n%n");
        }

        j = 0;
        System.out.printf("Apt players:%n");
        for(Employee employee: employees){
            if(employee instanceof Player){
                if(((Player) employee).isApt()) {
                    employee.getInfo();
                    j++;
                }
            }
        }
        if(j == 0){
            System.out.printf("  No data available%n%n");
        }

        j = 0;
        System.out.printf("Inapt players:%n");
        for(Employee employee: employees){
            if(employee instanceof Player){
                if(!((Player) employee).isApt()) {
                    employee.getInfo();
                    j++;
                }
            }
        }
        if(j == 0){
            System.out.printf("  No data available%n%n");
        }
    }

    private void printGeneralServicesInformation(List<Employee> employees){
        System.out.printf("%nGeneral services information:%n%n");
        int j = 0;

        System.out.printf("President:%n");
        for(Employee employee: employees){
            if(employee instanceof President){
                employee.getInfo();
                j++;
            }
        }
        if(j == 0){
            System.out.printf("  No data available%n%n");
        }

        j = 0;
        System.out.printf("Doctors:%n");
        for(Employee employee: employees){
            if(employee instanceof Doctor){
                employee.getInfo();
                j++;
            }
        }
        if(j == 0){
            System.out.printf("  No data available%n%n");
        }

        j = 0;
        System.out.printf("Cooks:%n");
        for(Employee employee: employees){
            if(employee instanceof Cook){
                employee.getInfo();
                j++;
            }
        }
        if(j == 0){
            System.out.printf("  No data available%n%n");
        }

        j = 0;
        System.out.printf("Lawyers:%n");
        for(Employee employee: employees){
            if(employee instanceof Lawyer){
                employee.getInfo();
                j++;
            }
        }
        if(j == 0){
            System.out.printf("  No data available%n%n");
        }

        j = 0;
        System.out.printf("Drivers:%n");
        for(Employee employee: employees){
            if(employee instanceof Driver){
                employee.getInfo();
                j++;
            }
        }
        if(j == 0){
            System.out.printf("  No data available%n%n");
        }

        j = 0;
        System.out.printf("Personal trainers:%n");
        for(Employee employee: employees){
            if(employee instanceof Personal){
                employee.getInfo();
                j++;
            }
        }
        if(j == 0){
            System.out.printf("  No data available%n%n");
        }
    }

    void employees(List<Employee> employees) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%nEmployees report%n%n");

        printTeamInformation(employees);
        printGeneralServicesInformation(employees);

        input.nextLine();
    }


    private void printTransportInformation(List<Resource> resources){
        System.out.printf("%nTransports:%n");
        Format format = new Format();

        List<Bus> buses = format.getBusesList(resources);
        if(buses.size() <= 0){
            System.out.printf("No data available%n%n");
        } else {
            for(Bus bus: buses){
                System.out.printf("  Bus %d - ", bus.getId());
                if(bus.isAvailable()) System.out.print("Available");
                else System.out.print("Unavailable");
                System.out.printf("%n  Seats: %d%n%n", bus.getSeatsNumber());
            }
        }
    }

    private void printTrainingCenterInformation(List<Resource> resources){
        Format format = new Format();

        TrainingCenter training_center = format.getTrainingCenter(resources);

        System.out.printf("%nTraining center information:%n");
        if(training_center == null){
            System.out.printf("  There is no training center%n%n");
        } else {
            System.out.printf("  Dorms: %d%n%n", training_center.getDorms());
        }
    }

    private void printStadiumInformation(List<Resource> resources){
        Format format = new Format();

        Stadium stadium = format.getStadium(resources);

        System.out.printf("%nStadium information:%n");
        if(stadium == null){
            System.out.printf("  There is no stadium%n%n");
        } else {
            System.out.printf("  Stadium capacity: %d people%n" +
                    "  Restrooms: %d%n" +
                    "  Fastfood: %d%n%n", stadium.getCapacity(), stadium.getRestrooms(), stadium.getFastfoods());
        }
    }

    void resources(List<Resource> resources){
        Scanner input = new Scanner(System.in);
        System.out.printf("%nResources report%n");

        printTransportInformation(resources);
        printStadiumInformation(resources);
        printTrainingCenterInformation(resources);

        input.nextLine();
    }


    private void printPartnersInformation(List<Partner> partners) {
        System.out.printf("%n%d Partners registered%n", partners.size());
        int on_time = 0;

        for(Partner partner: partners)
            if(partner.getSituation()) on_time++;

        System.out.printf("%d Partners on time%n" +
                "%d Partners overdue%n%n", on_time, partners.size() - on_time);

        System.out.printf("%nOn time models.partners:%n");
        int j = 0;
        for(Partner partner: partners){
            if(partner.getSituation()){
                partner.getInfo();
                j++;
            }
        }
        if(j == 0){
            System.out.printf("There is no partner On time%n%n");
        }

        j = 0;
        System.out.printf("%nOverdue models.partners:%n");
        for(Partner partner: partners){
            if(!partner.getSituation()){
                partner.getInfo();
                j++;
            }
        }
        if(j == 0){
            System.out.printf("There is no Overdue models.partners%n%n");
        }
    }

    void partners(List<Partner> partners){
        Scanner input = new Scanner(System.in);

        System.out.printf("%nPartners report%n");
        printPartnersInformation(partners);

        input.nextLine();
    }


    void general(List<Employee> employees, List<Resource> resources, List<Partner> partners){
        Scanner input = new Scanner(System.in);

        printTeamInformation(employees);
        printGeneralServicesInformation(employees);
        printTransportInformation(resources);
        printStadiumInformation(resources);
        printTrainingCenterInformation(resources);
        printPartnersInformation(partners);

        input.nextLine();
    }
}
