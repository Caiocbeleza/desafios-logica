import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenacaoParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o número de linhas de entrada
        int numLinhas = scanner.nextInt();

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        // Lê os valores e os separa em pares e ímpares
        for (int i = 0; i < numLinhas; i++) {
            int valor = scanner.nextInt();
            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }

        // Ordena os pares em ordem crescente
        Collections.sort(pares);

        // Ordena os ímpares em ordem decrescente
        Collections.sort(impares, Collections.reverseOrder());

        // Imprime os pares em ordem crescente
        for (int par : pares) {
            System.out.println(par);
        }

        // Imprime os ímpares em ordem decrescente
        for (int impar : impares) {
            System.out.println(impar);
        }
    }
}