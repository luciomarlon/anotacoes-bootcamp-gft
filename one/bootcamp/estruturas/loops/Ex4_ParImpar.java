package one.bootcamp.estruturas.loops;

import java.util.Scanner;

public class Ex4_ParImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtdNumeros, contador = 0, numero, pares = 0, impares = 0;

        System.out.println("Digite a qtd de numeros.: ");
        qtdNumeros = scan.nextInt();

//       do {
//
//           System.out.println("Digite o número.: ");
//           numero = scan.nextInt();
//           contador++;
//           if (numero % 2 == 0) pares++;
//           else impares++;
//
//       } while(contador < qtdNumeros);

        while(contador < qtdNumeros) {
            System.out.println("Digite o número.: ");
            numero = scan.nextInt();
            contador++;
            if (numero % 2 == 0) pares++;
            else impares++;
        }
        System.out.println("Pares.: " + pares);
        System.out.println("Impares.: " + impares);
    }
}
