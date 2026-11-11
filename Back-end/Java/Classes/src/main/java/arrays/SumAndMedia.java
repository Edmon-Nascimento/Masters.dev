package main.java.arrays;

import java.util.Scanner;

public class SumAndMedia {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int qtd = sc.nextInt();

        double[] arr = new double[qtd];

        int i = 0;
        double sum = 0;
        while (i  < qtd){
            System.out.println("Digite um número: ");
            double num = sc.nextDouble();
            arr[i] = num;
            sum += num;
            i++;
        }

        double media = sum/arr.length;

        System.out.print("Valores digitados: ");
        for(i = 0; i<arr.length; i++){
            System.out.print(arr[i]+"; ");
        }
        System.out.printf("\nSoma = %.2f",sum);
        System.out.printf("\nMedia = %.2f", media);

    }
}
