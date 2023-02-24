package ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue_05 {

    private String type;
    private String model;
    private String color;
    private int horsePower;

    public VehicleCatalogue_05(String type, String model, String color, int horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getHorsePower() {
        return horsePower;
    }
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<VehicleCatalogue_05> catalogueList =new ArrayList<>();
        double carAverageHorsePower = 0.00;
        int countCar = 0;
        int countTruck = 0;
        double truckAverageHorsePower = 0.00;
        while (!command.equals("End")) {
            String[] commandArr = command.split(" ");
            String type = commandArr[0];
            String model = commandArr[1];
            String color = commandArr[2];
            int horsePower = Integer.parseInt(commandArr[3]);
            if (type.equals("car")) {
                type = "Car";
                carAverageHorsePower += horsePower;
                countCar++;
            } else {
                type = "Truck";
                truckAverageHorsePower += horsePower;
                countTruck++;
            }
            VehicleCatalogue_05 catalogue = new VehicleCatalogue_05(type, model, color, horsePower);
            catalogueList.add(catalogue);

            command = scanner.nextLine();
        }
        String printingCommand = scanner.nextLine();
        while (!printingCommand.equals("Close the Catalogue")) {
            for (VehicleCatalogue_05 item : catalogueList) {
                if (printingCommand.equals(item.getModel())){
                    System.out.printf("Type: %s%n", item.getType());
                    System.out.printf("Model: %s%n", item.getModel());
                    System.out.printf("Color: %s%n", item.getColor());
                    System.out.printf("Horsepower: %d%n", item.getHorsePower());
            }
        }
            printingCommand = scanner.nextLine();
    }
        double averageCar = carAverageHorsePower / countCar;
        double averageTruck = truckAverageHorsePower / countTruck;
        if (Double.isNaN(averageTruck)) {
            averageTruck = 0.00;
        } else if (Double.isNaN(averageCar)) {
            averageCar = 0.00;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCar);
        System.out.printf("Trucks have average horsepower of: %.2f.", averageTruck);
    }
}
