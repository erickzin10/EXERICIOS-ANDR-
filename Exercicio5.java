import java.util.Random;

public class Exercicio5 {
    public static void main(String[] args) {

                Random random = new Random();
        int quantidadeNumeros = 100;
        int[] numeros = new int[quantidadeNumeros];
        int soma = 0;
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        // Geração dos números aleatórios e cálculos
        for (int i = 0; i < quantidadeNumeros; i++) {
            numeros[i] = random.nextInt();
            soma += numeros[i];
            if (numeros[i] % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }
        }

        // Exibição dos números gerados
        System.out.println("Números gerados:");
        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.println(numeros[i]);
        }

        // Resultados
        System.out.println("Soma de todos os números: " + soma);
        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);
    }
}