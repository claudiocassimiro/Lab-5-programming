package Ex4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * A classe MatrixOrdenation realiza a geração de uma matriz aleatória e ordenação
 * dos seus elementos em ordem crescente ou decrescente.
 *
 * @author Claudio
 * @version 1.0
 */
public class MatrixOrdenation {

    /**
     * O método principal que inicia a execução do programa.
     *
     * Gera uma matriz aleatória, solicita ao usuário a ordem desejada (crescente ou decrescente)
     * e ordena os elementos da matriz de acordo com a escolha.
     *
     * @param args Os argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ordenationMethod;
        int numberOfLines = 3;
        int numberOfColumns = 5;
        int[][] matrix = new int[numberOfLines][numberOfColumns];
        Random random = new Random();

        // Preenche a matriz com números aleatórios entre 0 e 99
        for (int i = 0; i < numberOfLines; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }

        // Solicita ao usuário a ordem desejada
        do {
            System.out.println("Você deseja ordenar em ordem crescente ou decrescente?");
            ordenationMethod = scanner.next();
        } while (!ordenationMethod.equalsIgnoreCase("crescente") && !ordenationMethod.equalsIgnoreCase("decrescente"));

        // Transforma a matriz em um array unidimensional
        int[] flattenedArray = Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .toArray();

        // Ordena o array unidimensional (Bubble Sort)
        if (ordenationMethod.equalsIgnoreCase("crescente")) {
            Arrays.sort(flattenedArray);
        } else {
            Arrays.sort(flattenedArray);
            // Inverte o array para obter a ordem decrescente
            for (int i = 0; i < flattenedArray.length / 2; i++) {
                int temp = flattenedArray[i];
                flattenedArray[i] = flattenedArray[flattenedArray.length - i - 1];
                flattenedArray[flattenedArray.length - i - 1] = temp;
            }
        }

        // Transforma o array unidimensional de volta para a matriz
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(flattenedArray, i * matrix[i].length, matrix[i], 0, matrix[i].length);
        }

        // Imprime a matriz ordenada
        for (int i = 0; i < numberOfLines; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
