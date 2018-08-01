package recursos;

import java.io.Serializable;

public class Onibus implements Serializable {

    private int id;
    private int num_lugares;
    private boolean disponivel;

    public Onibus(int id, int num_lugares, boolean disponivel){
        this.id = id;
        this.num_lugares = num_lugares;
        this.disponivel = disponivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum_lugares() {
        return num_lugares;
    }

    public void setNum_lugares(int num_lugares) {
        this.num_lugares = num_lugares;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
