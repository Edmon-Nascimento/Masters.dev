package loops;

import java.util.Scanner;

public class Cashier {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount you want to deposit:");
        int amount = input.nextInt();

        double sum = 0;

        for(int i=0; i<amount; i++){
            System.out.println("Enter the cost of the item you want to deposit:");
            double cost = input.nextDouble();

            sum += cost;
        }

        System.out.println("Your total is: " + sum);

        input.close();
    }
}
