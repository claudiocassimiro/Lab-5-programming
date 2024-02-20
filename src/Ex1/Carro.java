package Ex1;
/**
 * A classe Carro representa um objeto carro com atributos como marca, cor, ano e estado de ligado.
 * Também possui métodos para obter informações sobre o carro, ligar/desligar o carro e simular uma aceleração/deceleração.
 *
 * @author Claudio
 * @version 1.0
 */
public class Carro {

    /**
     * A marca do carro.
     */
    public String marca;

    /**
     * A cor do carro.
     */
    public String cor;

    /**
     * O ano do carro.
     */
    public String ano;

    /**
     * O estado de ligado/desligado do carro.
     */
    public boolean ligado;

    /**
     * Construtor padrão da classe Carro.
     */
    public Carro() {
    }

    /**
     * Obtém e imprime a marca do carro.
     */
    public void getMarca() {
        System.out.println(this.marca);
    }

    /**
     * Obtém e imprime a cor do carro.
     */
    public void getCor() {
        System.out.println(this.cor);
    }

    /**
     * Obtém e imprime o ano do carro.
     */
    public void getAno() {
        System.out.println(this.ano);
    }

    /**
     * Liga o carro e imprime o estado atual do carro.
     */
    public void setLigarCarro() {
        this.ligado = true;
        this.oCarroEstaLigado();
    }

    /**
     * Desliga o carro e imprime o estado atual do carro.
     */
    public void setDesligarCarro() {
        this.ligado = false;
        this.oCarroEstaLigado();
    }

    /**
     * Simula a aceleração do carro de 0 a 100 KM/h e depois a desaceleração de 100 a 0 KM/h.
     */
    public void irDe0A100EVoltarPara0() {
        if (this.ligado) {
            for (int i = 0; i <= 100; i++) {
                System.out.println(i + " KM/h");
            }

            for (int i = 100; i >= 0; i--) {
                System.out.println(i + " KM/h");
            }
        } else {
            System.out.println("O carro está desligado");
        }
    }

    /**
     * Imprime se o carro está ligado ou desligado.
     */
    public void oCarroEstaLigado() {
        if (this.ligado) {
            System.out.println("O carro está ligado");
        } else {
            System.out.println("O carro está desligado");
        }
    }
}
