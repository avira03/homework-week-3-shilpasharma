package javahomework;

import java.util.Scanner;

public class program_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // enter  student details
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();

        // enter  marks for three subjects
        System.out.print("Enter Math marks (0-100): ");
        int mathMarks = scanner.nextInt();

        System.out.print("Enter Science marks (0-100): ");
        int scienceMarks = scanner.nextInt();

        System.out.print("Enter English marks (0-100): ");
        int englishMarks = scanner.nextInt();
        scanner.close();

        if (isValidMarks(mathMarks) && isValidMarks(scienceMarks) && isValidMarks(englishMarks)) {
            // Calculate total, percentage, result, and grade
            int totalMarks = mathMarks + scienceMarks + englishMarks;
            double percentage = (double) totalMarks / 3;
            String result = (percentage >= 35) ? "Pass" : "Fail";
            String grade = calculateGrade(percentage);

            displayMarkSheet(studentName, rollNumber, mathMarks, scienceMarks, englishMarks,
                    totalMarks, percentage, result, grade);
        } else {
            System.out.println("Invalid Input, Marks should be between 0 to 100.");
        }
    }

    private static boolean isValidMarks(int marks) {
        return marks >= 0 && marks <= 100;
    }

    private static String calculateGrade(double percentage) {
        if (percentage >= 80) {
            return "A+";
        } else if (percentage >= 60) {
            return "A";
        } else if (percentage >= 50) {
            return "B";
        } else if (percentage >= 35) {
            return "C";
        } else {
            return "Fail";
        }
    }

    private static void displayMarkSheet(String name, int rollNumber, int math, int science, int english,
                                         int total, double percentage, String result, String grade) {
        System.out.println(" _____________________________");
        System.out.println("|                             |");
        System.out.println("|         Mark Sheet          |");
        System.out.println("|___________________________  |");
        System.out.println("| Name : " + name  );
        System.out.println("| Roll No: " + rollNumber);
        System.out.println("|___________________________|");
        System.out.println("| Subjects : Marks          |");
        System.out.println("|___________________________|");
        System.out.println("| Math : " + math);
        System.out.println("| Science : " + science);
        System.out.println("| English : " + english);
        System.out.println("|___________________________|");
        System.out.println("| Total : " + total);
        System.out.println("|___________________________|");
        System.out.println("| Percentage : " + percentage);
        System.out.println("| Result : " + result);
        System.out.println("| Grade : " + grade);
        System.out.println("|___________________________|");
    }
}


