package auxiliaries;

import employees.Employee;
import partners.Partner;
import resources.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Control {
    private Scanner input = new Scanner(System.in);

    public Control(){}

    public int inputSelect(){
        System.out.print("Select: ");
        return stringToInt(input.nextLine());
    }

    public void invalidInput(){
        System.out.printf("%nInvalid input.");
        input.nextLine();
    }

    public void operationAborted(){
        System.out.println("Operation aborted");
        input.nextLine();
    }

    public int stringToInt(String string){
        try {
            int i = Integer.parseInt(string.trim());
            return i;
        }
        catch (NumberFormatException nfe)
        {
            return -1;
        }
    }

    public boolean employeeCpfInUse(List<Employee> employees, String cpf){
        for(Employee employee: employees){
            if(cpf.equals(employee.getCpf())) return true;
        }

        return false;
    }

    public boolean partnerCpfInUse(List<Partner> partners, String cpf){
        for(Partner partner: partners){
            if(cpf.equals(partner.getCpf())) return true;
        }

        return false;
    }

    public List<Bus> getBusesList(List<Resources> resources){
        List<Bus> buses = new ArrayList<>();

        for(Resources resource: resources){
            if(resource instanceof Bus){
                buses.add((Bus) resource);
            }
        }

        return buses;
    }

    public Stadium getStadium(List<Resources> resources){
        for(Resources resource: resources) {
            if(resource instanceof Stadium)  {
                return (Stadium) resource;
            }
        }

        return null;
    }

    public TrainingCenter getTrainingCenter(List<Resources> resources){
        for (Resources resource: resources) {
            if(resource instanceof TrainingCenter){
                return (TrainingCenter) resource;
            }
        }

        return null;
    }

    public int stadiumIndex(List<Resources> resources){

        for(int index = 0; index < resources.size(); index++){
            if(resources.get(index) instanceof Stadium)  {
                return index;
            }
        }

        return -1;
    }

    public int trainingCenterIndex(List<Resources> resources){

        for(int index = 0; index < resources.size(); index++){
            if(resources.get(index) instanceof TrainingCenter)  {
                return index;
            }
        }

        return -1;
    }

    public List<Integer> busIndexes(List<Resources> resources) {
        List<Integer> indexes = new ArrayList<>();

        for(int i = 0; i < resources.size(); i++){
            if(resources.get(i) instanceof Bus){
                indexes.add(i);
            }
        }

        return indexes;
    }
}
