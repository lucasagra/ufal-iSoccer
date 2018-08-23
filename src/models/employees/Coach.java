package models.employees;

import java.io.Serializable;

public class Coach extends Employee implements Serializable {

    public Coach(String name, String email, int salary, String cpf, String phone) {
        super(name, email, salary, cpf, phone);
    }


    @Override
    public void getInfo() {
        super.getInfo();
    }
}
