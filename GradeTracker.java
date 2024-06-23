import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GradeTracker{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();

        // Input grades
        for (int i = 1; i <= numStudents; i++) {
            System.out.println("Enter grade for student " + i + ":");
            double grade = scanner.nextDouble();
            grades.add(grade);
        }

        // Calculate average
        double average = calculateAverage(grades);
        System.out.println("Average grade: " + average);

        // Calculate highest grade
        double highestGrade = calculateHighest(grades);
        System.out.println("Highest grade: " + highestGrade);

        // Calculate lowest grade
        double lowestGrade = calculateLowest(grades);
        System.out.println("Lowest grade: " + lowestGrade);
    }

    public static double calculateAverage(ArrayList<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public static double calculateHighest(ArrayList<Double> grades) {
        return Collections.max(grades);
    }

    public static double calculateLowest(ArrayList<Double> grades) {
        return Collections.min(grades);
    }
}
