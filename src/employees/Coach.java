package employees;

import java.io.Serializable;

public class Coach extends Employee implements Serializable {

    private Coach(String name, String email, int salary, String cpf, String phone) {
        super(name, email, salary, cpf, phone);

    }

    static Coach coachFactory(String name, String email, int salary, String cpf, String phone){
        return new Coach(name, email, salary, cpf, phone);
    }

    @Override
    public void getInfo() {
        super.getInfo();
    }
}
