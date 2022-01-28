package one.bootcamp.arrays;

import java.util.Random;

public class Ex4_Multidimensionais {

    public static void main(String[] args) {


        Random random = new Random();

        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for ( int[] linha: matriz ) {
            for (int elementoDaColuna: linha) {
                System.out.print(elementoDaColuna + " ");
            }
            System.out.println();
        }

    }
}
