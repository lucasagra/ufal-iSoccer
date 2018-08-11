package models.partners;
import utils.*;
import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class Partner implements Serializable {
    private String name;
    private String email;
    private String cpf;
    private String phone;
    private String address;
    private int contribution;
    private boolean situation;
    private String rank;

    private Partner(String name, String cpf, String email, String phone, String address, int contribution, Ranks ranks) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.contribution = contribution;
        this.situation = true;

        if(contribution > ranks.getElite()){
            this.rank = "Elite";
        } else if(contribution > ranks.getSenior()) {
            this.rank = "Senior";
        } else this.rank = "Junior";
    }

    public static void showPartners(List<Partner> partners) {
        Format format = new Format();

        System.out.println("Manage and check any partner:");
        System.out.printf("0 - Cancel%n");

        for(int i = 0; i < partners.size(); i++) {
            System.out.printf("%d - Name: %s - CPF: %s - Rank: %s - Situation: ", i+1, partners.get(i).getName(), partners.get(i).getCpf(), partners.get(i).getRank());
            if(partners.get(i).getSituation()) System.out.printf("On time%n");
            else System.out.printf("Overdue%n");
        }

        int option = format.inputSelect()-1;

        if(option >= 0 && option < partners.size()){
            System.out.printf("%nChange %s situation to:%n" +
                    "1 - On date%n" +
                    "2 - Overdue%n" +
                    "0 - Cancel%n", partners.get(option).getName());

            int choice = format.inputSelect();

            if(choice == 1){
                partners.get(option).setSituation(true);
            } else if(choice == 2) {
                partners.get(option).setSituation(false);
            }
        }
    }

    public static Partner newPartner(List<Partner> partners, Ranks ranks){
        System.out.println("Enter partner data:");

        Format format = new Format();
        Getinfo info = new Getinfo();
        String name = info.inputUserName();
        String cpf = info.inputUserCpf();

        if(new Format().partnerCpfInUse(partners, cpf)) {
            System.out.println("This CPF is already in use.");
            format.operationAborted();
            return null;
        }

        String email = info.inputUserEmail();
        String phone = info.inputUserPhone();
        String address = info.inputUserAddress();
        int contribution = info.inputUserContribution();

        return new Partner(name, cpf, email, phone, address, contribution, ranks);
    }

    public String getCpf(){return this.cpf;}

    public String getName(){return this.name;}

    public boolean getSituation(){return this.situation;}

    private String getRank(){return this.rank;}

    private void setSituation(boolean situation){
        Scanner input = new Scanner(System.in);
        this.situation = situation;
        System.out.println("Situation successfully changed.");
        input.nextLine();
    }

    void setRank(Ranks ranks){
        if(contribution > ranks.getElite()){
            this.rank = "Elite";
        } else if(contribution > ranks.getSenior()) {
            this.rank = "Senior";
        } else this.rank = "Junior";
    }

    public void getInfo(){
        System.out.println("  Name: " + name);
        System.out.println("  CPF: " + cpf);
        if(this.situation) System.out.println("  Rank: " + rank);
        System.out.println("  E-mail: " + email);
        System.out.println("  Phone: " + phone);
        System.out.println("  Adress: " + address);
        System.out.println("  Contribution: R$" + contribution);
        System.out.printf("%n");
    }
}
