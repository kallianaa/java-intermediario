package curso.java.carro;

import curso.java.pintura.Pintavel;

public class Carro implements Pintavel {

    String modelo;
    String cor;
    int ano;
    String placa;

    public Carro(String modelo, String cor, int ano, String placa) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.placa = placa;
    }

    public void ligar(){
        System.out.println("Ligando o carro");
    }

    public void desligar(){
        System.out.println("Desligando o carro");
    }

    public void acelerar(){
        System.out.println("Acelerando o carro");
    }

    public void frear(){
        System.out.println("Freando o carro");
    }

}
