package models.resources;
import java.io.Serializable;

public class Stadium extends Resource implements Serializable {
    private int capacity;
    private int restrooms;
    private int fastfoods;

    public Stadium(boolean available, int capacity, int restrooms, int fastfoods){
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

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRestrooms(int restrooms) {
        this.restrooms = restrooms;
    }

    public void setFastfoods(int fastfoods) {
        this.fastfoods = fastfoods;
    }

}
