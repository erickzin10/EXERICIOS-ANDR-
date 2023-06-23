import java.util.Scanner;

/*Faça um algoritmo que leia o nome e 5 notas de um aluno e calcule:

Se o aluno foi aprovado(nota maior ou igual a 60)
Se o aluno foi reprovado(nota menor que 40)
Se o aluno ficou em recuperação(nota entre 40 e 59)
 */

public class Exercicio3 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = input.nextLine();

        int[] notas = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = input.nextInt();
        }

        String resultado = calcularResultado(notas);

        System.out.println("Aluno(a) " + nome + " - Resultado: " + resultado);

        input.close();
    }

    public static String calcularResultado(int[] notas) {
        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        int media = soma / notas.length;

        if (media >= 60) {
            return "Aprovado";
        } else if (media < 40) {
            return "Reprovado";
        } else {
            return "Recuperação";
        }
    }
}
    

