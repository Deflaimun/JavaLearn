package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Isto é um comentário, ele não é considerado na hora de rodar o programa
        int x = 2; // declaração de variável do tipo inteiro, com valor 2
        String palavra = "tatu"; //declaração de variável do tipo String, com valor tatu
        boolean testeCondicional = true; //declaração de variável do tipo boolean (lógica) de valor true. Variaveis logicas só podem assumir true ou false

        Scanner sc = new Scanner(System.in); //Usamos isto para receber dados do console, a telinha preta. Basta fazer isto que funciona
        System.out.println("Digite um novo valor para a variável x");
        x = sc.nextInt(); //e usar este comando pra associar o valor, a variável x, se for inteiro.
        palavra = sc.nextLine(); //usar este comando se a variável for do tipo String, comando lê a linha inteira

        boolean testeLoopWhile = true; // inicializando variável do tipo boolean, com valor verdadeiro
        String resp; //inicializando variável do tipo String para ser utilizada mais tarde

        int tamanhoFor = 10;


        if(testeCondicional){
            //se valor de testeCondicional true, então execute este trecho
        }
        else{
            //se valor de testeCondicional false, então executar este trecho

        }

        while(testeLoopWhile){
            System.out.println("Faça algo enquanto testeLoopWhile for verdadeiro");
            System.out.println("Você deseja sair do loop?");
            resp = sc.nextLine();

            if(resp.equalsIgnoreCase("s") || resp.equalsIgnoreCase("sim")){
                testeLoopWhile = false; //se o usuario digitar a letra s ou sim, saia do loop
            }
            // caso contrário, para qualquer outra entrada continue a execução
            // chegando no final, volta para o começo do loop
        }

        for (int i = 0; i < tamanhoFor; i++) {
            System.out.println("Estou executando a linha "+i );
            System.out.println("Irei executar "+tamanhoFor + " vezes");

        }


    }

    public static int exemploFuncao(int variavel1, int variavel2){
        int resultado = 0;

        return resultado;

    }
}
