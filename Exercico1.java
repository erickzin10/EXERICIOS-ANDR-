    public class Exercico1 {
    public static void main(String[] args) {
        ContaExercicio1 c = new ContaExercicio1();

        c.titular = "Hugo";
        c.numero = 123;
        c.agencia = "45678-9";
        c.saldo = 50.0;
        c.dataDeAbertura = "04/06/2015";


        c.deposita(100.0);
        c.deposita(20.0);
        c.saca(20.0);
        System.out.println("Rendeu quanto: " +c.calculaRendimento());
        System.out.println("Saldo atual: " + c.saldo);
        System.out.println(c.recuperaDadosParaImpressao());


        ContaExercicio1 contaHooly = new ContaExercicio1();

        contaHooly.titular = "Renato";
        contaHooly.numero = 1414;
        contaHooly.agencia = "43245-0";
        contaHooly.saldo = 500.0;
        contaHooly.dataDeAbertura = "23/06/2023";

        ContaExercicio1 contaJoao = new ContaExercicio1();
        
        contaJoao.titular = "Joao";
        contaJoao.numero = 6789;
        contaJoao.agencia = "87849-1";
        contaJoao.saldo = 300.60;
        contaJoao.dataDeAbertura = "20/05/2023";

        if(contaHooly == contaJoao){
            System.out.println("Essa conta é igual. ");
        }else{
            System.out.print("Essa conta é diferente. ");
        }

    }
}



