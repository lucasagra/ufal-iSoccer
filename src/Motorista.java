import java.io.Serializable;

public class Motorista extends Funcionario implements Serializable {
    private String cargo;
    private String habilitacao;

    public Motorista(String nome, String email, int salario, String cpf, String telefone, String habilitacao){
        super(nome, email, salario, cpf, telefone);
        this.cargo = "Motorista";
        this.habilitacao = habilitacao;
    }

}
