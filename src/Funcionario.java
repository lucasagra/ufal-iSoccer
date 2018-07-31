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

    public String getNome(){return this.nome;}
    public String getEmail(){return this.email;}
    public int getSalario(){return this.salario;}
    public String getCpf(){return this.cpf;}
    public String getTel(){return this.telefone;}
}