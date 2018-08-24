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
    private boolean employeeCpfInUse(List<Employee> employees, String cpf){
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

    private int stadiumIndex(List<Resource> resources){

        for(int index = 0; index < resources.size(); index++){
            if(resources.get(index) instanceof Stadium)  {
                return index;
            }
        }

        return -1;
    }

    private int trainingCenterIndex(List<Resource> resources){

        for(int index = 0; index < resources.size(); index++){
            if(resources.get(index) instanceof TrainingCenter)  {
                return index;
            }
        }

        return -1;
    }

    private List<Integer> busIndexes(List<Resource> resources) {
        List<Integer> indexes = new ArrayList<>();

        for(int i = 0; i < resources.size(); i++){
            if(resources.get(i) instanceof Bus){
                indexes.add(i);
            }
        }

        return indexes;
    }

    public void manageBuses(List<Resource> resources) {
        Scanner input = new Scanner(System.in);
        Format format = new Format();
        Control control = new Control();

        List<Integer> bus_indexes = control.busIndexes(resources);

        System.out.printf("1 - Add bus%n");
        for(int i = 0; i < bus_indexes.size(); i++) {
            if(resources.get(bus_indexes.get(i)) instanceof Bus) {
                System.out.printf("%d - Bus id: %d - %d seats - ", i + 2, ((Bus) resources.get(bus_indexes.get(i))).getId(), ((Bus) resources.get(bus_indexes.get(i))).getSeatsNumber());
                if (resources.get(bus_indexes.get(i)).isAvailable()) System.out.printf("Available%n");
                else System.out.printf("Unavailable%n");
            }
        }

        int option = format.inputSelect();

        if(option == 1) {
            System.out.print("Seats: ");
            int seats = format.stringToInt(input.nextLine());
            if (seats > 0) {
                resources.add(new Bus(resources.size()+1, seats, true));
                System.out.printf("%nBus successfully added.%n%n");
                input.nextLine();
            }
        } else if (option-2 >= 0 && option-2 < bus_indexes.size()) {
            option = bus_indexes.get(option-2);
            System.out.printf("%nSelected: Bus %d%n", ((Bus)resources.get(option)).getId());
            System.out.printf("Change bus situation:%n" +
                    "1 - Available%n" +
                    "2 - Unavailable%n");

            int choice = format.inputSelect();

            switch (choice){
                case 1:
                    resources.get(option).setAvailable(true);
                    break;
                case 2:
                    resources.get(option).setAvailable(false);
                    break;
                default:
                    format.operationAborted();
                    break;
            }
        }
    }

    public void manageStadium(List<Resource> resources) {
        Scanner input = new Scanner(System.in);
        Format format = new Format();
        Control control = new Control();
        Getinfo info = new Getinfo();

        int stadium_index = control.stadiumIndex(resources);

        if(stadium_index < 0){
            System.out.printf("%nStadium unavailable%n%n" +
                    "1 - Add stadium%n" +
                    "0 - Cancel%n%n");

            int option = format.inputSelect();

            if(option == 1) {
                int capacity = info.getStadiumCapacity();
                int restrooms = info.getRestroomsNumber();
                int fastfoods = info.getFastfoodsNumber();
                resources.add(new Stadium(true, capacity, restrooms, fastfoods));

                System.out.printf("%nStadium successfully added.%n%n");
            }
        } else {
            System.out.printf("%nStadium information" +
                    "%n1 - Change capacity" +
                    "%n2 - Change restrooms number" +
                    "%n3 - Change fastfoods number" +
                    "%n4 - Remove stadium" +
                    "%n0 - Cancel%n%n");

            int option = format.inputSelect();

            switch (option){
                case 1:
                    int capacity = info.getStadiumCapacity();
                    ((Stadium) resources.get(stadium_index)).setCapacity(capacity);
                    System.out.printf("%nCapacity successfully changed.%n%n");
                    input.nextLine();
                    break;
                case 2:
                    int restrooms = info.getRestroomsNumber();
                    ((Stadium) resources.get(stadium_index)).setRestrooms(restrooms);
                    System.out.printf("%nRestrooms number successfully changed.%n%n");
                    input.nextLine();
                    break;
                case 3:
                    int fastfoods = info.getFastfoodsNumber();
                    ((Stadium) resources.get(stadium_index)).setFastfoods(fastfoods);
                    System.out.printf("%nFastfoods number successfully changed.%n%n");
                    input.nextLine();
                    break;
                case 4:
                    System.out.printf("Do you want to remove the stadium?%n" +
                            "1 - Yes%n" +
                            "0 - Cancel%n");

                    option = format.inputSelect();

                    if(option == 1){
                        resources.remove(stadium_index);
                        System.out.printf("%nStadium successfully removed.%n%n");
                        input.nextLine();
                    } else {
                        format.operationAborted();
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public void manageTrainingCenter(List<Resource> resources) {
        Scanner input = new Scanner(System.in);
        Format format = new Format();
        Control control = new Control();
        Getinfo info = new Getinfo();

        int trainingcenter_index = control.trainingCenterIndex(resources);

        if(trainingcenter_index < 0){
            System.out.printf("%nTraining center unavailable.%n%n" +
                    "1 - Add training center%n" +
                    "0 - Cancel%n%n");

            int option = format.inputSelect();

            if(option == 1) {
                int dorms = info.getDormsNumber();
                resources.add(new TrainingCenter(true, dorms));
                System.out.printf("%nTraining center successfully added.%n%n");
                input.nextLine();
            }
        } else {
            System.out.printf("%nTraining center information:" +
                    "%n1 - Change dorms number" +
                    "%n2 - Remove training center" +
                    "%n0 - Cancel%n%n");

            int option = format.inputSelect();

            switch (option){
                case 1:
                    int dorms = info.getDormsNumber();
                    ((TrainingCenter) resources.get(trainingcenter_index)).setDorms(dorms);
                    System.out.printf("%nDorms number successfully changed.%n%n");
                    input.nextLine();
                    break;
                case 2:
                    System.out.printf("Do you want to remove the training center?%n" +
                            "1 - Yes%n" +
                            "0 - Cancel%n" +
                            "");

                    option = format.inputSelect();

                    if(option == 1){
                        resources.remove(trainingcenter_index);
                        System.out.printf("%nTraining center successfully removed.%n%n");
                        input.nextLine();
                    } else {
                        format.operationAborted();
                    }
                    break;
                default:
                    break;
            }
        }
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
