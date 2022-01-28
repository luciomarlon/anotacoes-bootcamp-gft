package one.bootcamp.estruturas.loops;

import java.util.Scanner;

public class Ex3_MaiorValor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float numero, maior = 0, soma = 0;

        int contador = 0;
        do{
            System.out.println("Digite os numeros: ");
            numero = scan.nextFloat();
            contador++;
            soma = (numero + soma);
            if (numero > maior) maior = numero;
            System.out.println("Maior: >> " + maior);

        } while(contador < 5);

        System.out.println("Média: >> " + soma/5);

    }
}
