package one.bootcamp.estruturas.loops;

import java.util.Scanner;

public class Ex5_Tabuada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int tabuada, numero, contador = 0;

        System.out.println("Digite a tabuada");
        tabuada = scan.nextInt();

//        System.out.println("----------WHILE----------");
//        while(contador <= 10){
//            System.out.println(tabuada + " x " + contador + " = " + (tabuada * contador++));
//        }
//        System.out.println("----------FOR----------");
//        for(int i = 1; i <= 10; i++){
//            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
//        }
        System.out.println("----------DO WHILE----------");
        do{
            System.out.println(tabuada + " x " + contador + " = " + (tabuada * contador++));
        }while(contador <= 10);

    }
}
