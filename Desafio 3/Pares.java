import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Pares {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o tamanho do array e o valor alvo
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        // Cria o array de inteiros
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Chama a função para contar os pares
        int count = Pares(arr, k);

        // Imprime o resultado
        System.out.println(count);
    }

    public static int Pares(int[] arr, int k) {
        // Cria um mapa para contar a ocorrência de cada número
        Map<Integer, Integer> numCount = new HashMap<>();

        // Conta a ocorrência de cada número no array
        for (int num : arr) {
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }

        // Conta o número de pares com a diferença igual a k
        int count = 0;
        for (int num : arr) {
            int complement = num + k;
            if (numCount.containsKey(complement)) {
                count += numCount.get(complement);
            }
        }

        return count;
    }
}