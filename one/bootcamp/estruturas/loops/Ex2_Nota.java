package one.bootcamp.estruturas.loops;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float nota;

//        System.out.println("Digite a nota: ");
//        nota = scan.nextFloat();

        while(true){
            System.out.println("Digite a nota: ");
            nota = scan.nextFloat();
            if(nota > 10){
                System.out.println("Inválido. Digite Menor que 10:. ");
            }
            else if (nota < 0){
                System.out.println("Inválido. Digite Maior que 0:. ");

            }
            else{
                System.out.println("Nota válida, voce digitou:.> " + nota);
                break;
            }
        }
//        while(nota < 0 | nota > 10){
//
//            System.out.println("Digite uma nota válida.");
//            nota = scan.nextFloat();
//
//        }
//
        System.out.println("FIM DO PROGRAMA PROGRAMA");


    }


}
