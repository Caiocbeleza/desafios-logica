import java.util.Scanner;

public class Virus {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Lê a quantidade de casos de teste
	        int n = scanner.nextInt();
	        scanner.nextLine(); // Lê o caractere de quebra de linha após o número

	        // Processa cada caso de teste
	        for (int i = 0; i < n; i++) {
	            // Lê a linha de entrada
	            String linha = scanner.nextLine();

	            // Chama a função para decifrar a linha
	            String linhaDecifrada = decifrarLinha(linha);

	            // Imprime a linha decifrada
	            System.out.println(linhaDecifrada);
	        }
	    }

	    public static String decifrarLinha(String linha) {
	        int meio = linha.length() / 2;
	        String linhaDecifrada = "";

	        // Decifra a metade esquerda da linha
	        for (int i = meio - 1; i >= 0; i--) {
	            linhaDecifrada += linha.charAt(i);
	        }

	        // Decifra a metade direita da linha
	        for (int i = linha.length() - 1; i >= meio; i--) {
	            linhaDecifrada += linha.charAt(i);
	        }

	        return linhaDecifrada;
	    }
	}
