package funcionarios;

import java.io.Serializable;

public class Presidente extends Funcionario implements Serializable {
    private String cargo;

    public Presidente(String nome, String email, int salario, String cpf, String telefone){
        super(nome, email, salario, cpf, telefone);
        this.cargo = "Presidente";
    }
}
