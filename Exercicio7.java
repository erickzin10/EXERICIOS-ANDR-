import java.util.Random;
import java.util.Scanner;

public class Exercicio7 {
        public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;

        Scanner input = new Scanner(System.in);
        int palpite;
        int tentativas = 0;

        System.out.println("Bem-vindo ao jogo Adivinhe o Número!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = input.nextInt();
            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("Seu palpite é menor do que o número gerado.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Seu palpite é maior do que o número gerado.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativa(s).");
            }
        } while (palpite != numeroAleatorio);

        input.close();
    }
}

