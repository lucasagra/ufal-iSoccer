import funcionarios.*;
import recursos.CT;
import recursos.Estadio;
import recursos.Onibus;

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
                    "%n0 - Cancelar%n%n");

            System.out.print("Selecione: ");
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

        System.out.printf("O jogador esta apto para jogar?%n1 - Sim%n0 - Não%n%n");
        System.out.print("Selecione: ");
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
                    "%n0 - Cancela%n%n");

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

    private static void gerenciarOnibus(List<Onibus> onibus) {
        Scanner input = new Scanner(System.in);

        System.out.printf("1 - Adicionar ônibus%n");
        for(int i = 0; i < onibus.size(); i++) {
            System.out.printf("%d - Onibus %d - %d lugares - ", i+2, onibus.get(i).getId(), onibus.get(i).getNum_lugares());
            if(onibus.get(i).isDisponivel()) System.out.printf("Disponível%n");
            else System.out.printf("Não disponível%n");
        }

        System.out.print("Selecione: ");
        int option = stringToInt(input.nextLine());

        if(option == 1) {
            System.out.print("Digite o número de lugares do novo ônibus: ");
            int lugares = stringToInt(input.nextLine());
            if (lugares > 0) {
                onibus.add(new Onibus(onibus.size()+1, lugares, true));
                System.out.printf("Ônibus adicionado.%n%n");
            }
        } else if (option-2 >= 0 && option-2 < onibus.size()) {
            System.out.printf("%nSelecionado: Ônibus %d%n", onibus.get(option-2).getId());
            System.out.printf("Mudar situação do ônibus:%n1 - Disponível%n2 - Não disponível%n");
            System.out.print("Selecione: ");
            int choice = stringToInt(input.nextLine());
            if(choice == 1) {
                onibus.get(option-2).setDisponivel(true);
                System.out.printf("Alteração feita com sucesso.%n%n");
            } else if(choice == 2) {
                onibus.get(option-2).setDisponivel(false);
                System.out.printf("Alteração feita com sucesso.%n%n");
            } else {
                System.out.printf("Alteração cancelada.%n%n");
            }
        }
    }

    private static void gerenciarEstadio(Estadio estadio) {
        Scanner input = new Scanner(System.in);

        if(!estadio.isDisponivel()){
            System.out.printf("%nEstádio não disponivel.%n%n1 - Adicionar estádio%n0 - Cancela%n%n");
            System.out.print("Selecione: ");
            int option = stringToInt(input.nextLine());
            if(option == 1) {
                System.out.print("Digite a capacidade de pessoas: ");
                int capacidade = stringToInt(input.nextLine());
                if (capacidade <= 0){
                    System.out.println("Operação cancelada.%n%n");
                    return;
                }
                System.out.print("Digite a quantidade de banheiros: ");
                int banheiros = stringToInt(input.nextLine());
                if (banheiros < 0){
                    System.out.println("Operação cancelada.%n%n");
                    return;
                }
                System.out.print("Digite a quantidade de lanchonetes: ");
                int lanchonetes = stringToInt(input.nextLine());
                if (lanchonetes < 0){
                    System.out.println("Operação cancelada.%n%n");
                    return;
                }
                estadio.setDisponivel(true);
                estadio.setBanheiros(banheiros);
                estadio.setCapacidade(capacidade);
                estadio.setLanchonetes(lanchonetes);

                System.out.printf("%nEstádio adicionado com sucesso.%n%n");
            }
        } else {
            System.out.printf("%nInformações sobre o estádio:" +
                    "%n1 - Alterar capacidade" +
                    "%n2 - Alterar número de banheiros" +
                    "%n3 - Alterar número de anchonetes" +
                    "%n4 - Remover estádio" +
                    "%n0 - Cancela%n%n");
            System.out.print("Selecione: ");

            int option = stringToInt(input.nextLine());
            if(option == 1) {
                System.out.print("Digite a nova capacidade: ");
                int capacidade = stringToInt(input.nextLine());
                if (capacidade <= 0){
                    System.out.println("Operação cancelada.%n%n");
                } else {
                    estadio.setCapacidade(capacidade);
                    System.out.printf("%nCapacidade alterada com sucesso.%n%n");
                }
            } else if(option == 2){
                System.out.print("Digite a nova quantidade de banheiros: ");
                int banheiros = stringToInt(input.nextLine());
                if (banheiros < 0){
                    System.out.println("Operação cancelada.%n%n");
                } else {
                    estadio.setBanheiros(banheiros);
                    System.out.printf("%nNúmero de banheiros alterado com sucesso.%n%n");
                }
            } else if(option == 3){
                System.out.print("Digite a nova quantidade de lanchonetes: ");
                int lanchonetes = stringToInt(input.nextLine());
                if (lanchonetes < 0){
                    System.out.println("Operação cancelada.%n%n");
                } else {
                    estadio.setLanchonetes(lanchonetes);
                    System.out.printf("%nNúmero de lanchonetes alterado com sucesso.%n%n");
                }
            } else if(option == 4){
                System.out.printf("Deseja remover o estádio?%n1 - Sim%n");
                System.out.print("Selecione: ");
                option = stringToInt(input.nextLine());
                if(option == 1){
                    estadio.setDisponivel(false);
                }
                System.out.printf("%nEstádio removido com sucesso.%n%n");
            } else {
                return;
            }
        }
    }

    private static void gerenciarCT(CT centro_treinamento) {
        Scanner input = new Scanner(System.in);

        if(!centro_treinamento.isDisponivel()){
            System.out.printf("%nCentro de treinamento não disponivel.%n%n1 - Adicionar centro de treinamento%n0 - Cancela%n%n");
            System.out.print("Selecione: ");
            int option = stringToInt(input.nextLine());
            if(option == 1) {
                System.out.print("Digite o número de dormitórios: ");
                int dormitorios = stringToInt(input.nextLine());
                if (dormitorios < 0){
                    System.out.println("Operação cancelada.%n%n");
                    return;
                }

                centro_treinamento.setDisponivel(true);
                centro_treinamento.setDormitorios(dormitorios);

                System.out.printf("%nCentro de treinamento adicionado com sucesso.%n%n");
            }
        } else {
            System.out.printf("%nInformações sobre o Centro de treinamento:" +
                    "%n1 - Alterar número de dormitórios" +
                    "%n2 - Remover centro de treinamento" +
                    "%n0 - Cancela%n%n");
            System.out.print("Selecione: ");

            int option = stringToInt(input.nextLine());
            if(option == 1) {
                System.out.print("Digite o novo número de dormitórios: ");
                int dormitorios = stringToInt(input.nextLine());
                if (dormitorios < 0){
                    System.out.println("Operação cancelada.%n%n");
                } else {
                    centro_treinamento.setDormitorios(dormitorios);
                    System.out.printf("%nNúmero de dormitorios alterado com sucesso.%n%n");
                }
            } else if(option == 2){
                System.out.printf("Deseja remover o centro de treinamento?%n1 - Sim%n");
                System.out.print("Selecione: ");
                option = stringToInt(input.nextLine());
                if(option == 1){
                    centro_treinamento.setDisponivel(false);
                }
                System.out.printf("%nCentro de treinamento removido com sucesso.%n%n");
            } else {
                return;
            }
        }
    }

    private static void gerenciarRecursos(List<Onibus> onibus, Estadio estadio, CT centro_treinamento){
        Scanner input = new Scanner(System.in);

        int option = 1;
        while (option != 0) {
            System.out.println("Detalhes dos recursos do time:");
            System.out.printf("%n1 - Onibus:%n");

            if (onibus.size() == 0) {
                System.out.printf("  Não disponível%n");
            } else {
                for (int i = 0; i < onibus.size(); i++) {
                    System.out.printf("  Ônibus %d - ", onibus.get(i).getId());
                    if (onibus.get(i).isDisponivel()) System.out.printf("Disponível%n");
                    else System.out.printf("Não disponível%n");
                }
            }

            System.out.printf("%n2 - Estádio:%n");
            if (estadio.isDisponivel()) System.out.printf("  Disponível:%n" +
                    "    Capacidade: %d pessoas%n" +
                    "    Número de banheiros: %d%n" +
                    "    Número de lanchonetes: %d%n", estadio.getCapacidade(), estadio.getBanheiros(), estadio.getLanchonetes());
            else {
                System.out.printf("  Não disponível%n");
            }

            System.out.printf("%n3 - Centro de treinamento:%n");
            if (centro_treinamento.isDisponivel()) System.out.printf("  Disponível:%n" +
                    "    Número de dormitórios: %d%n", centro_treinamento.getDormitorios());
            else {
                System.out.printf("  Não disponível%n");
            }
            System.out.printf("%n0 - Cancela%n%n");
            System.out.print("Selecione: ");
            option = stringToInt(input.nextLine());

            if (option == 1) {
                gerenciarOnibus(onibus);
            } else if (option == 2) {
                gerenciarEstadio(estadio);
            } else if (option == 3) {
                gerenciarCT(centro_treinamento);
            } else if(option == 0) {
                return;
            }
        }
    }

    private static void gerarRelatorioFuncionarios(List<Funcionario> funcionarios) {

        System.out.printf("%nInformações sobre o time:%n%n");
        System.out.printf("Treinador:%n");
        int j = 0;
        for(int i = 0; i < funcionarios.size();i++){
            if (funcionarios.get(i) instanceof Tecnico) {
                funcionarios.get(i).getInfo();
                j++;
            }
        }
        if(j == 0){
            System.out.printf("  Não há dados%n%n");
        }

        j = 0;
        System.out.printf("Jogadores aptos:%n");
        for(int i = 0; i < funcionarios.size();i++){
            if (funcionarios.get(i) instanceof Jogador) {
                if(((Jogador) funcionarios.get(i)).isApto()){
                    System.out.printf("  Posição: %s%n", ((Jogador) funcionarios.get(i)).getTipo());
                    funcionarios.get(i).getInfo();
                    j++;
                }
            }
        }
        if(j == 0){
            System.out.printf("  Não há dados%n%n");
        }

        j = 0;
        System.out.printf("Jogadores não-aptos:%n");
        for(int i = 0; i < funcionarios.size();i++){
            if (funcionarios.get(i) instanceof Jogador) {
                if(!((Jogador) funcionarios.get(i)).isApto()){
                    System.out.printf("  Posição: %s%n", ((Jogador) funcionarios.get(i)).getTipo());
                    funcionarios.get(i).getInfo();
                    j++;
                }
            }
        }
        if(j == 0){
            System.out.printf("  Não há dados%n%n");
        }

        System.out.printf("%nInformações sobre serviços gerais:%n%n");
        j = 0;
        System.out.printf("Presidente:%n");
        for(int i = 0; i < funcionarios.size();i++){
            if (funcionarios.get(i) instanceof Presidente) {
                funcionarios.get(i).getInfo();
                j++;
            }
        }
        if(j == 0){
            System.out.printf("  Não há dados%n%n");
        }

        j = 0;
        System.out.printf("Médicos:%n");
        for(int i = 0; i < funcionarios.size();i++){
            if (funcionarios.get(i) instanceof Medico) {
                System.out.printf("  CRM: %s%n", ((Medico) funcionarios.get(i)).getCrm());
                funcionarios.get(i).getInfo();
                j++;
            }
        }
        if(j == 0){
            System.out.printf("  Não há dados%n%n");
        }

        j = 0;
        System.out.printf("Cozinheiros:%n");
        for(int i = 0; i < funcionarios.size();i++){
            if (funcionarios.get(i) instanceof Cozinheiro) {
                funcionarios.get(i).getInfo();
                j++;
            }
        }
        if(j == 0){
            System.out.printf("  Não há dados%n%n");
        }

        j = 0;
        System.out.printf("Advogados:%n");
        for(int i = 0; i < funcionarios.size();i++){
            if (funcionarios.get(i) instanceof Advogado) {
                funcionarios.get(i).getInfo();
                j++;
            }
        }
        if(j == 0){
            System.out.printf("  Não há dados%n%n");
        }

        j = 0;
        System.out.printf("Motoristas:%n");
        for(int i = 0; i < funcionarios.size();i++){
            if (funcionarios.get(i) instanceof Motorista) {
                System.out.printf("  Habilitação: %s%n", ((Motorista) funcionarios.get(i)).getHabilitacao());
                funcionarios.get(i).getInfo();
                j++;
            }
        }
        if(j == 0){
            System.out.printf("  Não há dados%n%n");
        }

        j = 0;
        System.out.printf("Preparadores físicos:%n");
        for(int i = 0; i < funcionarios.size();i++){
            if (funcionarios.get(i) instanceof PrepFisico) {
                funcionarios.get(i).getInfo();
                j++;
            }
        }
        if(j == 0){
            System.out.printf("  Não há dados%n%n");
        }
    }

    private static void gerarRelatorioRecursos(List<Onibus> onibus, Estadio estadio, CT centro_treinamento){

        System.out.printf("%nTransporte:%n");

        if(onibus.size() <= 0){
            System.out.printf("Nenhum cadastro disponível%n%n");
        } else {
            for(int i = 0; i < onibus.size(); i++) {
                System.out.printf("  Onibus %d - ", onibus.get(i).getId());
                if(onibus.get(i).isDisponivel()) System.out.printf("Disponível");
                else System.out.printf("Não disponível");
                System.out.printf("%n  Assentos: %d%n%n", onibus.get(i).getNum_lugares());
            }
        }
        System.out.printf("%nInformações sobre o centro de treinamento:%n");
        if(!centro_treinamento.isDisponivel()){
            System.out.printf("  Não há centro de treinamento disponível%n%n");
        } else {
            System.out.printf("  Número de dormitórios: %d%n%n", centro_treinamento.getDormitorios());
        }

        System.out.printf("%nInformações sobre o estádio:%n");
        if(!estadio.isDisponivel()){
            System.out.printf("  Não há estádio disponível%n%n");
        } else {
            System.out.printf("  Capacidade do estádio: %d pessoas%n" +
                    "  Número de banheiros: %d%n" +
                    "  Número de lanchonetes: %d%n%n", estadio.getCapacidade(), estadio.getBanheiros(), estadio.getLanchonetes());
        }
    }

    private static void gerarRelatorioSocios(List<Socio> socios){

        System.out.printf("%n%d Sócio(s)-torcedor(es) cadastrados%n", socios.size());
        int adimplentes = 0;

        for(int i = 0;i < socios.size();i++)
            if(socios.get(i).getSituacao().equals("Adimplente")) adimplentes++;

        System.out.printf("%d Sócio(s) adimplente(s)%n%d Sócio(s) inadimplente(s)%n%n", adimplentes, socios.size()-adimplentes);

        System.out.printf("%nSócios adimplentes:%n");
        int j = 0;
        for(int i = 0; i < socios.size(); i++){
            if(socios.get(i).getSituacao().equals("Adimplente")){
                socios.get(i).getInfo();
                j++;
            }
        }
        if(j == 0){
            System.out.printf("Não há sócios adimplentes%n%n");
        }

        j = 0;
        System.out.printf("%nSócios inadimplentes:%n");
        for(int i = 0; i < socios.size(); i++) {
            if (socios.get(i).getSituacao().equals("Inadimplente")) {
                socios.get(i).getInfo();
                j++;
            }
        }
        if(j == 0){
            System.out.printf("Não há sócios inadimplentes%n%n");
        }

    }

    private static void gerarRelatorios(List<Funcionario> funcionarios, List<Socio> socios, Niveis niveis, List<Onibus> onibus, Estadio estadio, CT centro_treinamento){
        Scanner input = new Scanner(System.in);

        System.out.printf("%nOpções de relatório:%n" +
                "1 - Relatório dos funcionários%n" +
                "2 - Relatório dos recursos físicos%n" +
                "3 - Relatório dos sócios%n" +
                "4 - Relatório geral%n" +
                "0 - Cancela%n%n");

        System.out.print("Selecione: ");
        int opcao = stringToInt(input.nextLine());

        if(opcao == 1) {
            System.out.printf("%nRelatório dos funcionários%n%n");
            gerarRelatorioFuncionarios(funcionarios);
        } else if (opcao == 2) {
            System.out.printf("%nRelatório dos recursos físicos%n");
            gerarRelatorioRecursos(onibus, estadio, centro_treinamento);
        } else if (opcao == 3) {
            System.out.printf("%nRelatório do sócio-torcedor%n");
            gerarRelatorioSocios(socios);
        } else if (opcao == 4) {
            System.out.printf("%nRelatório geral%n");
            gerarRelatorioFuncionarios(funcionarios);
            gerarRelatorioRecursos(onibus, estadio, centro_treinamento);
            gerarRelatorioSocios(socios);
        } else {
            return;
        }
    }

    private static boolean loginPage(String admin_user, String admin_password, List<Funcionario> funcionarios, List<Socio> socios, Niveis niveis, List<Onibus> onibus, Estadio estadio, CT centro_treinamento){
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

        System.out.printf("%nLogin feito com sucesso.%n");

        String option = "10";

        while(!option.equals("0")) {
            System.out.printf("%n1 - Adicionar funcionário" +
                    "%n2 - Gerenciar sócio-torcedor" +
                    "%n3 - Gerenciar recursos físicos" +
                    "%n4 - Exibir relatórios" +
                    "%n0 - Sair%n%n");

            System.out.print("Escolha uma opção: ");
            option = input.nextLine();

            while (!option.equals("0") && !option.equals("1") && !option.equals("2") && !option.equals("3") && !option.equals("4")) {
                System.out.printf("%n1 - Adicionar funcionário" +
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
                gerenciarRecursos(onibus, estadio, centro_treinamento);
            } else if (option.equals("4")) {
                gerarRelatorios(funcionarios, socios, niveis, onibus, estadio, centro_treinamento);
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

    private static Niveis carregarNiveis(Niveis niveis) {
        try {
            FileInputStream fis = new FileInputStream("niveis.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            niveis = (Niveis) ois.readObject();
            ois.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado, gerando novo arquivo de Niveis.");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return niveis;
    }

    private static Estadio carregarEstadio(Estadio estadio) {
        try {
            FileInputStream fis = new FileInputStream("estadio.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            estadio = (Estadio) ois.readObject();
            ois.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado, gerando novo arquivo de Estádio.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return estadio;
    }

    private static CT carregarCT(CT centro_treinamento) {
        try {
            FileInputStream fis = new FileInputStream("ct.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            centro_treinamento = (CT) ois.readObject();
            ois.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado, gerando novo arquivo de Centro de treinamento.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return centro_treinamento;
    }

    private static List<Onibus> carregarOnibus(List<Onibus> onibus){
        try {
            FileInputStream fis = new FileInputStream("onibus.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            onibus = (List<Onibus>) ois.readObject();
            ois.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado, gerando novo arquivo de ônibus.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return onibus;
    }

    private static void salvarDados(List<Funcionario> funcionarios, List<Socio> socios, Niveis niveis, Estadio estadio, CT centro_treinamento, List<Onibus> onibus) {
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

        try {
            FileOutputStream fos = new FileOutputStream("niveis.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(niveis);
            oos.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fos = new FileOutputStream("onibus.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(onibus);
            oos.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fos = new FileOutputStream("ct.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(centro_treinamento);
            oos.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fos = new FileOutputStream("estadio.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(estadio);
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
        Niveis niveis = carregarNiveis(new Niveis(100, 200));
        List<Onibus> onibus = carregarOnibus(new ArrayList<>());
        Estadio estadio = carregarEstadio(new Estadio(false, 0, 0, 0));
        CT centro_treinamento = carregarCT(new CT(false, 0));

        String user = "admin";
        String password = "123";

        boolean exit = loginPage(user, password, funcionarios, socios, niveis, onibus, estadio, centro_treinamento);

        while(exit){
            exit = loginPage(user, password, funcionarios, socios, niveis, onibus, estadio, centro_treinamento);
        }

        salvarDados(funcionarios, socios, niveis, estadio, centro_treinamento, onibus);
    }
}
