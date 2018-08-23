package data;

import models.partners.Ranks;

public class Data {
    private EmployeesData employees;
    private PartnersData partners;
    private ResourcesData resources;
    private Ranks ranks;

    public Data(EmployeesData employees, PartnersData partners, ResourcesData resources){
        this.employees = employees;
        this.partners = partners;
        this.resources = resources;
        this.ranks = new Ranks(100, 200);
    }

    public EmployeesData getEmployeesData() {
        return this.employees;
    }

    public PartnersData getPartnersData(){
        return this.partners;
    }

    public ResourcesData getResourcesData() {
        return this.resources;
    }

    public Ranks getRanksData() {
        return this.ranks;
    }

    public void setEmployeesData(EmployeesData employees) {
        this.employees = employees;
    }

    public void setPartnersData(PartnersData partners) {
        this.partners = partners;
    }

    public void setRanksData(Ranks ranks) {
        this.ranks = ranks;
    }

    public void setResourcesData(ResourcesData resources) {
        this.resources = resources;
    }
}
