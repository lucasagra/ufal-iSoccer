import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static boolean funcionariosCpfJaExiste(List<Funcionario> funcionarios, String cpf){
        for(int i = 0; i < funcionarios.size(); i++){
            if(cpf.equals(funcionarios.get(i).getCpf())) return true;
        }

        return false;
    }

    private static Presidente addPresidente(List<Funcionario> funcionarios){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe os dados do Presidente:");
        System.out.print("Nome completo: ");
        String nome = input.nextLine();
        System.out.print("Cpf: ");
        String cpf = input.nextLine();
        if(funcionariosCpfJaExiste(funcionarios, cpf)) {
            System.out.println("Este cpf já é cadastrado no sistema.");
            return null;
        }
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Telefone: ");
        String telefone = input.nextLine();
        System.out.print("Salário(R$): ");
        int salario = stringToInt(input.nextLine());
        while(salario <= 0) {
            System.out.println("Digite um salário válido.");
            System.out.print("Salário(R$): ");
            salario = stringToInt(input.nextLine());
        }

        return new Presidente(nome, email, salario, cpf, telefone);
    }

    private static Medico addMedico(List<Funcionario> funcionarios){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe os dados do Médico:");
        System.out.print("Nome completo: ");
        String nome = input.nextLine();
        System.out.print("CRM: ");
        String crm = input.nextLine();
        System.out.print("Cpf: ");
        String cpf = input.nextLine();
        if(funcionariosCpfJaExiste(funcionarios, cpf)) {
            System.out.println("Este cpf já é cadastrado no sistema.");
            return null;
        }
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Telefone: ");
        String telefone = input.nextLine();
        System.out.print("Salário(R$): ");
        int salario = stringToInt(input.nextLine());
        while(salario <= 0) {
            System.out.println("Digite um salário válido.");
            System.out.print("Salário(R$): ");
            salario = stringToInt(input.nextLine());
        }

        return new Medico(nome, email, salario, cpf, telefone, crm);
    }

    private static Tecnico addTecnico(List<Funcionario> funcionarios){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe os dados do Técnico:");
        System.out.print("Nome completo: ");
        String nome = input.nextLine();
        System.out.print("Cpf: ");
        String cpf = input.nextLine();
        if(funcionariosCpfJaExiste(funcionarios, cpf)) {
            System.out.println("Este cpf já é cadastrado no sistema.");
            return null;
        }
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Telefone: ");
        String telefone = input.nextLine();
        System.out.print("Salário(R$): ");
        int salario = stringToInt(input.nextLine());
        while(salario <= 0) {
            System.out.println("Digite um salário válido.");
            System.out.print("Salário(R$): ");
            salario = stringToInt(input.nextLine());
        }

        return new Tecnico(nome, email, salario, cpf, telefone);
    }

    private static PrepFisico addPrepFisico(List<Funcionario> funcionarios){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe os dados do Preparador físico:");
        System.out.print("Nome completo: ");
        String nome = input.nextLine();
        System.out.print("Cpf: ");
        String cpf = input.nextLine();
        if(funcionariosCpfJaExiste(funcionarios, cpf)) {
            System.out.println("Este cpf já é cadastrado no sistema.");
            return null;
        }
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Telefone: ");
        String telefone = input.nextLine();
        System.out.print("Salário(R$): ");
        int salario = stringToInt(input.nextLine());
        while(salario <= 0) {
            System.out.println("Digite um salário válido.");
            System.out.print("Salário(R$): ");
            salario = stringToInt(input.nextLine());
        }

        return new PrepFisico(nome, email, salario, cpf, telefone);
    }

    private static Motorista addMotorista(List<Funcionario> funcionarios){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe os dados do Motorista:");
        System.out.print("Nome completo: ");
        String nome = input.nextLine();
        System.out.print("Número de habilitação: ");
        String hab = input.nextLine();
        System.out.print("Cpf: ");
        String cpf = input.nextLine();
        if(funcionariosCpfJaExiste(funcionarios, cpf)) {
            System.out.println("Este cpf já é cadastrado no sistema.");
            return null;
        }
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Telefone: ");
        String telefone = input.nextLine();
        System.out.print("Salário(R$): ");
        int salario = stringToInt(input.nextLine());
        while(salario <= 0) {
            System.out.println("Digite um salário válido.");
            System.out.print("Salário(R$): ");
            salario = stringToInt(input.nextLine());
        }

        return new Motorista(nome, email, salario, cpf, telefone, hab);
    }

    private static Cozinheiro addCozinheiro(List<Funcionario> funcionarios){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe os dados do Cozinheiro:");
        System.out.print("Nome completo: ");
        String nome = input.nextLine();
        System.out.print("Cpf: ");
        String cpf = input.nextLine();
        if(funcionariosCpfJaExiste(funcionarios, cpf)) {
            System.out.println("Este cpf já é cadastrado no sistema.");
            return null;
        }
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Telefone: ");
        String telefone = input.nextLine();
        System.out.print("Salário(R$): ");
        int salario = stringToInt(input.nextLine());
        while(salario <= 0) {
            System.out.println("Digite um salário válido.");
            System.out.print("Salário(R$): ");
            salario = stringToInt(input.nextLine());
        }
        return new Cozinheiro(nome, email, salario, cpf, telefone);
    }

    private static Advogado addAdvogado(List<Funcionario> funcionarios){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe os dados do Advogado:");
        System.out.print("Nome completo: ");
        String nome = input.nextLine();
        System.out.print("Cpf: ");
        String cpf = input.nextLine();
        if(funcionariosCpfJaExiste(funcionarios, cpf)) {
            System.out.println("Este cpf já é cadastrado no sistema.");
            return null;
        }
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Telefone: ");
        String telefone = input.nextLine();
        System.out.print("Salário(R$): ");
        int salario = stringToInt(input.nextLine());
        while(salario <= 0) {
            System.out.println("Digite um salário válido.");
            System.out.print("Salário(R$): ");
            salario = stringToInt(input.nextLine());
        }

        return new Advogado(nome, email, salario, cpf, telefone);
    }

    private static Jogador addJogador(List<Funcionario> funcionarios){
        Scanner input = new Scanner(System.in);
        String tipo = "10";

        while(!tipo.equals("0") && !tipo.equals("1") && !tipo.equals("2") && !tipo.equals("3") && !tipo.equals("4") && !tipo.equals("5") && !tipo.equals("6") && !tipo.equals("7")) {
            if(tipo.equals("0")) return null;

            System.out.println("Que tipo de jogador deseja adicionar?");
            System.out.printf("%n1 - Volante" +
                    "%n2 - Zagueiro" +
                    "%n3 - Meia" +
                    "%n4 - Goleiro" +
                    "%n5 - Atacante" +
                    "%n6 - Lateral esquerdo" +
                    "%n7 - Lateral direito" +
                    "%n0 - Cancelar");

            tipo = input.nextLine();
        }

        if(tipo.equals("1")) tipo = "Volante";
        else if(tipo.equals("2")) tipo = "Zagueiro";
        else if(tipo.equals("3")) tipo = "Meia";
        else if(tipo.equals("4")) tipo = "Goleiro";
        else if(tipo.equals("5")) tipo = "Atacante";
        else if(tipo.equals("6")) tipo = "Lateral esquerdo";
        else if(tipo.equals("7")) tipo = "Lateral direito";

        System.out.println("Informe os dados do Jogador:");
        System.out.print("Nome completo: ");
        String nome = input.nextLine();

        System.out.print("cpf: ");
        String cpf = input.nextLine();
        if(funcionariosCpfJaExiste(funcionarios, cpf)) {
            System.out.println("Este cpf já é cadastrado no sistema.");
            return null;
        }

        System.out.print("Email: ");
        String email = input.nextLine();

        System.out.print("Telefone: ");
        String telefone = input.nextLine();

        System.out.print("Salário(R$): ");
        int salario = stringToInt(input.nextLine());
        while(salario <= 0) {
            System.out.println("Digite um salário válido.");
            System.out.print("Salário(R$): ");
            salario = stringToInt(input.nextLine());
        }

        System.out.printf("O jogador esta apto para jogar?%n1 - Sim%n0 - Não");
        String option = input.nextLine();
        boolean apto = option.equals("1");

        return new Jogador(nome, email, salario, cpf, telefone, tipo, apto);
    }

    private static void adicionarFuncionario(List<Funcionario> funcionarios){
        Scanner input = new Scanner(System.in);
        String option = "10";

        while(!option.equals("0") && !option.equals("1") && !option.equals("2") && !option.equals("3") && !option.equals("4") && !option.equals("5") && !option.equals("6") && !option.equals("7") && !option.equals("8")){
            System.out.printf("Que tipo de funcionário deseja adicionar?%n" +
                    "%n1 - Presidente" +
                    "%n2 - Médico" +
                    "%n3 - Técnico" +
                    "%n4 - Preparador físico" +
                    "%n5 - Motorista" +
                    "%n6 - Cozinheiro" +
                    "%n7 - Advogado" +
                    "%n8 - Jogador" +
                    "%n0 - Cancela%n");

            System.out.print("Selecione: ");
            option = input.nextLine();

            Funcionario aux = null;
            if (option.equals("0")) return;
            else if (option.equals("1")) {
                aux = addPresidente(funcionarios);
            } else if (option.equals("2")) {
                aux = addMedico(funcionarios);
            } else if (option.equals("3")) {
                aux = addTecnico(funcionarios);
            } else if (option.equals("4")) {
                aux = addPrepFisico(funcionarios);
            } else if (option.equals("5")) {
                aux = addMotorista(funcionarios);
            } else if (option.equals("6")) {
                aux = addCozinheiro(funcionarios);
            } else if (option.equals("7")) {
                aux = addAdvogado(funcionarios);
            } else if (option.equals("8")) {
                aux = addJogador(funcionarios);
            }
            if (aux != null) {
                funcionarios.add(aux);
                System.out.printf("%nFuncionário adicionado com sucesso.%n");
            }
        }
    }

    private static boolean sociosCpfJaExiste(List<Socio> socios, String cpf){
        for(int i = 0; i < socios.size(); i++){
            if(cpf.equals(socios.get(i).getCpf())) return true;
        }

        return false;
    }

    private static Socio addSocio(List<Socio> socios, Niveis niveis){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe os dados do Sócio-torcedor:");
        System.out.print("Nome completo: ");
        String nome = input.nextLine();
        System.out.print("Cpf: ");
        String cpf = input.nextLine();
        if(sociosCpfJaExiste(socios, cpf)) {
            System.out.println("Este cpf já é cadastrado no sistema, ");
            return null;
        }
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Telefone: ");
        String telefone = input.nextLine();
        System.out.print("Endereço: ");
        String endereco = input.nextLine();
        System.out.print("Contribuição(R$): ");
        int contribuicao = stringToInt(input.nextLine());
        while(contribuicao <= 0) {
            System.out.println("Digite uma contribuição válida.");
            System.out.print("Contribuição: ");
            contribuicao = stringToInt(input.nextLine());
        }

        return new Socio(nome, cpf, email, telefone, endereco, contribuicao, niveis);
    }

    private static int stringToInt(String string){
        try {
            int i = Integer.parseInt(string.trim());

            return i;
        }
        catch (NumberFormatException nfe)
        {
            return -1;
        }
    }

    private static void mostrarSocios(List<Socio> socios) {
        Scanner input = new Scanner(System.in);

        System.out.println("Aqui você pode visualizar a situação de pagamento de cada sócio, e altera-la caso necessário");
        System.out.printf("0 - Cancela%n");
        for(int i = 0; i < socios.size(); i++) {
            System.out.printf("%d - Nome: %s - CPF: %s - Nível: %s - Situação: %s%n", i+1, socios.get(i).getNome(), socios.get(i).getCpf(), socios.get(i).getNivel(), socios.get(i).getSituacao());
        }
        System.out.print("Selecione: ");
        int option = stringToInt(input.nextLine())-1;

        if(option >= 0 && option < socios.size()){
            System.out.printf("%nAlterar a situação de %s para:%n1 - Adimplente%n2 - Inadimplente%n0 - Cancela%n", socios.get(option).getNome());
            String choice = input.nextLine();
            if(choice.equals("1")){
                socios.get(option).setSituacao("Adimplente");
                System.out.println("Situação alterada com sucesso.");
            } else if(choice.equals("2")) {
                socios.get(option).setSituacao("Inadimplente");
                System.out.println("Situação alterada com sucesso.");
            }
        } else {
            return;
        }
    }

    private static void recalcularNiveis(List<Socio> socios, Niveis niveis){
        for(int i = 0; i < socios.size(); i++) {
            socios.get(i).setNivel(niveis);
        }
    }

    private static void atualizarValores(List<Socio> socios, Niveis niveis){
        Scanner input = new Scanner(System.in);
        System.out.printf("Os valores de niveis atuais são:%n0 - %d Junior%n%d - %d Senior%n%d - ... Elite%n%n",niveis.getSenior(), niveis.getSenior()+1, niveis.getElite(), niveis.getElite()+1);
        System.out.print("Digite o novo valor minimo para ser Senior: ");
        int senior = stringToInt(input.nextLine());
        System.out.print("Digite o novo valor minimo para ser Elite (maior que o senior): ");
        int elite = stringToInt(input.nextLine());
        if (senior > 0 && elite > 0 && elite > senior) {
            niveis.setNiveis(senior, elite);
            System.out.println("Níveis atualizados com sucesso.");
            recalcularNiveis(socios, niveis);
            System.out.println("Niveis dos sócios recalculados.");
        } else {
            System.out.println("Entradas inválidas.");
        }
    }

    private static void gerenciarSocios(List<Socio> socios, Niveis niveis) {
        Scanner input = new Scanner(System.in);
        String opcao = "10";

        while(!opcao.equals("0") && !opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3")) {
            System.out.printf("O que deseja fazer?" +
                    "%n1 - Adicionar sócio-torcedor" +
                    "%n2 - Gerenciar sócio-torcedores" +
                    "%n3 - Atualizar valores de contribuição associado aos níveis de sócio-torcedor" +
                    "%n0 - Cancela%n");

            System.out.print("Selecione: ");
            opcao = input.nextLine();

            if (opcao.equals("1")) {
                Socio aux = addSocio(socios, niveis);
                if (aux != null) {
                    socios.add(aux);
                    System.out.printf("%nSócio-torcedor adicionado com sucesso.%n");
                }
                opcao = "10";
            } else if (opcao.equals("2")) {
                mostrarSocios(socios);
                opcao = "10";
            } else if (opcao.equals("3")) {
                atualizarValores(socios, niveis);
                opcao = "10";
            } else if (opcao.equals("0")) {
                return;
            }
        }
    }

    private static boolean loginPage(String admin_user, String admin_password, List<Funcionario> funcionarios, List<Socio> socios, Niveis niveis){
        Scanner input = new Scanner(System.in);
        System.out.printf("Bem vindo ao iSoccer, gerenciador de time de futebol.%n%n");
        System.out.printf("Para entrar no sistema digite seu usuário e senha.%n");
        System.out.printf("0 - Sair%n");

        System.out.print("Seu usuario:");
        String ID = input.nextLine();
        if (ID.equals("0")){
            return false;
        }
        System.out.print("Sua senha:");
        String password = input.nextLine();

        while(!ID.equals(admin_user) || !password.equals(admin_password)){
            System.out.println("Usuario/Senha não combinam.");
            System.out.printf("0 - Sair%n");

            System.out.print("Seu usuario: ");
            ID = input.nextLine();
            if (ID.equals("0")){
                return false;
            }
            System.out.print("Sua senha: ");
            password = input.nextLine();
        }

        System.out.printf("%nLogin feito com sucesso.%n%n");

        String option = "10";

        while(!option.equals("0")) {
            System.out.printf("%n1 - Adicionar funcionario" +
                    "%n2 - Gerenciar sócio-torcedor" +
                    "%n3 - Gerenciar recursos físicos" +
                    "%n4 - Exibir relatórios" +
                    "%n0 - Sair%n%n");

            System.out.print("Escolha uma opção: ");
            option = input.nextLine();

            while (!option.equals("0") && !option.equals("1") && !option.equals("2") && !option.equals("3") && !option.equals("4")) {
                System.out.printf("%n1 - Adicionar funcionario" +
                        "%n2 - Gerenciar sócio-torcedor" +
                        "%n3 - Gerenciar recursos físicos" +
                        "%n4 - Exibir relatórios" +
                        "%n0 - Sair%n%n");

                System.out.print("Escolha uma opção: ");
                option = input.nextLine();
            }

            if (option.equals("1")) {
                adicionarFuncionario(funcionarios);
            } else if (option.equals("2")) {
                gerenciarSocios(socios, niveis);
            } else if (option.equals("3")) {

            } else if (option.equals("4")) {

            }
        }
        return true;
    }

    private static List<Funcionario> carregarFuncionarios(List<Funcionario> funcionarios){
        try {
            FileInputStream fis = new FileInputStream("funcionarios.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            funcionarios = (List<Funcionario>) ois.readObject();
            ois.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado, gerando novo arquivo de funcionarios.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return funcionarios;
    }

    private static List<Socio> carregarSocios(List<Socio> socios){
        try {
            FileInputStream fis = new FileInputStream("socios.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            socios = (List<Socio>) ois.readObject();
            ois.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado, gerando novo arquivo de sócios.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return socios;
    }

    private static void salvarDados(List<Funcionario> funcionarios, List<Socio> socios) {
        try {
            FileOutputStream fos = new FileOutputStream("funcionarios.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(funcionarios);
            oos.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fos = new FileOutputStream("socios.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(socios);
            oos.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Funcionario> funcionarios = carregarFuncionarios(new ArrayList<>());
        List<Socio> socios = carregarSocios(new ArrayList<>());
        Niveis niveis = new Niveis(100, 200);

        String user = "admin";
        String password = "123";

        boolean exit = loginPage(user, password, funcionarios, socios, niveis);

        while(exit){
            exit = loginPage(user, password, funcionarios, socios, niveis);
        }

        for(int i = 0; i < funcionarios.size(); i++){

            if (funcionarios.get(i) instanceof Jogador){
                ((Jogador) funcionarios.get(i)).getInfo();
            } else if(funcionarios.get(i) instanceof Presidente) {
                ((Presidente) funcionarios.get(i)).getInfo();
            }
        }
        salvarDados(funcionarios, socios);
    }
}
