import java.text.DecimalFormat;
import java.util.Scanner;

public class Troco {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o valor monetário
        double valor = scanner.nextDouble();

        // Converte o valor em centavos
        int centavos = (int) (valor * 100);

        // Calcula a quantidade de notas de cada valor
        int[] notas = {100, 50, 20, 10, 5, 2};
        int[] quantidadeNotas = new int[notas.length];

        for (int i = 0; i < notas.length; i++) {
            quantidadeNotas[i] = centavos / (notas[i] * 100);
            centavos %= notas[i] * 100;
        }

        // Calcula a quantidade de moedas de cada valor
        int[] moedas = {100, 50, 25, 10, 5, 1};
        int[] quantidadeMoedas = new int[moedas.length];

        for (int i = 0; i < moedas.length; i++) {
            quantidadeMoedas[i] = centavos / moedas[i];
            centavos %= moedas[i];
        }

        // Imprime a quantidade de notas
        System.out.println("NOTAS:");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidadeNotas[i], (double) notas[i]);
        }

        // Imprime a quantidade de moedas
        System.out.println("MOEDAS:");
        for (int i = 0; i < moedas.length; i++) {
            double valorMoeda = (double) moedas[i] / 100;
            DecimalFormat df = new DecimalFormat("##0.00");
            System.out.printf("%d moeda(s) de R$ %s%n", quantidadeMoedas[i], df.format(valorMoeda));
        }
    }
}