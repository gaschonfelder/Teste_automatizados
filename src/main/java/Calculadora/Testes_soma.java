package Calculadora;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

public class Testes_soma {

    public static void main(String[] args) {
        Somar s = new Somar();
        
        //-------------Testes Soma----------------------
        //Cenário de teste 1: Dois valores positivos
        System.out.println("Testes soma");
        int soma = s.somar(1,5);
        System.out.println(soma);
        
        //Cenário de teste 2: valor positivo e zero
        soma = s.somar(1,0);
        System.out.println(soma);
        
        //Cenário de teste 3: Dois valores iguais a zero
        soma = s.somar(0,0);
        System.out.println(soma);
        
        //Cenário de teste 4: Um valor negativo e um positivo
        soma = s.somar(-1,5);
        System.out.println(soma);
        
        //Cenário de teste 5: Dois valores negativos
        soma = s.somar(-1,-5);
        System.out.println(soma);
        
        //Cenário de teste 6: Um valor negativo e zero
        soma = s.somar(0,-5);
        System.out.println(soma);
        
        //Cenário de teste 7: Dois valores altos
        soma = s.somar(1000000,50000000);
        System.out.println(soma);
    }
    
    
}
