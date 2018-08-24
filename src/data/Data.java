package data;

import models.employees.Employee;
import models.partners.Partner;
import models.partners.Ranks;
import models.resources.Resource;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Data implements Serializable {
    private List<Employee> employees;
    private List<Partner> partners;
    private List<Resource> resources;
    private Ranks ranks;

    public Data(){
        this.employees = new ArrayList<>();
        this.partners = new ArrayList<>();
        this.resources = new ArrayList<>();
        this.ranks = new Ranks(100, 200);
    }

    public List<Employee> getEmployeesData() {
        return employees;
    }

    public List<Partner> getPartnersData() {
        return partners;
    }

    public List<Resource> getResourcesData() {
        return resources;
    }

    public Ranks getRanksData() {
        return ranks;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void addPartner(Partner partner) {
        this.partners.add(partner);
    }

    public void addResource(Resource resource) {
        this.resources.add(resource);
    }

    public void setRanksData(Ranks ranks) {
        this.ranks = ranks;
    }
}
