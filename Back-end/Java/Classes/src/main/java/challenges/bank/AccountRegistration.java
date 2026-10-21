package main.java.challenges.bank;

import java.util.Scanner;

public class AccountRegistration {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char hasInitialDeposit;
        double initialDeposit = 0;

        System.out.println("Enter account number: ");
        int accNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter account holder: ");
        String accHolder = sc.nextLine();

        do {
            System.out.println("Is there a initial deposit? (y/n)");
            hasInitialDeposit = Character.toLowerCase(sc.next().charAt(0));
        }while (hasInitialDeposit != 'y' &&  hasInitialDeposit != 'n');

        if(hasInitialDeposit == 'y'){
            System.out.println("Enter initial deposit value: ");
            initialDeposit = sc.nextDouble();
        }

        AccountRegister account = new AccountRegister(accNumber, accHolder, initialDeposit);

        System.out.println("Account data: ");
        System.out.println("Account: "+account.getAccountNumber()+", Holder: "+ account.getAccountHolder()+", Balance: "+ account.getBalance());

        System.out.println("Enter a deposit value: ");
        double deposit = sc.nextDouble();

        account.deposit(deposit);
        System.out.println("Updated account data: ");
        System.out.println("Account: "+account.getAccountNumber()+", Holder: "+ account.getAccountHolder()+", Balance: "+ account.getBalance());

        System.out.println("Enter a withdraw value: ");
        double withdrawal = sc.nextDouble();

        account.withdrawal(withdrawal);
        System.out.println("Updated account data: ");
        System.out.println("Account: "+account.getAccountNumber()+", Holder: "+ account.getAccountHolder()+", Balance: "+ account.getBalance());


    }
}
