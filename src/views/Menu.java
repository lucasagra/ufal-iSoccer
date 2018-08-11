package views;

import utils.Format;

public class Menu {

    private Format format = new Format();

    public Menu() {}


    public int main(){
        System.out.printf("%n1 - Add employee" +
                "%n2 - Manage supporters" +
                "%n3 - Manage resources" +
                "%n4 - Check reports" +
                "%n0 - Log out%n%n");
        return format.inputSelect();
    }

    public int resources(){
        System.out.println("Resources manager:");
        System.out.printf("1 - Bus%n" +
                "2 - Stadium%n" +
                "3 - Training Center%n" +
                "0 - Cancel%n%n");
        return format.inputSelect();
    }

    public int reports(){
        System.out.printf("%nReports available:%n" +
                "1 - Employees report%n" +
                "2 - Resources report%n" +
                "3 - Partners report%n" +
                "4 - General report%n" +
                "0 - Cancel%n%n");
        return format.inputSelect();
    }

    public int partners(){
        System.out.printf("Actions available:" +
                "%n1 - Add partner" +
                "%n2 - models.Manage models.partners" +
                "%n3 - Set new Partner-Ranks limits" +
                "%n0 - Cancel%n");
        return format.inputSelect();
    }
}
