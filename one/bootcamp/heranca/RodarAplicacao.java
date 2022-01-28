package one.bootcamp.heranca;

public class RodarAplicacao {

    public static void main(String[] args) {

        //instanciamento normal
        Funcionario obj_funcionario = new Funcionario();

        //upcasts: gerente para funcionário
        Funcionario obj_gerente = new Gerente();
        Funcionario obj_vendedor = new Vendedor();
        Funcionario obj_faxineiro = new Faxineiro();

        //downcasts: o conceito deve ser evitado
        Vendedor vendedor = (Vendedor) new Funcionario();

        /*os dados dentro de vendedor estão em funcionário,
        contudo os dados de Funcionário, podem se perder por
        não existirem correspondentes dentro de Vendedor
        */

    }
}
