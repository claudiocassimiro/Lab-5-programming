package Ex1;
/**
 * A classe Main é a classe de entrada que contém o método principal (main).
 * Ela cria uma instância da classe Carro, define alguns atributos, chama alguns métodos
 * e demonstra o funcionamento básico da classe Carro.
 *
 * Este programa foi desenvolvido por Claudio.
 *
 * @author Claudio
 * @version 1.0
 */
public class Main {

    /**
     * O método principal que inicia a execução do programa.
     *
     * @param args Os argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        // Cria uma instância da classe Carro
        Carro car = new Carro();

        // Define alguns atributos do carro
        car.marca = "Fiat";
        car.cor = "Amarelo";
        car.ano = "2024";

        // Chama alguns métodos para obter informações sobre o carro
        car.getMarca();
        car.getCor();
        car.getAno();

        // Liga o carro, simula aceleração/deceleração e desliga o carro
        car.setLigarCarro();
        car.irDe0A100EVoltarPara0();
        car.setDesligarCarro();
    }
}