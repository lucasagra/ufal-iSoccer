package models.employees;

import java.io.Serializable;

public class Lawyer extends Employee implements Serializable {

    private Lawyer(String name, String email, int salary, String cpf, String phone){
        super(name, email, salary, cpf, phone);

    }

    static Lawyer lawyerFactory(String name, String email, int salary, String cpf, String phone){
        return new Lawyer(name, email, salary, cpf, phone);
    }

    @Override
    public void getInfo(){
        super.getInfo();
    }
}
