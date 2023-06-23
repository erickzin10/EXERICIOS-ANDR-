import java.util.Scanner;

public class Exericio6 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temperatura = input.nextDouble();

        System.out.println("Escolha a opção de conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        int opcao = input.nextInt();

        double resultado;

        if (opcao == 1) {
            resultado = celsiusParaFahrenheit(temperatura);
            System.out.println(temperatura + " °C equivale a " + resultado + " °F.");
        } else if (opcao == 2) {
            resultado = fahrenheitParaCelsius(temperatura);
            System.out.println(temperatura + " °F equivale a " + resultado + " °C.");
        } else {
            System.out.println("Opção inválida!");
        }

        input.close();
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
