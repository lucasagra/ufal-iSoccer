package employees;

import java.io.Serializable;

public class Personal extends Employee implements Serializable {


    private Personal(String name, String email, int salary, String cpf, String phone){
        super(name, email, salary, cpf, phone);

    }

    static Personal personalFactory(String name, String email, int salary, String cpf, String phone){
        return new Personal(name, email, salary, cpf, phone);
    }

    @Override
    public void getInfo(){
        super.getInfo();
    }
}
