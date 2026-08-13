import java.util.Scanner;
public class Conditional_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Student Name:");
        String name = sc.nextLine();
        System.out.print("Enter marks in subject 1:");
        int marks1 = sc.nextInt();
        System.out.print("Enter marks in subject 2:");
        int marks2 = sc.nextInt();
        System.out.print("Enter marks in subject 3:");
        int marks3 = sc.nextInt();
        int totalMarks = marks1 + marks2 + marks3;
        double percentage = (totalMarks / 300.0) * 100;
        String result;
        if(marks1 < 35 || marks2 < 35 || marks3 < 35)
        {
            result = "Fail";
        } else if(percentage >= 60) {
            result = "First Division";
        } else if(percentage >= 50) {
            result = "Second Division";
        } else if(percentage >= 35) {
            result = "Third Division";
        } else {
            result = "Fail";
        }
        System.out.println("\n---- Result --");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);
        sc.close();
    }
}