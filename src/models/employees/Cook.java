package models.employees;

import java.io.Serializable;

public class Cook extends Employee implements Serializable {


    private Cook(String name, String email, int salary, String cpf, String phone){
        super(name, email, salary, cpf, phone);

    }

    static Cook cookFactory(String name, String email, int salary, String cpf, String phone){
        return new Cook(name, email, salary, cpf, phone);
    }

    @Override
    public void getInfo(){
        super.getInfo();
    }
}
