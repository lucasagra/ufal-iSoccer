package models.employees;

import utils.Getinfo;

import java.io.Serializable;

public class Driver extends Employee implements Serializable {

    private String driver_license;

    private Driver(String name, String email, int salary, String cpf, String phone, String driver_license){
        super(name, email, salary, cpf, phone);

        this.driver_license = driver_license;
    }

    static Driver driverFactory(String name, String email, int salary, String cpf, String phone){
        Getinfo info = new Getinfo();

        String driver_license = info.inputUserDriverLicense();

        return new Driver(name, email, salary, cpf, phone, driver_license);
    }

    public String getDriver_license(){
        return this.driver_license;
    }

    @Override
    public void getInfo(){
        System.out.println("  Driver License: " + this.driver_license);
        super.getInfo();
    }
}
