package edu.newton.primeirasemana;

public class operadores_logico {

    public static void main(String[] args) {
        
       boolean condicao1 = true;
       boolean condicao2 = false;

       if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
       } else if (condicao1 || condicao2) {
            System.out.println("Apenas umas das condições é verdadeira");
       }else {
            System.out.println("Fim");
       }

    }
}

