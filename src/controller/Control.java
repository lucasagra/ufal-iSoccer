package controller;

import models.employees.*;
import models.partners.Partner;
import models.resources.Bus;
import models.resources.Resource;
import models.resources.Stadium;
import models.resources.TrainingCenter;
import utils.Format;
import utils.Getinfo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Control {
    public boolean employeeCpfInUse(List<Employee> employees, String cpf){
        for(Employee employee: employees){
            if(cpf.equals(employee.getCpf())) return true;
        }

        return false;
    }

    public boolean partnerCpfInUse(List<Partner> partners, String cpf){
        for(Partner partner: partners){
            if(cpf.equals(partner.getCpf())) return true;
        }

        return false;
    }

    public List<Bus> getBusesList(List<Resource> resources){
        List<Bus> buses = new ArrayList<>();

        for(Resource resource: resources){
            if(resource instanceof Bus){
                buses.add((Bus) resource);
            }
        }

        return buses;
    }

    public Stadium getStadium(List<Resource> resources){
        for(Resource resource: resources) {
            if(resource instanceof Stadium)  {
                return (Stadium) resource;
            }
        }

        return null;
    }

    public TrainingCenter getTrainingCenter(List<Resource> resources){
        for (Resource resource: resources) {
            if(resource instanceof TrainingCenter){
                return (TrainingCenter) resource;
            }
        }

        return null;
    }

    public int stadiumIndex(List<Resource> resources){

        for(int index = 0; index < resources.size(); index++){
            if(resources.get(index) instanceof Stadium)  {
                return index;
            }
        }

        return -1;
    }

    public int trainingCenterIndex(List<Resource> resources){

        for(int index = 0; index < resources.size(); index++){
            if(resources.get(index) instanceof TrainingCenter)  {
                return index;
            }
        }

        return -1;
    }

    public List<Integer> busIndexes(List<Resource> resources) {
        List<Integer> indexes = new ArrayList<>();

        for(int i = 0; i < resources.size(); i++){
            if(resources.get(i) instanceof Bus){
                indexes.add(i);
            }
        }

        return indexes;
    }

    private President presidentFactory(String name, String email, int salary, String cpf, String phone){
        return new President(name, email, salary, cpf, phone);
    }

    private Driver driverFactory(String name, String email, int salary, String cpf, String phone){
        Getinfo info = new Getinfo();
        String driver_license = info.inputUserDriverLicense();
        return new Driver(name, email, salary, cpf, phone, driver_license);
    }

    private Coach coachFactory(String name, String email, int salary, String cpf, String phone){
        return new Coach(name, email, salary, cpf, phone);
    }

    private Cook cookFactory(String name, String email, int salary, String cpf, String phone){
        return new Cook(name, email, salary, cpf, phone);
    }

    private Doctor doctorFactory(String name, String email, int salary, String cpf, String phone){
        Getinfo info = new Getinfo();
        String crm = info.inputUserCRM();
        return new Doctor(name, email, salary, cpf, phone, crm);
    }

    private Lawyer lawyerFactory(String name, String email, int salary, String cpf, String phone){
        return new Lawyer(name, email, salary, cpf, phone);
    }

    private  Personal personalFactory(String name, String email, int salary, String cpf, String phone){
        return new Personal(name, email, salary, cpf, phone);
    }

    private Player playerFactory(String name, String email, int salary, String cpf, String phone) {
        Format format = new Format();

        int option = -1;
        String type = "";

        while(option < 0 || option > 7) {
            System.out.println("What role this player do?");
            System.out.printf("%n1 - Defensive midfielder" +
                    "%n2 - Defender" +
                    "%n3 - Midfielder" +
                    "%n4 - Goalkeeper" +
                    "%n5 - Attack" +
                    "%n6 - Left-back" +
                    "%n7 - Right-back" +
                    "%n0 - Cancel%n%n");

            try {
                option = format.inputSelect();

                switch (option) {
                    case 0:
                        break;
                    case 1:
                        type = "Defensive midfielder";
                        break;
                    case 2:
                        type = "Defender";
                        break;
                    case 3:
                        type = "Midfielder";
                        break;
                    case 4:
                        type = "Goalkeeper";
                        break;
                    case 5:
                        type = "Attack";
                        break;
                    case 6:
                        type = "Left-back";
                        break;
                    case 7:
                        type = "Right-back";
                        break;
                    default:
                        throw new InputMismatchException();
                }
            } catch (InputMismatchException e){
                format.invalidInput();
            }
        }

        System.out.printf("%nIs the player apt to play?%n" +
                "1 - Yes%n" +
                "0 - No%n%n");

        option = format.inputSelect();

        boolean apt = (option == 1);
        return new Player(name, email, salary, cpf, phone, type, apt);
    }

    public void newEmployee(List<Employee> employees){
        System.out.println("Enter employee data:");

        Scanner input = new Scanner(System.in);
        Getinfo info = new Getinfo();
        Format format = new Format();

        String name = info.inputUserName();
        String cpf = info.inputUserCpf();

        if(employeeCpfInUse(employees, cpf)) {
            System.out.println("This cpf is already in use.");
            format.operationAborted();
            return;
        }

        String email = info.inputUserEmail();
        String phone = info.inputUserPhone();
        int salary = info.inputUserSalary();

        int type = -1;
        Employee tmp = null;

        while(type < 0 || type > 8) {
            try {
                type = info.getEmployeeType();
                switch (type) {
                    case 0:
                        break;
                    case 1:
                        tmp = presidentFactory(name, email, salary, cpf, phone);
                        break;
                    case 2:
                        tmp = doctorFactory(name, email, salary, cpf, phone);
                        break;
                    case 3:
                        tmp = coachFactory(name, email, salary, cpf, phone);
                        break;
                    case 4:
                        tmp = personalFactory(name, email, salary, cpf, phone);
                        break;
                    case 5:
                        tmp = driverFactory(name, email, salary, cpf, phone);
                        break;
                    case 6:
                        tmp = cookFactory(name, email, salary, cpf, phone);
                        break;
                    case 7:
                        tmp = lawyerFactory(name, email, salary, cpf, phone);
                        break;
                    case 8:
                        tmp = playerFactory(name, email, salary, cpf, phone);
                        break;
                    default:
                        throw new InputMismatchException();
                }
            } catch (InputMismatchException e){
                format.invalidInput();
            }
        }

        if (tmp != null) {
            employees.add(tmp);
            System.out.printf("%nEmployee successfully added.%n");
            input.nextLine();
        }
    }
}
