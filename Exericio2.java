import java.util.Scanner;

/* Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede) precisa ser coberta por azulejos também retangulares.
 O azulejo retangular tem dimensões ha (altura do azulejo) e la (largura do azulejo).
 Escreva um programa que leia as quatro medidas hp, lp, ha e la, calcule e imprima quantos azulejos com as medidas dadas são necessários para cobrir a parede dada.  */

 public class Exericio2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a altura da parede: ");
        double hp = input.nextDouble();

        System.out.print("Digite a largura da parede: ");
        double lp = input.nextDouble();

        System.out.print("Digite a largura do azulejo: ");
        double la = input.nextDouble();

        System.out.print("Digite a altura do azulejo: ");
        double ha = input.nextDouble();

        int quantidadeAzulejos = calcularQuantidadeAzulejos(hp, lp, ha, la );

       System.out.println("A quantidade de azulejos necessárias é:  " + quantidadeAzulejos);
        
        input.close();

    }

    public static int calcularQuantidadeAzulejos(double hp, double lp, double ha, double la) {
        double areaParede = hp * lp;
        double areaAzulejo = ha * la;
        int quantidadeAzulejos = (int) Math.ceil(areaParede / areaAzulejo);
        return quantidadeAzulejos;
    }

}
    
