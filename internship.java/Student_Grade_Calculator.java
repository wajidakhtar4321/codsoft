import java.util.*;

public class Student_Grade_Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the subject 1 Name :");
        char subject = sc.next().charAt(0);
        System.out.println("Enter the subject 1 marks:");
        float marks = sc.nextFloat();
        System.out.println("Enter the subject 2 Name :");
        char subject1 = sc.next().charAt(0);
        System.out.println("Enter the subject 2 marks Name :");
        float marks1 = sc.nextFloat();
        System.out.println("Enter the subject 3 Name :");
        char subject2 = sc.next().charAt(0);
        System.out.println("Enter the subject 3 marks:");
        float marks2 = sc.nextFloat();
        System.out.println("Enter the subject 4 Name :");
        char subject3 = sc.next().charAt(0);
        System.out.println("Enter the subject 4 marks:");
        float marks3 = sc.nextFloat();
        System.out.println("Enter the subject 5 Name :");
        char subject4 = sc.next().charAt(0);
        System.out.println("Enter the subject 5 marks:");
        float marks4 = sc.nextFloat();
        float obtainedmarks = 500;
        float Totalmarks;
        float Averagepercentage;
        Totalmarks = marks + marks1 + marks2 + marks3 + marks4;
        System.out.println("your total marks is : " + Totalmarks);
        Averagepercentage = (Totalmarks / obtainedmarks) * 100;
        System.out.println("your total percentage is : " + Averagepercentage + " % ");
        if (Averagepercentage >= 85) {
            System.out.println(" Your Grade is A ");
        } else if (Averagepercentage >= 70 && Averagepercentage < 85) {
            System.out.println(" Your Grade is B ");
        } else if (Averagepercentage >= 55 && Averagepercentage < 70) {
            System.out.println(" Your Grade is C ");
        } else if (Averagepercentage >= 40 && Averagepercentage < 55) {
            System.out.println(" Your Grade is D ");
        }

        else {
            System.out.println("your Grade is E :" + Averagepercentage);
        }
        sc.close();
    }

}
