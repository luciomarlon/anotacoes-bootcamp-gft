package one.bootcamp.arrays;

import java.util.Scanner;

public class Ex2_Contaconsoantes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];

        int qtdconsoantes = 0, contador = 0;

        do {
            System.out.println("Digite Letra: ");
            String letra = scan.next();

            if(!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))){
                consoantes[contador] = letra;
                qtdconsoantes++;
            }

            contador++;

        }while(contador < consoantes.length);

        System.out.println("-------CONSOANTES-------");

        for (String consoante : consoantes) {
            if (consoante != null)
                System.out.print(consoante + " ");
        }

        System.out.println("Quantidade de consoantes: " + qtdconsoantes);

    }

}
