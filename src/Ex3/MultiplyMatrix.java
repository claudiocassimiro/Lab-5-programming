package Ex3;

import java.util.Random;

/**
 * A classe MultiplyMatrix realiza a multiplicação de duas matrizes aleatórias
 * e exibe o resultado.
 *
 * @author Claudio
 * @version 1.0
 */
public class MultiplyMatrix {

    /**
     * O método principal que inicia a execução do programa.
     *
     * Gera duas matrizes aleatórias, realiza a multiplicação das matrizes e exibe o resultado.
     *
     * @param args Os argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        Random random = new Random();
        int numberOfLines = 2;
        int numberOfColumns = 2;
        int[][] matrix1 = new int[numberOfLines][numberOfColumns];
        int[][] matrix2 = new int[numberOfLines][numberOfColumns];
        int[][] matrixResult = new int[numberOfLines][numberOfColumns];

        // Preenche as duas matrizes com números aleatórios entre 0 e 99
        for (int i = 0; i < numberOfLines; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                matrix1[i][j] = random.nextInt(100);
                matrix2[i][j] = random.nextInt(100);
            }
        }

        // Realiza a multiplicação das matrizes
        for (int line = 0; line < numberOfLines; line++) {
            for (int column = 0; column < numberOfColumns; column++) {
                matrixResult[line][column] = 0;
                for (int k = 0; k < numberOfColumns; k++) {
                    matrixResult[line][column] += matrix1[line][k] * matrix2[k][column];
                }
            }
        }

        // Imprime a matriz resultante da multiplicação
        for (int line = 0; line < numberOfLines; line++) {
            for (int column = 0; column < numberOfColumns; column++) {
                System.out.print(matrixResult[line][column] + " ");
            }
            System.out.println();
        }
    }
}
