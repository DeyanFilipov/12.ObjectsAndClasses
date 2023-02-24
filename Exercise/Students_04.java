package ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Students_04 {
    private String firstName;
    private String lastName;
    private Double grade;

    public Students_04(String firstName, String lastName, Double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }
    public Double getGrade() {
        return this.grade;
    }
    public String toString() {
        return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Students_04> studentsList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String currentStudent = scanner.nextLine();
            Students_04 student = new Students_04(currentStudent.split(" ")[0], currentStudent.split(" ")[1], Double.parseDouble(currentStudent.split(" ")[2]));

            studentsList.add(student);
        }
        studentsList.sort(Comparator.comparing(Students_04::getGrade).reversed());
        for (Students_04 student : studentsList) {
            System.out.println(student);
        }
    }
}
