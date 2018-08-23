package data;

import models.resources.Bus;
import models.resources.Stadium;
import models.resources.TrainingCenter;

import java.util.ArrayList;
import java.util.List;

public class ResourcesData {
    private Stadium stadium;
    private TrainingCenter training_center;
    private List<Bus> buses = new ArrayList<>();

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public TrainingCenter getTraining_center() {
        return training_center;
    }

    public void setTraining_center(TrainingCenter training_center) {
        this.training_center = training_center;
    }

    public List<Bus> getBuses() {
        return buses;
    }

    public void addBus(Bus bus) {
        this.buses.add(bus);
    }
}
