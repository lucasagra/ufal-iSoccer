package models.employees;

import java.io.Serializable;

public class Player extends Employee implements Serializable {
    private String role;
    private boolean apt;

    public Player(String name, String email, int salary, String cpf, String phone, String role, boolean apt){
        super(name, email, salary, cpf, phone);
        this.role = role;
        this.apt = apt;
    }

    public boolean isApt() {
        return apt;
    }

    @Override
    public void getInfo(){
        System.out.printf("  Role: %s%n", this.role);
        super.getInfo();
    }
}
