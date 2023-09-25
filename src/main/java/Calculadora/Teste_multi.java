/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Calculadora;

/**
 *
 * @author Gabriel
 */
public class Teste_multi {
    
    public static void main(String[] args) {
         Multiplicação multi = new Multiplicação();
    
    //-------------Testes Multiplicação----------------------
    //Cenário de teste 1: Dois valores positivos
    int x = multi.multi(2,5);
    System.out.println(x);
    
    //Cenário de teste 2: Dois valores negativos
    x = multi.multi(-2,-5);
    System.out.println(x);
    
    //Cenário de teste 3: Valor negativo e positivo
    x = multi.multi(-2,5);
    System.out.println(x);
    
    //Cenário de teste 4: Valor negativo e zero
    x = multi.multi(-2,0);
    System.out.println(x);
    
    //Cenário de teste 5: Valor positivo e zero
    x = multi.multi(2,0);
    System.out.println(x);
    
    //Cenário de teste 1: Dois zeros
    x = multi.multi(0,0);
    System.out.println(x);
    
    }
    
}
