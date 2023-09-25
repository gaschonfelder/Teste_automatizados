/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Calculadora;

/**
 *
 * @author Gabriel
 */
public class Testes_div {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Div divi = new Div();
        
        //-------------Testes Divição----------------------
        //Cenário de teste 1: Dois valores positivos 
        int x = divi.div(6,2);
        System.out.println(x);
        
        //Cenário de teste 2: Dois valores negativos 
        x = divi.div(-6,-2);
        System.out.println(x);
        
        //Cenário de teste 3: Valor positivo e zero
        //x = divi.div(6,0);
        //System.out.println(x);
        
        //Cenário de teste 4: Valor negativo e zero
        //x = divi.div(-6,0);
        //System.out.println(x);
        
        //Cenário de teste 5: Zero e valor negativo
        x = divi.div(0,-6);
        System.out.println(x);
        
        //Cenário de teste 6: Zero e valor positivo
        x = divi.div(0,6);
        System.out.println(x);
        
        //Cenário de teste 7: Valor negativo e valor positivo
        x = divi.div(-12,6);
        System.out.println(x);
        
        //Cenário de teste 8: Valor positivo e valor negativo
        x = divi.div(12,-6);
        System.out.println(x);
    }
    }
    

