import java.io.Serializable;

public class Medico extends Funcionario implements Serializable {
    private String cargo;
    private String crm;

    public Medico(String nome, String email, int salario, String cpf, String telefone, String crm){
        super(nome, email, salario, cpf, telefone);
        this.cargo = "Médico";
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }
}
