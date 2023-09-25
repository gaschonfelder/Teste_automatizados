/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Calculadora;

/**
 *
 * @author Gabriel
 */
public class Testes_Sub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Subtração sub = new Subtração();
        
         //-------------Testes Subtração----------------------
        //Cenário de teste 1: Dois valores positivos        
        int x = sub.sub(1,5);
        System.out.println(x);
        
        //Cenário de teste 2: Dois valores negativos 
        x = sub.sub(-1,-5);
        System.out.println(x);
        
        //Cenário de teste 3: Valor positivo e zero 
        x = sub.sub(0,5);
        System.out.println(x);
        
        //Cenário de teste 4: Valor negativo e zero 
        x = sub.sub(0,-5);
        System.out.println(x);
        
        //Cenário de teste 5: Dois valores zerados
        x = sub.sub(0,0);
        System.out.println(x);
        
        //Cenário de teste 6: Valor positivo e negativo
        x = sub.sub(-5,10);
        System.out.println(x);
        
         //Cenário de teste 7: Dois valores altos
        x = sub.sub(500000, 100000);
        System.out.println(x);
        
        
    }
    
}
