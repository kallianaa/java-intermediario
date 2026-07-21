package curso.java.carro;

public class Carro {

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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }



}
