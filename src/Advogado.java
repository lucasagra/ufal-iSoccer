import java.io.Serializable;

public class Advogado extends Funcionario implements Serializable {
    private String cargo;

    public Advogado(String nome, String email, int salario, String cpf, String telefone){
        super(nome, email, salario, cpf, telefone);
        this.cargo = "Advogado";
    }
}
