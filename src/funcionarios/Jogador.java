package funcionarios;

import java.io.Serializable;

public class Jogador extends Funcionario implements Serializable {
    private String cargo;
    private String tipo;
    private boolean apto;

    public Jogador(String nome, String email, int salario, String cpf, String telefone, String tipo, boolean apto){
        super(nome, email, salario, cpf, telefone);
        this.cargo = "Jogador";
        this.tipo = tipo;
        this.apto = apto;
    }



    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isApto() {
        return apto;
    }

    public void setApto(boolean apto) {
        this.apto = apto;
    }
}
