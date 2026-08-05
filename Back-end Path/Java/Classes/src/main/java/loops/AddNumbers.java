package loops;

import java.util.Scanner;

public class AddNumbers {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean again = true;

        do {
            System.out.println("Enter a number: ");
            double firstNumber = input.nextDouble();

            System.out.println("Enter a number: ");
            double secondNumber = input.nextDouble();

            double sum = firstNumber + secondNumber;
            System.out.println("The sum is " + sum);

            System.out.println("Wants to sum again? [Y/N]");
            String answer = input.next();

            if (answer.equalsIgnoreCase("N")) {
                again = false;
            }
        }while (again);

        input.close();
    }
}
