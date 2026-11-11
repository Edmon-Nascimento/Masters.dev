package main.java.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows quantity");
        int rows = sc.nextInt();

        System.out.println("Enter columns quantity");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                matrix[i][j] = sc. nextInt();
            }
        }

        System.out.println("Select a number from the matrix: ");
        int selectedNumber = sc.nextInt();

        for(int i =0; i< matrix.length; i++){
            for (int j =0; j<matrix[i].length; j++){
                if(matrix[i][j]==selectedNumber){
                    System.out.printf("Position: [%d:%d]\n", i, j);

                    if(j-1 >= 0) {
                        System.out.println("Left: "+matrix[i][j-1]);
                    }
                    if(j+1 < matrix[i].length){
                        System.out.println("Right "+matrix[i][j+1]);
                    }
                    if(i-1 >= 0){
                        System.out.println("Top: "+matrix[i-1][j]);
                    }
                    if(i+1 < matrix[i].length){
                        System.out.println("Down: "+matrix[i+1][j]+"\n");
                    }
                }
            }
        }



    }
}
