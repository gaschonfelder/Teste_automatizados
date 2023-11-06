/*
 * Este é um arquivo Java que define a classe Div.
 * O objetivo desta classe é fornecer um método para realizar a operação de divisão.
 * Este código é parte de um pacote chamado "Calculadora".
 */
/*
 * Autor: Gabriel
 * Data de Lançamento: 06 de novembro de 2023
 * Versão: 1.0
 */

package Calculadora;

/**
 * A classe Div fornece um método para realizar a operação de divisão entre dois números inteiros.
 */
public class Div {
    
    /**
     * Realiza a operação de divisão entre dois números inteiros.
     *
     * @param a O dividendo (o número que será dividido).
     * @param b O divisor (o número pelo qual o dividendo será dividido).
     * @return O resultado da divisão de 'a' por 'b'.
     */
    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
