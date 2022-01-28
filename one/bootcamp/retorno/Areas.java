package one.bootcamp.retorno;

public class Areas {

    public static double area(double ladoa){
        return ladoa * ladoa;
    }

    public static double area(double ladoa, double ladob){
        return ladoa * ladob;
    }

    public static double area(double ladoa, double ladob, double altura){
        return((ladoa + ladob)*altura)/2;
    }
}
