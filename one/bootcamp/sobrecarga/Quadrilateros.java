package one.bootcamp.sobrecarga;

public class Quadrilateros {

    public static void quadrilatero(double ladoa){
        System.out.println("Quadrado: " + (ladoa * ladoa));
    }

    public static void quadrilatero(double ladoa, double ladob){
        System.out.println("Retangulo: " + (ladoa * ladob));
    }

    public static void quadrilatero(double ladoa, double ladob, double altura){
        System.out.println("Trapézio: " + ((ladoa + ladob)*altura)/2);
    }

    public static void quadrilatero(float diagonala, float diagonalb){
        System.out.println("Losango: " + ((diagonala * diagonala))/2);
    }
}
