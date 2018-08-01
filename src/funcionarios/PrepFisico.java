package funcionarios;

import java.io.Serializable;

public class PrepFisico extends Funcionario implements Serializable {
    private String cargo;

    public PrepFisico(String nome, String email, int salario, String cpf, String telefone){
        super(nome, email, salario, cpf, telefone);
        this.cargo = "Preparador físico";
    }
}
