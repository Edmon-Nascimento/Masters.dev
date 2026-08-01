package methods;

import java.util.Scanner;

public class InstantCreditCheck {

    //Variáveis globais
    static double requiredSalary = 2500;
    static int requiredCreditScore = 700;
    static Scanner input = new Scanner(System.in);

    static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        input.close();

        boolean qualified = isUserQualified( salary,  creditScore);
        System.out.println("Your salary is: " + salary);
        System.out.println("Your credit score is: " + creditScore);
        if(qualified) {
            System.out.println("You've been aproved.");
        }else{
            System.out.println("You've been rejected.");
        }

    }

    public static boolean isUserQualified(double salary, int creditScore) {
        return salary >= requiredSalary && creditScore >= requiredCreditScore;
    }

    public static double getSalary() {
        System.out.println("Please enter your salary: ");
        return input.nextDouble();
    }

    public static int getCreditScore() {
        System.out.println("Please enter your credit score: ");
        return input.nextInt();
    }
}
