public class ContaExercicio1 {

    String titular;
    Integer numero;
    String agencia;
    Double saldo;
    String dataDeAbertura;



    public void saca(Double valor){
    this.saldo -= valor;
    }

    public void deposita(Double valor){
        this.saldo += valor;
    }
    public double calculaRendimento(){
        return this.saldo *0.1;
    }

    public String recuperaDadosParaImpressao() {

            String dados = "Titular: " + this.titular;
            dados += "\nNúmero: " + this.numero;
            dados += "\nAgência: " + this.agencia;
            dados += "\nSaldo: R$" + this.saldo;
            dados += "\nData de abertura: " + this.dataDeAbertura;
            return dados;


    }
}
