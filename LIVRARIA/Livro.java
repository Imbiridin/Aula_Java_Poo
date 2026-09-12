package LIVRARIA;

import javax.swing.JOptionPane;

public class Livro {
    private int codigo;
    private String titulo;
    private double preco;
    private int qntEst;
    private double valorDesconto;
    private double novoValor;
    private boolean vender;

    public int getCodigo(){
        return codigo;
    }

    public String getTitulo(){
        return titulo;
    }

    public double getPreco(){
        return preco;
    }

    public int getQntEst(){
        return qntEst;
    }

    public double valorDesconto(){
        return valorDesconto;
    }

    public double novoValor(){
        return novoValor;
    }

    public boolean isVender(){
        return vender;
    }


    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setQntEst(int qntEst){
        this.qntEst = qntEst;
    }

    public double valorTotal(){
        return preco * qntEst;
    }

    public void aplicarDesconto(){
        this.valorDesconto = valorTotal() * 0.15;
        this.novoValor = valorTotal() - valorDesconto;
    }

    public void estoque(int quantidade){
        if(qntEst >= quantidade){
            this.vender = true;
            qntEst = qntEst - quantidade;
        }else{
            this.vender = false;
            JOptionPane.showMessageDialog(null, "Não tem mais livro no estoque");
        }
    }

    public String toString(){
        return "O código: " 
        + codigo 
        + ".\nTitulo: " 
        + titulo 
        + "\nQuantidade: "
        + qntEst
        + "\nDisponível para venda: "
        + vender
        + ".\nValor unitário: R$"
        + String.format("%.2f", preco)
        + ".\nValor total: R$"
        +String.format("%.2f", valorTotal()) 
        + ".\nDesconto aplicado: R$" 
        + String.format("%.2f", valorDesconto) 
        + ".\nNovo valor: R$" + String.format("%.2f", novoValor); 
    }
}
