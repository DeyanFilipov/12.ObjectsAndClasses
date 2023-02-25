package ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAge_06 {

    private String name;
    private String id;
    private int age;

    public OrderByAge_06(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public String toString() {
        return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<OrderByAge_06> orderList = new ArrayList<>();
        while (!command.equals("End")) {
            String[] currentCommand = command.split(" ");
            String name = currentCommand[0];
            String id = currentCommand[1];
            int age =Integer.parseInt(currentCommand[2]);
            OrderByAge_06 order = new OrderByAge_06(name, id ,age);
            orderList.add(order);

            command = scanner.nextLine();
        }
        orderList.sort(Comparator.comparing(OrderByAge_06::getAge));
        for (OrderByAge_06 current : orderList) {
            System.out.println(current);
        }
    }
}
