import funcionarios.*;
import recursos.CT;
import recursos.Estadio;
import recursos.Onibus;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Main {

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

        boolean continua = Menu.loginPage(user, password, funcionarios, socios, niveis, onibus, estadio, centro_treinamento);

        while(continua){
            continua = Menu.loginPage(user, password, funcionarios, socios, niveis, onibus, estadio, centro_treinamento);
        }

        salvarDados(funcionarios, socios, niveis, estadio, centro_treinamento, onibus);
    }
}
