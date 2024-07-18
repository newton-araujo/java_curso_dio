package edu.newton.segundasemana;

public class MinhaClasse {
    
    public static void main(String[] args) {
        
        String nome = "Newton";
        int idade = 31;
        String apresentacao = apresentar(nome, idade);
        
        System.out.println(apresentacao);
    }

    public static String apresentar(String nome, int idade) {
        return "Meu nome é " + nome + " e tenho " + idade + " anos.";
    }

}
