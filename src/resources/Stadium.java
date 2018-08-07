package resources;

import auxiliaries.Control;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class Stadium extends Resources implements Serializable {
    private int capacity;
    private int restrooms;
    private int fastfoods;

    private Stadium(boolean available, int capacity, int restrooms, int fastfoods){
        super(available);
        this.capacity = capacity;
        this.restrooms = restrooms;
        this.fastfoods = fastfoods;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRestrooms() {
        return restrooms;
    }

    public int getFastfoods() {
        return fastfoods;
    }

    private void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private void setRestrooms(int restrooms) {
        this.restrooms = restrooms;
    }

    private void setFastfoods(int fastfoods) {
        this.fastfoods = fastfoods;
    }

    public static void manage(List<Resources> resources) {
        Scanner input = new Scanner(System.in);
        Control control = new Control();

        int stadium_index = control.stadiumIndex(resources);

        if(stadium_index < 0){
            System.out.printf("%nStadium unavailable%n%n" +
                    "1 - Add stadium%n" +
                    "0 - Cancel%n%n");

            int option = control.inputSelect();

            if(option == 1) {
                System.out.print("Stadium capacity: ");
                int capacity = control.stringToInt(input.nextLine());
                if (capacity <= 0){
                    control.operationAborted();
                    return;
                }
                System.out.print("Restrooms number: ");
                int restrooms = control.stringToInt(input.nextLine());
                if (restrooms < 0){
                    control.operationAborted();
                    return;
                }
                System.out.print("Fastfoods number: ");
                int fastfoods = control.stringToInt(input.nextLine());
                if (fastfoods < 0){
                    control.operationAborted();
                    return;
                }
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

            int option = control.inputSelect();

            switch (option){
                case 1:
                    System.out.print("New capacity: ");
                    int capacity = control.stringToInt(input.nextLine());
                    if (capacity <= 0){
                        control.operationAborted();
                    } else {
                        ((Stadium) resources.get(stadium_index)).setCapacity(capacity);
                        System.out.printf("%nCapacity successfully changed.%n%n");
                        input.nextLine();
                    }
                    break;
                case 2:
                    System.out.print("New restrooms number: ");
                    int restrooms = control.stringToInt(input.nextLine());
                    if (restrooms < 0){
                        control.operationAborted();
                    } else {
                        ((Stadium) resources.get(stadium_index)).setRestrooms(restrooms);
                        System.out.printf("%nRestrooms number successfully changed.%n%n");
                        input.nextLine();
                    }
                    break;
                case 3:
                    System.out.print("New fastfoods number: ");
                    int fastfoods = control.stringToInt(input.nextLine());
                    if (fastfoods < 0){
                        control.operationAborted();
                    } else {
                        ((Stadium) resources.get(stadium_index)).setFastfoods(fastfoods);
                        System.out.printf("%nFastfoods number successfully changed.%n%n");
                        input.nextLine();
                    }
                    break;
                case 4:
                    System.out.printf("Do you want to remove the stadium?%n" +
                            "1 - Yes%n" +
                            "0 - Cancel%n");

                    option = control.inputSelect();

                    if(option == 1){
                        resources.remove(stadium_index);
                        System.out.printf("%nStadium successfully removed.%n%n");
                        input.nextLine();
                    } else {
                        control.operationAborted();
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
