package data;

import models.partners.Ranks;

public class Data {
    public EmployeesData employees;
    public PartnersData partners;
    public ResourcesData resources;
    public Ranks ranks;

    public Data(EmployeesData employees, PartnersData partners, ResourcesData resources){
        this.employees = employees;
        this.partners = partners;
        this.resources = resources;
        this.ranks = new Ranks(100, 200);
    }

}
