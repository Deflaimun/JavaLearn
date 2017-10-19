package com.company;

public class Pessoa { // Esta é uma nova classe do tipo pessoa

    private int idade; // Pessoa tem idade
    private String nome; // pessoa tem nome

    public int getIdade() {
        //aqui obtenho a idade da pessoa
        return idade;
    }

    public void setIdade(final int idade) {
        //aqui altero a idade da pessoa
        this.idade = idade;
        System.out.println("Idade alterada com sucesso");
    }

    public String getNome() {
        //aqui obtenho o nome da pessoa
        return nome;
    }

    public void setNome(final String nome) {
        //aqui altero a idade da pessoa
        this.nome = nome;
        System.out.println("Nome alterado com sucesso");
    }

    public Pessoa(String nome, int idade){
        //aqui eu construo uma instância da classe pessoa, setando nome e idade
        this.nome = nome;
        this.idade = idade;

    }

    public void andar(){
        System.out.println("Estou andando");
    }

    public void correr(){
        System.out.println("Estou correndo");
    }


}
