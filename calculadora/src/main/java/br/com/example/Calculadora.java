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

    /**
     * Multiplica dois números.
     * @param a O primeiro fator.
     * @param b O segundo fator.
     * @return O produto de a e b.
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Divide o primeiro número pelo segundo.
     * @param a O dividendo.
     * @param b O divisor.
     * @return O quociente da divisão.
     * @throws IllegalArgumentException se o divisor (b) for zero.
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero.");
        }
        return a / b;
    }
}
