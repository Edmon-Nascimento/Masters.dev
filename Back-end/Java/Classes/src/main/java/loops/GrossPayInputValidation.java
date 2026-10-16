package loops;

import java.util.Scanner;

public class GrossPayInputValidation {
    static void main(String[] args) {
        double rate = 15;

        Scanner sc = new Scanner(System.in);

        System.out.println("How many hours do you work?");
        double hoursWorked = sc.nextDouble();

        while (hoursWorked < 1 || hoursWorked > 40) {{
            System.out.println("Sorry, you must enter a number between 1 and 40. Try again.");
                hoursWorked = sc.nextDouble();
            }
        }
        sc.close();
    }

}
