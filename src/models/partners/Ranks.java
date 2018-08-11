package models.partners;

import utils.*;
import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class Ranks implements Serializable {
    private int junior;
    private int senior;
    private int elite;

    public Ranks(int senior, int elite){

        this.junior = 0;
        if (senior > junior) {
            this.senior = senior;
        } else this.senior = junior+1;
        if (elite > senior) {
            this.elite = elite;
        } else this.elite = senior+1;
    }

    int getSenior() {return this.senior;}

    int getElite() {return this.elite;}

    private void recalculateLevels(List<Partner> partners, Ranks ranks){
        for (Partner partner: partners) {
            partner.setRank(ranks);
        }
    }

    private void setLevels(int senior, int elite) {
        if (elite > senior && senior > this.junior) {
            this.senior = senior;
            this.elite = elite;
        }
    }

    public void updateValues(List<Partner> partners, Ranks ranks){
        Scanner input = new Scanner(System.in);
        Format format = new Format();

        System.out.printf("Current rank values:%n" +
                "0 - %d Junior%n" +
                "%d - %d Senior%n" +
                "%d - ... Elite%n%n", ranks.getSenior(), ranks.getSenior()+1, ranks.getElite(), ranks.getElite()+1);

        System.out.print("Type new minimum to be Senior: ");
        int senior = format.stringToInt(input.nextLine());
        System.out.print("Type new minimum to be Elite: ");
        int elite = format.stringToInt(input.nextLine());

        if (senior > 0 && elite > 0 && elite > senior) {
            ranks.setLevels(senior, elite);
            System.out.println("Ranks successfully updated.");
            recalculateLevels(partners, ranks);
            System.out.println("Partners ranks has been recalculated.");
            input.nextLine();
        } else {
            System.out.println("Invalid input.");
            input.nextLine();
        }
    }
}
