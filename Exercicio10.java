import java.util.Scanner;

public class Exercicio10 {
    
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Tamanho das matrizes
        System.out.print("Digite o tamanho das matrizes (n x n): ");
        int tamanho = input.nextInt();

        // Criação das matrizes
        int[][] matriz1 = new int[tamanho][tamanho];
        int[][] matriz2 = new int[tamanho][tamanho];

        // Leitura dos elementos da primeira matriz
        System.out.println("Digite os elementos da primeira matriz:");
        lerMatriz(input, matriz1);

        // Leitura dos elementos da segunda matriz
        System.out.println("Digite os elementos da segunda matriz:");
        lerMatriz(input, matriz2);

        // Cálculo da soma das matrizes
        int[][] matrizSoma = somarMatrizes(matriz1, matriz2);

        // Exibição da matriz resultante
        System.out.println("Matriz resultante da soma:");
        exibirMatriz(matrizSoma);

        input.close();
    }

    public static void lerMatriz(Scanner input, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Digite o elemento da posição (" + i + ", " + j + "): ");
                matriz[i][j] = input.nextInt();
            }
        }
    }

    public static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2) {
        int tamanho = matriz1.length;
        int[][] resultado = new int[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }

    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
