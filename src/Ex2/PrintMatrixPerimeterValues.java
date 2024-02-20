package Ex2;

import java.util.Random;

/**
 * A classe PrintMatrixPerimeterValues exibe os valores da borda de uma matriz
 * preenchida com números aleatórios.
 *
 * @author Claudio
 * @version 1.0
 */
public class PrintMatrixPerimeterValues {

    /**
     * O método principal que inicia a execução do programa.
     *
     * Gera uma matriz aleatória, e exibe os valores da borda da matriz, marcando
     * com "-" os elementos no interior da matriz.
     *
     * @param args Os argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
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

        // Exibe os valores da borda da matriz
        for (int line = 0; line < numberOfLines; line++) {
            for (int column = 0; column < numberOfColumns; column++) {
                if ((line == 0 || line == numberOfLines - 1) || (column == 0 || column == numberOfColumns - 1)) {
                    System.out.print(matrix[line][column] + " ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }
}