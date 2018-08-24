package models.resources;

import java.io.Serializable;

public class TrainingCenter extends Resource implements Serializable {
    private int dorms;

    public TrainingCenter(boolean available, int dorms){
        super(available);
        this.dorms = dorms;
    }

    public int getDorms() {
        return dorms;
    }

    public void setDorms(int dorms) {
        this.dorms = dorms;
    }

}
