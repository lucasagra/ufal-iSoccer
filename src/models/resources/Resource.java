package models.resources;

import java.io.Serializable;
import java.util.Scanner;

public class Resource implements Serializable {

    private boolean available;

    Resource(boolean available){
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    void setAvailable(boolean available) {
        Scanner input = new Scanner(System.in);

        this.available = available;
        System.out.printf("Change successful%n%n");
        input.nextLine();
    }
}
