package one.bootcamp.desafios;

import java.io.IOException;
import java.util.Scanner;

public class Desafio7 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int senha = 0;
        while(senha != 2002){
            senha = leitor.nextInt();
            System.out.println("Senha Invalida");
            if (senha == 2002) System.out.println("Acesso Permitido");
        }
    }
}
