import java.util.Scanner;

public class GradeCalculator {
    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's score: ");
        double score = scanner.nextDouble();
        String grade = calculateGrade(score);
        System.out.println("The student's grade is: " + grade);
        scanner.close();
    }
}
