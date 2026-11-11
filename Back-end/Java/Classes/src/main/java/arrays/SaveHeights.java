package main.java.arrays;

import java.util.Scanner;

public class SaveHeights {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão registradas? ");
        int num_pessoas = sc.nextInt();

        double[] pessoas_altura = new double[num_pessoas];
        double sum = 0;

        for(int i = 0; i<pessoas_altura.length; i++){
            pessoas_altura[i] = sc.nextDouble();
            sum+=pessoas_altura[i];
        }

        double media = sum/num_pessoas;
        System.out.println("A média de altura é: "+ media);
    }
}
