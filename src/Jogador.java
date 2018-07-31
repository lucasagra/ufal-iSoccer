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

    public void getInfo(){
        System.out.println(super.getNome());
        System.out.println(super.getEmail());
        System.out.println(super.getSalario());
        System.out.println(super.getCpf());
        System.out.println(super.getTel());
        System.out.println(cargo);
        System.out.println(tipo);
        System.out.println(apto);
    }

}
