package one.bootcamp.metodos;
import java.net.CacheRequest;

public class Principal {
    public static void main(String[] args) {
        // Calculadora
        System.out.println("---------------EXERCÃ?CIO DA CALCULADORA----------------");
        Calculadora.somar(2, 3);
        Calculadora.subtrair(3, 2);
        Calculadora.multiplicar(2, 3);
        Calculadora.dividir(3, 2);

        System.out.println("---------------EXERCICIO HORARIO----------------");
        HoraDia.manha(4);
        HoraDia.tarde(15);
        HoraDia.noite(3);

        System.out.println("---------------EXERCICIO EMPRESTIMO----------------");

        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, Emprestimo.getQuatroParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
