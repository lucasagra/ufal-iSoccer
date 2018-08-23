import controller.Login;
import data.Data;
import data.EmployeesData;
import data.PartnersData;
import data.ResourcesData;
import models.employees.*;
import models.resources.*;
import models.partners.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Employee> loadEmployees(List<Employee> employees){
        try {
            FileInputStream fis = new FileInputStream("employees.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            employees = (List<Employee>) ois.readObject();
            ois.close();

        } catch (FileNotFoundException e) {
            System.out.println("File doesn't found, creating a new models.employees file.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.getCause();
            e.printStackTrace();
        }

        return employees;
    }

    private static List<Resource> loadResources(List<Resource> resources){
        try {
            FileInputStream fis = new FileInputStream("resources.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            resources = (List<Resource>) ois.readObject();
            ois.close();

        } catch (FileNotFoundException e) {
            System.out.println("File doesn't found, creating a new models.resources file.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.getCause();
            e.printStackTrace();
        }

        return resources;
    }

    private static List<Partner> loadPartners(List<Partner> partners){
        try {
            FileInputStream fis = new FileInputStream("partners.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            partners = (List<Partner>) ois.readObject();
            ois.close();

        } catch (FileNotFoundException e) {
            System.out.println("File doesn't found, creating a new models.partners file.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.getCause();
            e.printStackTrace();
        }

        return partners;
    }

    private static Ranks loadRanks(Ranks ranks) {
        try {
            FileInputStream fis = new FileInputStream("ranks.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ranks = (Ranks) ois.readObject();
            ois.close();

        } catch (FileNotFoundException e) {
            System.out.println("File doesn't found, creating a new rank file.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.getCause();
            e.printStackTrace();
        }

        return ranks;
    }

    private static void save(Data data){
        try {
            FileOutputStream fos = new FileOutputStream("data.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(data);
            oos.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Data load(Data data) {
        try {
            FileInputStream fis = new FileInputStream("data.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            data = (Data) ois.readObject();
            ois.close();

        } catch (FileNotFoundException e) {
            System.out.println("File doesn't found, creating a new data file.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.getCause();
            e.printStackTrace();
        }

        return data;
    }

    private static void saveData(List<Employee> employees, List<Partner> partners, Ranks ranks, List<Resource> resources) {
        try {
            FileOutputStream fos = new FileOutputStream("employees.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(employees);
            oos.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fos = new FileOutputStream("partners.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(partners);
            oos.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fos = new FileOutputStream("ranks.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ranks);
            oos.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fos = new FileOutputStream("resources.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(resources);
            oos.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = loadEmployees(new ArrayList<>());
        List<Partner> partners = loadPartners(new ArrayList<>());
        List<Resource> resources = loadResources(new ArrayList<>());
        Ranks ranks = loadRanks(new Ranks(100, 200));

        Data data = load(new Data(new EmployeesData(), new PartnersData(), new ResourcesData()));

        Login login = new Login("admin", "123");

        boolean exit = login.loginPage(data, employees, partners, ranks, resources);

        while(!exit){
            exit = login.loginPage(data, employees, partners, ranks, resources);
        }

        save(data);
        saveData(employees, partners, ranks, resources);
    }
}
