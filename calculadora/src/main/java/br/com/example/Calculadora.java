package br.com.example;

/**
 * Classe que contém a lógica de negócio para as operações matemáticas básicas.
 */
public class Calculadora {

    /**
     * Soma dois números.
     * @param a O primeiro número.
     * @param b O segundo número.
     * @return A soma de a e b.
     */
    public double somar(double a, double b) {
        return a + b;
    }

    /**
     * Subtrai o segundo número do primeiro.
     * @param a O primeiro número (minuendo).
     * @param b O segundo número (subtraendo).
     * @return A diferença entre a e b.
     */
    public double subtrair(double a, double b) {
        return a - b;
    }
}
