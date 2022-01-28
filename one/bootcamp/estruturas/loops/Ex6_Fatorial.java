package one.bootcamp.estruturas.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int fatorial, numero = 1;

        System.out.println("Digite um numero.: ");
        fatorial = scan.nextInt();

        for(int i = fatorial; i >= 1 ; i--){

            numero = numero * i;
        }

        System.out.println(fatorial + "!" + " = " + numero);




    }
}
