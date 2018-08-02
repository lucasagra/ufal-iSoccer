package socios;

import java.io.Serializable;

public class Niveis implements Serializable {
    private int junior;
    private int senior;
    private int elite;

    public Niveis(int senior, int elite){

        this.junior = 0;
        if (senior > junior) {
            this.senior = senior;
        } else this.senior = junior+1;
        if (elite > senior) {
            this.elite = elite;
        } else this.elite = senior+1;
    }

    public int getJunior() {return this.junior;}
    public int getSenior() {return this.senior;}
    public int getElite() {return this.elite;}


    public void setNiveis(int senior, int elite) {
        if (elite > senior && senior > this.junior) {
            this.senior = senior;
            this.elite = elite;
        }
    }
}
