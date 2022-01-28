package one.bootcamp.metodos;
public class Emprestimo {


    public static int getTresParcelas(){
        return 3;
    }

    public static int getQuatroParcelas(){
        return 4;
    }

    public static double getTaxaTresParcelas(){
        return 0.25;
    }
    public static double getTaxaQuatroParcelas(){
        return 0.3;
    }


    public static void calcular(double valor, int parcelas){
        if (parcelas == 3){
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("valor para 3 parcelas: R$ " + valorFinal);
        }

        else if (parcelas == 4){

            double valorFinal = valor + (valor * getTaxaQuatroParcelas());
            System.out.println("valor para 4 parcelas: R$ " + valorFinal);

        }

        else{
            System.out.println("Parcelas não aceitas");
        }
    }
}
