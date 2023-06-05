package br.com.capgemini.model;


import java.util.Calendar;

public class Pessoa {
    private String nome;
    private int data;
    private double altura;

    public Pessoa(String nome, int data, double altura) {
        this.nome = nome;
        this.data = data;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void mostraDados(){
        System.out.println("Nome: " +this.nome);
        System.out.println("data de nascimento: " +this.data);
        System.out.println("Altura: " +this.altura);
        System.out.println("Idade: "+calcularIdade() );
    }
    public int calcularIdade(){
        Calendar ano = Calendar.getInstance();
        return ano.get(Calendar.YEAR)-getData();
    }
}
