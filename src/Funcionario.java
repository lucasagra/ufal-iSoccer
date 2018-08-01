import java.io.Serializable;

public class Funcionario implements Serializable {
    private String nome;
    private String email;
    private int salario;
    private String cpf;
    private String telefone;

    public Funcionario(String nome, String email, int salario, String cpf, String telefone){
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public void getInfo(){
        System.out.println("  Nome: " + this.nome);
        System.out.println("  CPF: " + this.cpf);
        System.out.println("  E-mail: " + this.email);
        System.out.println("  Telefone: " + this.telefone);
        System.out.println("  Salário: R$" + this.salario);
        System.out.printf("%n");
    }

    public String getNome(){return this.nome;}
    public String getEmail(){return this.email;}
    public int getSalario(){return this.salario;}
    public String getCpf(){return this.cpf;}
    public String getTel(){return this.telefone;}
}