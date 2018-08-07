package resources;

import auxiliaries.Control;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class TrainingCenter extends Resources implements Serializable {
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

    public static void manage(List<Resources> resources) {
        Scanner input = new Scanner(System.in);
        Control control = new Control();

        int trainingcenter_index = control.trainingCenterIndex(resources);

        if(trainingcenter_index < 0){
            System.out.printf("%nTraining center unavailable.%n%n" +
                    "1 - Add training center%n" +
                    "0 - Cancel%n%n");

            int option = control.inputSelect();

            if(option == 1) {
                System.out.print("Dorms number: ");
                int dorms = control.stringToInt(input.nextLine());
                if (dorms < 0){
                    control.operationAborted();
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

            int option = control.inputSelect();

            switch (option){
                case 1:
                    System.out.print("New dorms number: ");
                    int dorms = control.stringToInt(input.nextLine());
                    if (dorms < 0){
                        control.operationAborted();
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

                    option = control.inputSelect();

                    if(option == 1){
                        resources.remove(trainingcenter_index);
                        System.out.printf("%nTraining center successfully removed.%n%n");
                        input.nextLine();
                    } else {
                        control.operationAborted();
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
