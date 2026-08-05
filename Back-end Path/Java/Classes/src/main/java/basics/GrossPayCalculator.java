package basics;

import java.util.Scanner;

public class GrossPayCalculator {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many hours did you work? ");
        int hours = sc.nextInt();

        System.out.println("What is your hourly pay rate? ");
        double rate = sc.nextDouble();

        sc.close();

        double pay_rate = hours * rate;

        System.out.println("Gross Pay: " + pay_rate);
    }
}
