package JANELA;


public class Janela {
    private String marca;
    private String material;
    private double preco;

    public String getMarca(){
        return marca;
    }
    public String getMaterial(){
        return material;
    }
    public double getPreco(){
        return preco;
    }


    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setMaterial(String material){
        this.material = material;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }


    public String toString(){
        return "A marca: " + marca + ".\n O material: " + material + ".\n Valor a pagar: R$" + String.format("%.2f", preco); 
    }
}
