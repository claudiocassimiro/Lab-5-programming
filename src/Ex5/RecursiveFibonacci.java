package Ex5;

import java.util.Scanner;

/**
 * A classe RecursiveFibonacci calcula o n-ésimo termo da sequência de Fibonacci
 * usando um método recursivo.
 *
 * @author Claudio
 * @version 1.0
 */
public class RecursiveFibonacci {

    /**
     * Este método calcula o n-ésimo termo da sequência de Fibonacci de forma recursiva.
     *
     * @param number O número inteiro para o qual calcular o termo da sequência.
     * @return O n-ésimo termo da sequência de Fibonacci.
     */
    public static int recursiveFibonacciMethod(int number) {
        if (number < 2) {
            return number;
        }

        return recursiveFibonacciMethod(number - 1) + recursiveFibonacciMethod(number - 2);
    }

    /**
     * O método principal que inicia a execução do programa.
     *
     * Solicita ao usuário que digite um número e imprime o resultado do cálculo
     * do n-ésimo termo da sequência de Fibonacci usando o método recursivo.
     *
     * @param args Os argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular o termo da sequência de Fibonacci:");
        int number = scanner.nextInt();

        int result = recursiveFibonacciMethod(number);

        System.out.println("O " + number + "-ésimo termo da sequência de Fibonacci é: " + result);
    }
}
