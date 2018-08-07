package resources;

import auxiliaries.Control;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class Bus extends Resources implements Serializable {

    private int id;
    private int seats;

    private Bus(int id, int seats, boolean available){
        super(available);
        this.id = id;
        this.seats = seats;
    }

    public int getId() {
        return id;
    }

    public int getSeatsNumber() {
        return seats;
    }

    public static void manage(List<Resources> resources) {
        Scanner input = new Scanner(System.in);
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

        int option = control.inputSelect();

        if(option == 1) {
            System.out.print("Seats: ");
            int seats = control.stringToInt(input.nextLine());
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

            int choice = control.inputSelect();

            switch (choice){
                case 1:
                    resources.get(option).setAvailable(true);
                    break;
                case 2:
                    resources.get(option).setAvailable(false);
                    break;
                default:
                    control.operationAborted();
                    break;
            }
        }
    }
}
