package auxiliaries;

import java.util.Scanner;

public class Getinfo {

    public Getinfo(){}

    private Scanner input = new Scanner(System.in);
    private Control control = new Control();

    public String inputUserName(){
        System.out.print("Full name: ");
        return input.nextLine();
    }

    public String inputUserCpf(){

        System.out.print("Cpf: ");
        return input.nextLine();
    }

    public String inputUserEmail(){

        System.out.print("Email: ");
        return input.nextLine();
    }

    public String inputUserPhone(){

        System.out.print("Phone: ");
        return input.nextLine();
    }

    public String inputUserAddress(){

        System.out.print("Adress: ");
        return input.nextLine();
    }

    public String inputUserCRM(){
        System.out.print("CRM: ");
        return input.nextLine();
    }

    public String inputUserDriverLicense(){
        System.out.print("Driver license number: ");
        return input.nextLine();
    }

    public int inputUserSalary(){

        System.out.print("Salary(R$): ");
        int salary = control.stringToInt(input.nextLine());

        while(salary <= 0) {
            System.out.println("Type a valid input.");
            System.out.print("Salary(R$): ");
            salary = control.stringToInt(input.nextLine());
        }

        return salary;
    }

    public int inputUserContribution(){

        System.out.print("Partner contribution: ");
        int contribution = control.stringToInt(input.nextLine());

        while(contribution < 0) {
            System.out.println("Type a valid input.");
            System.out.print("Contribution(R$): ");
            contribution = control.stringToInt(input.nextLine());
        }

        return contribution;
    }
}
