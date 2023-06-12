
import java.util.Scanner;

public class Main {

    public Grades readInput() {
        Scanner scanner = new Scanner(System.in);
        Grades grades = new Grades();
        System.out.println("Enter point totals, -1 stops:");
        while (scanner.hasNextLine()) {
            int grade = Integer.valueOf(scanner.nextLine());
            if (grade == -1) {
                break;
            } else if (grade < 0 || grade > 100) {
                continue;
            }
            grades.addGrade(grade);
        }
        scanner.close();
        return grades;
    }

    public void printGradeDistribution(Grades grades) {
        // make an integer array of size 6 with every element initialized to 0
        int[] gradeDistribution = new int[6];
        for (int grade : grades.getGrades()) {
            if (grade < 50) {
                gradeDistribution[0]++;
            } else if (grade < 60) {
                gradeDistribution[1]++;
            } else if (grade < 70) {
                gradeDistribution[2]++;
            } else if (grade < 80) {
                gradeDistribution[3]++;
            } else if (grade < 90) {
                gradeDistribution[4]++;
            } else {
                gradeDistribution[5]++;
            }
        }
        for (int i = gradeDistribution.length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            System.out.print("*".repeat(gradeDistribution[i]));
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Grades grades = new Main().readInput();
        System.out.println("Point average (all): " + grades.averageOfGrades());
        System.out.print("Point average (passing): ");
        if (grades.averageOfGrades(50) == -1) {
            System.out.println("-");
        } else {
            System.out.println(grades.averageOfGrades(50));
        }
        System.out.println("Pass percentage: " + grades.passPercentage());
        System.out.println("Grade distribution:");
        new Main().printGradeDistribution(grades);

    }
}
