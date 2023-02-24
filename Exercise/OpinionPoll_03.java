package ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll_03 {
        private String name;
        private int age;

        public OpinionPoll_03(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName(){
            return this.name;
        }
        public int getAge(){
            return this.age;
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<OpinionPoll_03> personList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String data = scanner.nextLine();
            if (Integer.parseInt(data.split(" ")[1]) > 30) {
                OpinionPoll_03 person = new OpinionPoll_03(data.split(" ")[0], Integer.parseInt(data.split(" ")[1]));
                personList.add(person);
            }
        }
        for (OpinionPoll_03 person : personList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
