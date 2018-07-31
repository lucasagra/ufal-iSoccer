import java.io.Serializable;

public class Presidente extends Funcionario implements Serializable {
    private String cargo;

    public Presidente(String nome, String email, int salario, String cpf, String telefone){
        super(nome, email, salario, cpf, telefone);
        this.cargo = "Presidente";
    }

    public void getInfo(){
        System.out.println(super.getNome());
        System.out.println(super.getEmail());
        System.out.println(super.getSalario());
        System.out.println(super.getCpf());
        System.out.println(super.getTel());
        System.out.println(cargo);
    }
}
