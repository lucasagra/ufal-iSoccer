package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Getinfo {

    public Getinfo(){}

    private Scanner input = new Scanner(System.in);
    private Format format = new Format();

    public String inputAdminUser(){
        System.out.print("User: ");
        return input.nextLine();
    }

    public String inputAdminPassword(){
        System.out.print("Password: ");
        return input.nextLine();
    }

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
        int salary = format.stringToInt(input.nextLine());

        while(salary <= 0) {
            System.out.println("Type a valid input.");
            System.out.print("Salary(R$): ");
            salary = format.stringToInt(input.nextLine());
        }

        return salary;
    }

    public int inputUserContribution(){

        System.out.print("Partner contribution: ");
        int contribution = format.stringToInt(input.nextLine());

        while(contribution < 0) {
            System.out.println("Type a valid input.");
            System.out.print("Contribution(R$): ");
            contribution = format.stringToInt(input.nextLine());
        }

        return contribution;
    }

    public int getEmployeeType() {
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

        return format.inputSelect();
    }

    public int getStadiumCapacity(){
        int capacity = -1;

        while(capacity <= 0) {
            try {
                System.out.print("Stadium capacity: ");
                capacity = format.stringToInt(input.nextLine());
                if (capacity <= 0) throw new InputMismatchException();
                else return capacity;
            } catch (InputMismatchException e) {
                format.invalidInput();
            }
        }

        return capacity;
    }

    public int getRestroomsNumber(){
        int restrooms = -1;

        while(restrooms < 0) {
            try {
                System.out.print("Restrooms number: ");
                restrooms = format.stringToInt(input.nextLine());
                if (restrooms < 0) throw new InputMismatchException();
                else return restrooms;
            } catch (InputMismatchException e) {
                format.invalidInput();
            }
        }

        return restrooms;
    }

    public int getFastfoodsNumber(){
        int fastfoods = -1;

        while(fastfoods < 0) {
            try {
                System.out.print("Fastfoods number: ");
                fastfoods = format.stringToInt(input.nextLine());
                if (fastfoods < 0) throw new InputMismatchException();
                else return fastfoods;
            } catch (InputMismatchException e) {
                format.invalidInput();
            }
        }

        return fastfoods;
    }

    public int getDormsNumber(){
        int dorms = -1;

        while(dorms < 0) {
            try {
                System.out.print("Dorms number: ");
                dorms = format.stringToInt(input.nextLine());
                if (dorms < 0) throw new InputMismatchException();
                else return dorms;
            } catch (InputMismatchException e) {
                format.invalidInput();
            }
        }

        return dorms;
    }
}
