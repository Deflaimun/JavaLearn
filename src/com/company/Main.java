package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Isto é um comentário, ele não é considerado na hora de rodar o programa
        int x = 2; // declaração de variável do tipo inteiro, com valor 2
        String palavra = "tatu"; //declaração de variável do tipo String, com valor tatu
        boolean teste = true; //declaração de variável do tipo boolean (lógica) de valor true. Variaveis logicas só podem assumir true ou false
        Scanner sc = new Scanner(System.in); //Usamos isto para receber dados do console, a telinha preta. Basta fazer isto que funciona
        System.out.println("Digite um novo valor para a variável x");
        x = sc.nextInt(); //e usar este comando pra associar o valor, a variável x, se for inteiro.
        palavra = sc.next(); //usar este comando se a variável for do tipo String


        if(teste){
            //se valor de teste true, então execute este trecho
        }
        else{
            //se valor de teste false, então executar este trecho

        }
    }

    public static int exemploFuncao(int variavel1, int variavel2){
        int resultado = 0;

        return resultado;

    }
}
