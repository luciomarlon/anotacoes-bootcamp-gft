package one.bootcamp.usainterface;

class Calculadora implements OperacaoMatematica{

    @Override
    public void somar(double a, double b){
        System.out.println("Soma: " + (a + b));
    }

    @Override
    public void subtrair(double a, double b){
        System.out.println("Subtração: " + (a - b));
    }

    @Override
    public void multiplicar(double a, double b){
        System.out.println("Multiplicar: " + (a * b));
    }

    @Override
    public void dividir(double a, double b){
        System.out.println("Dividir: " + (a / b));
    }


}
