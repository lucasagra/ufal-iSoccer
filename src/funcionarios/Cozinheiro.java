package funcionarios;

import java.io.Serializable;

public class Cozinheiro extends Funcionario implements Serializable {
    private String cargo;

    public Cozinheiro(String nome, String email, int salario, String cpf, String telefone){
        super(nome, email, salario, cpf, telefone);
        this.cargo = "Cozinheiro";
    }

}
