package models.employees;


import java.io.Serializable;

public class Driver extends Employee implements Serializable {

    private String driver_license;

    public Driver(String name, String email, int salary, String cpf, String phone, String driver_license){
        super(name, email, salary, cpf, phone);

        this.driver_license = driver_license;
    }


    @Override
    public void getInfo(){
        System.out.println("  Driver License: " + this.driver_license);
        super.getInfo();
    }
}
