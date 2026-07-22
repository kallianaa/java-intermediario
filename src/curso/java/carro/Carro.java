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

    @Override
    public String apliarTinta() {
        return "";
    }

    @Override
    public void aplicarTinta(String tinta) {

    }

    @Override
    public String getCor() {
        return "";
    }

    @Override
    public void setCor(String cor) {

    }

    @Override
    public String getTipo() {
        return "";
    }

    @Override
    public void setTipo(String tipo) {

    }

    @Override
    public String getMarca() {
        return "";
    }

    @Override
    public void setMarca(String marca) {

    }

    @Override
    public String getPreco() {
        return "";
    }

    @Override
    public void setPreco(String preco) {

    }
}
