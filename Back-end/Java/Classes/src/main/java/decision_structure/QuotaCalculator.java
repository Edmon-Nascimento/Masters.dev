package decision_structure;

import java.util.Scanner;

public class QuotaCalculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quota = 10;

        System.out.println("Enter the number of sales made: ");
        int sales = sc.nextInt();

        if (sales >= quota){
            System.out.println("Congrats! You've met your quota");
        }else {
            int sales_short = quota - sales;
            System.out.println("You did not make your quota. You were " + sales_short + " sales short.");
        }

        sc.close();
    }
}
