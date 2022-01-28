package one.bootcamp.metodos;
public class HoraDia {

    public static void manha(double hora){
        if (hora < 12 && hora > 03){
            System.out.println("Bom dia");
        }
    }

    public static void tarde(double hora){
        if (hora > 12 && hora < 18){
            System.out.println("Boa tarde");
        }
    }

    public static void noite(double hora){
        if (hora >= 18 || hora <= 03){
            System.out.println("Boa noite");
        }
        else{
            System.out.println("Bom dia");
        }
    }

}
