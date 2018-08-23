package models.employees;

import java.io.Serializable;

public class Personal extends Employee implements Serializable {

    public Personal(String name, String email, int salary, String cpf, String phone){
        super(name, email, salary, cpf, phone);
    }

    @Override
    public void getInfo(){
        super.getInfo();
    }
}
