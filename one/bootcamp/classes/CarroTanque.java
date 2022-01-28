package one.bootcamp.classes;

import java.util.Scanner;

public class CarroTanque {

        public static void main(String[] args) {

        encherOtanque();

    }


    public static void encherOtanque(){

        Scanner scan = new Scanner(System.in);
        String cor, modelo;
        float tanque;
        System.out.print("Digite um valor para completar: ");
        tanque = scan.nextFloat();
        if(tanque >= 50f) System.out.println("Tanque cheio " + tanque);
        else
            System.out.println("Precisa completar " + tanque);

    }
}
