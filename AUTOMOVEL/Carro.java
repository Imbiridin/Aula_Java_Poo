package AUTOMOVEL;

public class Carro {
    private String modelo;
    private String fabricante;
    private int ano;
    private int velocidade;

    public void acelerar(){
        velocidade += 10;
    }

    public void freiar(){
        velocidade -= 10;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getFabricante(){
        return fabricante;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String toString(){
        return modelo + " " + fabricante + " " + ano + " " + velocidade;
    }
}
