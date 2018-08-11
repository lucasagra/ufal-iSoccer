package models.employees;

import utils.Getinfo;
import java.io.Serializable;

public class Doctor extends Employee implements Serializable {
    private String crm;

    private Doctor(String name, String email, int salary, String cpf, String phone, String crm){
        super(name, email, salary, cpf, phone);
        this.crm = crm;
    }

    static Doctor doctorFactory(String name, String email, int salary, String cpf, String phone){
        Getinfo info = new Getinfo();

        String crm = info.inputUserCRM();

        return new Doctor(name, email, salary, cpf, phone, crm);
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
