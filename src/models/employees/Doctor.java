package models.employees;

import utils.Getinfo;
import java.io.Serializable;

public class Doctor extends Employee implements Serializable {
    private String crm;

    public Doctor(String name, String email, int salary, String cpf, String phone, String crm){
        super(name, email, salary, cpf, phone);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    @Override
    public void getInfo(){
        System.out.println("  CRM: " + this.crm);
        super.getInfo();
    }
}
