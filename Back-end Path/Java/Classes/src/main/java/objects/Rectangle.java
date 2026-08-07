package objects;

/**
 * Representa uma figura geométrica do tipo Retângulo.
 * Esta classe encapsula as dimensões (comprimento e largura) e a quantidade de lados,
 * oferecendo métodos para calcular o perímetro e a área.
 */
public class Rectangle {

    // --- Atributos Privados (Encapsulamento) ---
    private double length; // Comprimento do retângulo
    private double width;  // Largura do retângulo
    private int sides = 4; // Número de lados (padrão 4 para retângulos)

    /**
     * Construtor padrão (sem parâmetros).
     * Inicializa um retângulo com comprimento e largura iguais a 0.
     */
    public Rectangle(){
        setLength(0);
        setWidth(0);
    }

    /**
     * Construtor customizado.
     *
     * @param length O comprimento do retângulo.
     * @param width A largura do retângulo.
     */
    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    // --- Métodos de Cálculo ---

    /**
     * Calcula o perímetro do retângulo.
     *
     * @return O valor do perímetro (2 * comprimento + 2 * largura).
     */
    public double calculatePerimeter() {
        return 2 * length + 2 * width;
    }

    /**
     * Calcula a área do retângulo.
     *
     * @return O valor da área (comprimento * largura).
     */
    public double calculateArea() {
        return length * width;
    }

    // --- Getters e Setters (Encapsulamento) ---

    /**
     * Retorna o comprimento atual do retângulo.
     * @return O comprimento.
     */
    public double getLength() {
        return length;
    }

    /**
     * Define um novo valor para o comprimento do retângulo.
     * @param length O novo comprimento.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Retorna a largura atual do retângulo.
     * @return A largura.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Define um novo valor para a largura do retângulo.
     * @param width A nova largura.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Retorna o número de lados da figura.
     * @return A quantidade de lados (4).
     */
    public int getSides() {
        return sides;
    }

    /**
     * Define a quantidade de lados.
     * @param sides O novo número de lados.
     */
    public void setSides(int sides) {
        this.sides = sides;
    }
}