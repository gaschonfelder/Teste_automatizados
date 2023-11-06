package test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Calculadora.*;

public class Calculadora_JUnit_teste {
    Somar s = new Somar();
    Subtração sub = new Subtração();
    Multiplicação m = new Multiplicação();
    Div d = new Div();
    //Testes
    //P = Positivo / N = Negativo / Z = Zero
    //Testes Soma
    @Test
    public void Soma_P_P(){
        s.somar(2, 5);
    }
    @Test
    public void Soma_P_N(){
        s.somar(2, -5);
    }
    @Test
    public void Soma_N_P(){
        s.somar(-2, 5);
    }
    @Test
    public void Soma_N_N(){
        s.somar(-2, -5);
    }
    @Test
    public void Soma_Z_N(){
        s.somar(0, -5);
    }
    @Test
    public void Soma_Z_P(){
        s.somar(0, 5);
    }
    @Test
    public void Soma_P_Z(){
        s.somar(5, 0);
    }
    @Test
    public void Soma_N_Z(){
        s.somar(-5, 0);
    }
    @Test
    public void Soma_Z_Z(){
        s.somar(0, 0);
    }
    
    //Testes Subtração
    @Test
    public void Sub_P_P(){
        sub.sub(2, 5);
    }
    @Test
    public void Sub_P_N(){
        sub.sub(2, -5);
    }
    @Test
    public void Sub_N_P(){
        sub.sub(-2, 5);
    }
    @Test
    public void Sub_N_N(){
        sub.sub(-2, -5);
    }
    @Test
    public void Sub_P_Z(){
        sub.sub(2, 0);
    }
    @Test
    public void Sub_Z_P(){
        sub.sub(0, 5);
    }
    @Test
    public void Sub_N_Z(){
        sub.sub(-2,0);
    }
    @Test
    public void Sub_Z_N(){
        sub.sub(0,-2);
    }
    @Test
    public void Sub_Z_Z(){
        sub.sub(0,0);
    }
    
    //Testes Multiplicação
    @Test
    public void Mult_P_P(){
        m.multi(2, 5);
    }
    @Test
    public void Mult_P_N(){
        m.multi(2, -5);
    }
    @Test
    public void Mult_N_P(){
        m.multi(-2, 5);
    }
    @Test
    public void Mult_N_N(){
        m.multi(-2, -5);
    }
    @Test
    public void Mult_P_Z(){
        m.multi(2, 0);
    }
    @Test
    public void Mult_Z_P(){
        m.multi(0, 5);
    }
    @Test
    public void Mult_Z_N(){
        m.multi(0, -5);
    }
    @Test
    public void Mult_N_Z(){
        m.multi(-2, 0);
    }
    @Test
    public void Mult_Z_Z(){
        m.multi(0, 0);
    }
    //Testes Divisão
    @Test
    public void Div_P_P(){
        d.div(8, 2);
    }
    @Test
    public void Div_P_N(){
        d.div(8, -2);
    }
    @Test
    public void Div_N_P(){
        d.div(-8, 2);
    }
    @Test
    public void Div_N_N(){
        d.div(-8, -2);
    }
    @Test
    public void Div_Z_P(){
        d.div(0, 2);
    }
    @Test
    public void Div_Z_N(){
        d.div(0, -2);
    }

}
