import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroCandidatos = 5;
        Map<Integer, String> candidatos = new HashMap<>();

        // Cadastro dos candidatos
        for (int i = 1; i <= numeroCandidatos; i++) {
            System.out.print("Digite o número do candidato " + i + ": ");
            int numero = input.nextInt();
            input.nextLine(); // Limpar o buffer do teclado
            System.out.print("Digite o nome do candidato " + i + ": ");
            String nome = input.nextLine();
            candidatos.put(numero, nome);
        }

        Map<Integer, Integer> votos = new HashMap<>();

        boolean votacaoEncerrada = false;
        int votosTotais = 0;

        // Votação
        while (!votacaoEncerrada) {
            System.out.print("Digite o número do candidato (0 para encerrar a votação): ");
            int voto = input.nextInt();

            if (voto == 0) {
                votacaoEncerrada = true;
            } else if (candidatos.containsKey(voto)) {
                votosTotais++;
                if (votos.containsKey(voto)) {
                    votos.put(voto, votos.get(voto) + 1);
                } else {
                    votos.put(voto, 1);
                }
            } else {
                System.out.println("Número de candidato inválido!");
            }
        }

        System.out.println("Número de votos totais: " + votosTotais);

        int maiorVotos = 0;
        int candidatoVencedor = 0;
        boolean houveEmpate = false;

        // Verificar candidato vencedor
        for (int numeroCandidato : votos.keySet()) {
            int votosCandidato = votos.get(numeroCandidato);
            if (votosCandidato > maiorVotos) {
                maiorVotos = votosCandidato;
                candidatoVencedor = numeroCandidato;
                houveEmpate = false;
            } else if (votosCandidato == maiorVotos) {
                houveEmpate = true;
            }
        }

        if (houveEmpate) {
            System.out.println("Houve empate entre os candidatos com maior votação. Nova votação necessária!");
        } else {
            String nomeVencedor = candidatos.get(candidatoVencedor);
            double percentualVotos = (maiorVotos * 100.0) / votosTotais;
            System.out.println("O candidato " + nomeVencedor + " foi o vencedor, com " + maiorVotos + " votos (" + percentualVotos + "% dos votos).");
        }

        input.close();
    }
}

