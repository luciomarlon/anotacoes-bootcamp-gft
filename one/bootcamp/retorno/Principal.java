package one.bootcamp.retorno;

import one.bootcamp.sobrecarga.Quadrilateros;

public class Principal {
    public static void main(String[] args) {

        double areaQuadrado = Areas.area(3);
        System.out.println("Area Quadrado: " + areaQuadrado);

        double areaRetangulo = Areas.area(3,4);
        System.out.println("Area Retangulo: " + areaRetangulo);

        double areaTrapezio = Areas.area(4,10,5);
        System.out.println("Area Trapezio: " + areaTrapezio);

    }
}
