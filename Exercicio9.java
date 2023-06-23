import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int quantidadeAlunos = input.nextInt();

        // Criação do vetor para armazenar as notas
        double[] notas = new double[quantidadeAlunos];

        // Leitura das notas dos alunos
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = input.nextDouble();
        }

        // Cálculo da média
        double soma = 0;
        for (int i = 0; i < quantidadeAlunos; i++) {
            soma += notas[i];
        }
        double media = soma / quantidadeAlunos;

        // Exibição da média final
        System.out.println("A média final da turma é: " + media);

        input.close();
    }
}
