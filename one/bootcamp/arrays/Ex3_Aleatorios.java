package one.bootcamp.arrays;

import java.util.Random;

public class Ex3_Aleatorios {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numerosAleatorios = new int[20];

        for(int i = 0 ; i < numerosAleatorios.length; i++){
            
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;

        }

        System.out.print("NÚMEROS ALEATÓRIOS: ");
        for (int numero: numerosAleatorios) {

            System.out.print(numero + " ");

        }

        System.out.print("\nANTECESSORES: ");
        for (int numero: numerosAleatorios) {

            System.out.print((numero - 1) + " ");

        }

        System.out.print("\nSUCESSORES: ");
        for (int numero: numerosAleatorios) {

            System.out.print((numero + 1) + " ");

        }

    }
}
