import java.io.Serializable;

public class CT implements Serializable {
    private boolean disponivel;
    private int dormitorios;

    public CT(boolean disponivel, int dormitorios){
        this.disponivel = disponivel;
        this.dormitorios = dormitorios;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(int dormitorios) {
        this.dormitorios = dormitorios;
    }
}
