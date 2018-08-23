package data;

import models.employees.*;

import java.util.ArrayList;
import java.util.List;

public class EmployeesData
{
    private Coach coach;
    private President president;
    private List<Doctor> doctors = new ArrayList<>();
    private List<Cook> cooks = new ArrayList<>();
    private List<Driver> drivers = new ArrayList<>();
    private List<Lawyer> lawyers = new ArrayList<>();
    private List<Personal> personals = new ArrayList<>();
    private List<Player> players = new ArrayList<>();

    public Coach getCoach() {
        return this.coach;
    }
    public President getPresident() {
        return this.president;
    }
    public List<Doctor> getDoctors() {
        return this.doctors;
    }
    public List<Cook> getCooks() {
        return this.cooks;
    }
    public List<Driver> getDrivers() {
        return this.drivers;
    }
    public List<Lawyer> getLawyers() {
        return this.lawyers;
    }
    public List<Personal> getPersonals() {
        return this.personals;
    }
    public List<Player> getPlayers() {
        return this.players;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }
    public void setPresident(President president) {
        this.president = president;
    }
    public void addDoctor(Doctor doctor) {
        this.doctors.add(doctor);
    }
    public void addCook(Cook cook) {
        this.cooks.add(cook);
    }
    public void addDriver(Driver driver) {
        this.drivers.add(driver);
    }
    public void addLawyer(Lawyer lawyer) {
        this.lawyers.add(lawyer);
    }
    public void addPersonal(Personal personal) {
        this.personals.add(personal);
    }
    public void addPlayer(Player player) {
        this.players.add(player);
    }
}
