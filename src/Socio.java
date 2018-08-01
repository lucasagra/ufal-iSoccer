import java.io.Serializable;

public class Socio implements Serializable {
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private String endereco;
    private int contribuicao;
    private String situacao;
    private String nivel;

    public Socio(String nome, String cpf, String email, String telefone, String endereco, int contribuicao, Niveis niveis) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.contribuicao = contribuicao;
        this.situacao = "Adimplente";

        if(contribuicao > niveis.getElite()){
            this.nivel = "Elite";
        } else if(contribuicao > niveis.getSenior()) {
            this.nivel = "Senior";
        } else this.nivel = "Junior";
    }

    public String getCpf(){return this.cpf;}
    public String getNome(){return this.nome;}
    public String getSituacao(){return this.situacao;}
    public String getNivel(){return this.nivel;}
    public void setSituacao(String situacao){
        this.situacao = situacao;
    }
    public void setNivel(Niveis niveis){
        if(contribuicao > niveis.getElite()){
            this.nivel = "Elite";
        } else if(contribuicao > niveis.getSenior()) {
            this.nivel = "Senior";
        } else this.nivel = "Junior";
    }

    public void getInfo() {
        System.out.println("  Nome: " + nome);
        System.out.println("  CPF: " + cpf);
        if(this.situacao.equals("Adimplente")) System.out.println("  Nivel: " + nivel);
        System.out.println("  E-mail: " + email);
        System.out.println("  Telefone: " + telefone);
        System.out.println("  Endereço: " + endereco);
        System.out.println("  Contribuição: R$" + contribuicao);
        System.out.printf("%n");
    }
}
