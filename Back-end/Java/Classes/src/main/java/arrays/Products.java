package main.java.arrays;

import java.util.Scanner;

public class Products {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0;
        Product[] productsArr = new Product[n];

        for(int i=0; i<n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            productsArr[i] = new Product(price, name);
            sum+=productsArr[i].getPrice();
        }

        double media = sum/n;

        System.out.println(media);

    }
}
