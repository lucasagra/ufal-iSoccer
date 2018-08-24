package models.resources;

import controller.Control;
import utils.Format;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class Bus extends Resource implements Serializable {

    private int id;
    private int seats;

    public Bus(int id, int seats, boolean available){
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

}
