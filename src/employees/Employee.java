package employees;

import auxiliaries.*;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

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

    private static int getEmployeeType() {
        System.out.printf("%nWhat kind of employee is him?%n" +
                "%n1 - President" +
                "%n2 - Doctor" +
                "%n3 - Coach" +
                "%n4 - Personal Trainer" +
                "%n5 - Driver" +
                "%n6 - Cook" +
                "%n7 - Lawyer" +
                "%n8 - Player" +
                "%n0 - Cancel%n%n");

        return new Control().inputSelect();
    }

    public static void newEmployee(List<Employee> employees){
        System.out.println("Enter employee data:");

        Scanner input = new Scanner(System.in);
        Getinfo info = new Getinfo();
        Control control = new Control();

        String name = info.inputUserName();
        String cpf = info.inputUserCpf();

        if(control.employeeCpfInUse(employees, cpf)) {
            System.out.println("This cpf is already in use.");
            control.operationAborted();
            return;
        }

        String email = info.inputUserEmail();
        String phone = info.inputUserPhone();
        int salary = info.inputUserSalary();

        int type = -1;
        Employee tmp = null;

        while(type < 0 || type > 8) {
            try {
                type = getEmployeeType();
                switch (type) {
                    case 0:
                        break;
                    case 1:
                        tmp = President.presidentFactory(name, email, salary, cpf, phone);
                        break;
                    case 2:
                        tmp = Doctor.doctorFactory(name, email, salary, cpf, phone);
                        break;
                    case 3:
                        tmp = Coach.coachFactory(name, email, salary, cpf, phone);
                        break;
                    case 4:
                        tmp = Personal.personalFactory(name, email, salary, cpf, phone);
                        break;
                    case 5:
                        tmp = Driver.driverFactory(name, email, salary, cpf, phone);
                        break;
                    case 6:
                        tmp = Cook.cookFactory(name, email, salary, cpf, phone);
                        break;
                    case 7:
                        tmp = Lawyer.lawyerFactory(name, email, salary, cpf, phone);
                        break;
                    case 8:
                        tmp = Player.playerFactory(name, email, salary, cpf, phone);
                        break;
                    default:
                        throw new InputMismatchException();
                }
            } catch (InputMismatchException e){
                control.invalidInput();
            }
        }

        if (tmp != null) {
            employees.add(tmp);
            System.out.printf("%nEmployee successfully added.%n");
            input.nextLine();
        }
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