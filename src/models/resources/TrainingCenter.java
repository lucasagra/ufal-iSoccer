package models.resources;

import utils.Format;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class TrainingCenter extends Resource implements Serializable {
    private int dorms;

    private TrainingCenter(boolean available, int dorms){
        super(available);
        this.dorms = dorms;
    }

    public int getDorms() {
        return dorms;
    }

    private void setDorms(int dorms) {
        this.dorms = dorms;
    }

    public static void manage(List<Resource> resources) {
        Scanner input = new Scanner(System.in);
        Format format = new Format();

        int trainingcenter_index = format.trainingCenterIndex(resources);

        if(trainingcenter_index < 0){
            System.out.printf("%nTraining center unavailable.%n%n" +
                    "1 - Add training center%n" +
                    "0 - Cancel%n%n");

            int option = format.inputSelect();

            if(option == 1) {
                System.out.print("Dorms number: ");
                int dorms = format.stringToInt(input.nextLine());
                if (dorms < 0){
                    format.operationAborted();
                    return;
                }

                resources.add(new TrainingCenter(true, dorms));
                System.out.printf("%nTraining center successfully added.%n%n");
                input.nextLine();
            }
        } else {
            System.out.printf("%nTraining center information:" +
                    "%n1 - Change dorms number" +
                    "%n2 - Remove training center" +
                    "%n0 - Cancel%n%n");

            int option = format.inputSelect();

            switch (option){
                case 1:
                    System.out.print("New dorms number: ");
                    int dorms = format.stringToInt(input.nextLine());
                    if (dorms < 0){
                        format.operationAborted();
                    } else {
                        ((TrainingCenter) resources.get(trainingcenter_index)).setDorms(dorms);
                        System.out.printf("%nDorms number successfully changed.%n%n");
                        input.nextLine();
                    }
                    break;
                case 2:
                    System.out.printf("Do you want to remove the training center?%n" +
                            "1 - Yes%n" +
                            "0 - Cancel%n" +
                            "");

                    option = format.inputSelect();

                    if(option == 1){
                        resources.remove(trainingcenter_index);
                        System.out.printf("%nTraining center successfully removed.%n%n");
                        input.nextLine();
                    } else {
                        format.operationAborted();
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
