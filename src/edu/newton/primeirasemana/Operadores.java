package edu.newton.primeirasemana;

public class Operadores {

    public static void main(String[] args) {
        
        double soma = 15.7 + 12.4;
        int subtrair = 5 - 2;
        int multiplicacao = 2 * 2;
        int divisao = 10 / 2;
        int restoDaDivisao = 10 % 2;
        double modulo = (2 * 2) + (5 / 2);


        //Concatenando String

        String nomeCompleto = "Linguagem" + " Java";


        String concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = "1" + (1+1+1);

        System.out.println(concatenacao);

        //Incremento 
        int numero = 5; 
        numero ++; //Incrementando mais um.

        System.out.println(numero);


    }

    
    
}
