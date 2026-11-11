package main.java.arrays;

import java.util.Scanner;

public class NegativeNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int qtd = sc.nextInt();

        int[] arr = new int[qtd];
        int i = 0;

        while (i<qtd){
            System.out.println("Digite um numero: ");
            int num = sc.nextInt();
            arr[i] = num;
            i++;
        }

        System.out.println("Números negativos que você digitou: ");
        for(i=0; i<arr.length; i++){
            if (arr[i]<0){
                System.out.println(arr[i]);
            }
        }
    }
}
