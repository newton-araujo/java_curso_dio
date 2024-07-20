package edu.newton.primeirasemana;

public class Operadores2 {
    
    public static void main(String[] args) {
        int num1, num2;

        num1 = 2;
        num2 = 3;

        boolean resultado; //Variavel vazia aguardando resultado da condição.
        String resultadoTernario = num1 == num2 ? "Verdadeiro" : "Falso"; // Operador ternario.

        //Condicional
        if (num1 == num2) {
            resultado = true;
        } else{
            resultado = false;
        }

        System.out.println(resultado);

        System.out.println(resultadoTernario);
    }
}
