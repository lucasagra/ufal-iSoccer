package models.employees;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private String email;
    private int salary;
    private String cpf;
    private String phone;

    public Employee(String name, String email, int salary, String cpf, String phone){
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.cpf = cpf;
        this.phone = phone;
    }

    public String getCpf(){return this.cpf;}

    public void getInfo(){
        System.out.println("  Name: " + this.name);
        System.out.println("  CPF: " + this.cpf);
        System.out.println("  E-mail: " + this.email);
        System.out.println("  Phone: " + this.phone);
        System.out.println("  Salary: R$" + this.salary);
        System.out.printf("%n");
    }
}