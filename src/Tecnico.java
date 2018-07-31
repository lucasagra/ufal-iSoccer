import java.io.Serializable;

public class Tecnico extends Funcionario implements Serializable {

    private String cargo;

    public Tecnico(String nome, String email, int salario, String cpf, String telefone){
        super(nome, email, salario, cpf, telefone);
        this.cargo = "Técnico";
    }
}
