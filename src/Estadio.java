import java.io.Serializable;

public class Estadio implements Serializable {
    private boolean disponivel;
    private int capacidade;
    private int banheiros;
    private int lanchonetes;

    public Estadio(boolean disponivel, int capacidade, int banheiros, int lanchonetes){
        this.disponivel = disponivel;
        this.capacidade = capacidade;
        this.banheiros = banheiros;
        this.lanchonetes = lanchonetes;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public int getLanchonetes() {
        return lanchonetes;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public void setLanchonetes(int lanchonetes) {
        this.lanchonetes = lanchonetes;
    }
}
