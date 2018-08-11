package models.employees;

import utils.*;
import java.io.Serializable;
import java.util.InputMismatchException;

public class Player extends Employee implements Serializable {
    private String role;
    private boolean apt;

    private Player(String name, String email, int salary, String cpf, String phone, String role, boolean apt){
        super(name, email, salary, cpf, phone);
        this.role = role;
        this.apt = apt;
    }

    public boolean isApt() {
        return apt;
    }

    static Player playerFactory(String name, String email, int salary, String cpf, String phone) {
        Format format = new Format();

        int option = -1;
        String type = "";

        while(option < 0 || option > 7) {
            System.out.println("What role this player do?");
            System.out.printf("%n1 - Defensive midfielder" +
                    "%n2 - Defender" +
                    "%n3 - Midfielder" +
                    "%n4 - Goalkeeper" +
                    "%n5 - Attack" +
                    "%n6 - Left-back" +
                    "%n7 - Right-back" +
                    "%n0 - Cancel%n%n");

            try {
                option = format.inputSelect();

                switch (option) {
                    case 0:
                        break;
                    case 1:
                        type = "Defensive midfielder";
                        break;
                    case 2:
                        type = "Defender";
                        break;
                    case 3:
                        type = "Midfielder";
                        break;
                    case 4:
                        type = "Goalkeeper";
                        break;
                    case 5:
                        type = "Attack";
                        break;
                    case 6:
                        type = "Left-back";
                        break;
                    case 7:
                        type = "Right-back";
                        break;
                    default:
                        throw new InputMismatchException();
                }
            } catch (InputMismatchException e){
                format.invalidInput();
            }
        }

        System.out.printf("%nIs the player apt to play?%n" +
                    "1 - Yes%n" +
                    "0 - No%n%n");

        option = format.inputSelect();

        boolean apt = (option == 1);
        return new Player(name, email, salary, cpf, phone, type, apt);
    }

    @Override
    public void getInfo(){
        System.out.printf("  Role: %s%n", this.role);
        super.getInfo();
    }
}
