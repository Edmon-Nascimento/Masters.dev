package decision_structure;

import java.util.Scanner;

public class GradeMessage {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What was your grade? ");
        String grade = sc.next();

        switch (grade) {
            case "A":
                System.out.println("You are the first grade.");
                break;

            case "B":
                System.out.println("You are the second grade.");
                break;

            case "C":
                System.out.println("You are the third grade.");
                break;

            case "D":
                System.out.println("You are the fourth grade.");
                break;

            case "F":
                System.out.println("You are the fifth grade.");
                break;

            default:
                System.out.println("None grade detected.");
                break;
        }



        sc.close();
    }
}
