import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in Subject " + i + ": ");
            double subjectMarks = scanner.nextDouble();
            totalMarks += subjectMarks;
        }

        double totalPossibleMarks = numSubjects * 100;
        double averagePercentage = (totalMarks / totalPossibleMarks) * 100;

        String letterGrade;
        if (averagePercentage >= 90) {
            letterGrade = "A";
        } else if (averagePercentage >= 80) {
            letterGrade = "B";
        } else if (averagePercentage >= 70) {
            letterGrade = "C";
        } else if (averagePercentage >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        System.out.println("\nTotal Marks Obtained: " + totalMarks);
        System.out.println("Total Possible Marks: " + totalPossibleMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Letter Grade: " + letterGrade);

        scanner.close();
    }
}
