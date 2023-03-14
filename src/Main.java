import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = input.nextInt();

        double totalGradePoints = 0;
        int totalCredits = 0;

            for (int i = 1; i <= numSubjects; i++)
            {
                System.out.println("Enter details for subject " + i + ":");
                System.out.print("Credits: ");
                int credits = input.nextInt();
                totalCredits += credits;
                System.out.print("Grade Points: ");
                double gradePoints = input.nextDouble();
                totalGradePoints += credits * gradePoints;
            }

                double cgpa = totalGradePoints / totalCredits;
                System.out.println("CGPA: " + cgpa);

    }
}