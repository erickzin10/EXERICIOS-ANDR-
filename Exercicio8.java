import java.util.Scanner;

public class Exercicio8 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        System.out.println("Digite uma sequência de números inteiros positivos (digite um número negativo para encerrar):");

        do {
            numero = input.nextInt();

            if (numero >= 0) {
                if (numero % 2 == 0) {
                    quantidadePares++;
                } else {
                    quantidadeImpares++;
                }
            }
        } while (numero >= 0);

        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);

        input.close();
    }
}
