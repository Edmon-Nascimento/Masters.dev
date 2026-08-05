package decision_structure;

import java.util.Scanner;

public class SalaryCalculator {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double salary = 1000;
        double bonus = 250;
        int quota = 10;

        System.out.println("How mane sales did the employee get this wekk? ");
        int sales = sc.nextInt();

        if (sales > quota){
            salary+=bonus;
        }

        System.out.println("Salary: "+salary);

        sc.close();
    }
}
