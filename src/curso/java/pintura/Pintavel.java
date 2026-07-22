package curso.java.pintura;

public interface Pintavel {
   String apliarTinta();
    void aplicarTinta(String tinta);


    String getCor();
    void setCor(String cor);

    String getTipo();
    void setTipo(String tipo);

    String getMarca();
    void setMarca(String marca);

    String getPreco();
    void setPreco(String preco);
}
