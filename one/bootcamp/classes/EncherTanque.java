package one.bootcamp.classes;

public class EncherTanque {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setCor("Azul");
        carro.setModelo("Esportivo");
        carro.setCapacidadeTanque(50);

        System.out.println("--------------------------------------");

        System.out.println("Cor: " + carro.getCor());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Capacidade Tanque: " +
                carro.getCapacidadeTanque());
        System.out.println("Valor livro combustível: " +
                carro.totalValorTanque(5.50d));

        System.out.println("--------------------------------------");
        Carro carro2 = new Carro("Cinza", "Clássico", 60);
        System.out.println("Cor: " + carro2.getCor());
        System.out.println("Modelo: " +
                carro2.getModelo());
        System.out.println("Capacidade do Tanque: " +
                carro2.getCapacidadeTanque());

        System.out.println("Valor litro combustível: " +
                carro2.totalValorTanque(6.50d));

        System.out.println("--------------------------------------");

    }
}
