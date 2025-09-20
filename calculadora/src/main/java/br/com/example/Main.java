package br.com.example;

public class Main {
        public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("--- Projeto Calculadora Simples ---");
        System.out.println("Demonstração das operações:");

        double num1 = 10;
        double num2 = 5;

        System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, calc.somar(num1, num2));
        System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, calc.subtrair(num1, num2));
        
    }
}