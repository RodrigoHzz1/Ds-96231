package org.example.exemplo;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.calcular(1,3));
        System.out.println(calculadora.calcular(2,7));
        System.out.println(calculadora.calcular(5.6,3.6));
    }
}
