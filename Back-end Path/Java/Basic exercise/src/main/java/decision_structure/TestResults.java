package decision_structure;

import java.util.Scanner;

public class TestResults {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your test score: ");
        double score = sc.nextDouble();

        char grade;

        if (score < 60){
            grade = 'F';
        } else if (score < 70) {
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        }else if (score < 90){
            grade = 'B';
        }else{
            grade = 'A';
        }

        System.out.println("Your grade: " + grade);

        sc.close();
    }
}
