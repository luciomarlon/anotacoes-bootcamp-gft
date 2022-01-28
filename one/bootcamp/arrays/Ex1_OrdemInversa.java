package one.bootcamp.arrays;

public class Ex1_OrdemInversa {

    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};
        int contador = 0;
        System.out.print("VETOR ORIGINAL: ");
        while(contador < vetor.length){
            System.out.print(vetor[contador] + " ");
            contador++;
        }

        System.out.print("\nVETOR INVERSO: ");
        for (int i = vetor.length -1; i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }

    }
}
