package CALCULADORA;

import javax.swing.JOptionPane;

public class Operadores {
    private int num_1;
    private int num_2;
    private int soma;
    private int subtracao;
    private int multiplicacao;
    private double divisao;


    public int getNum1(){
        return num_1;
    }

    public int getNum2(){
        return num_2;
    }

    public int getSoma(){
        return soma = num_1 + num_2;
    }
    public int getSubtracao(){
        return subtracao = num_1 - num_2;
    }
    public int getMultiplicacao(){
        return multiplicacao = num_1 * num_2;
    }
    public double getDivisao(){
        if (num_2 == 0){
            JOptionPane.showMessageDialog(null, "Número não é disivo por 0!");
            return 0;
        }
        return divisao = (double)num_1 / num_2;
    }

    public void setSoma(int soma){
        this.soma = soma;
    }

    public void setSubtracao(int subtracao){
        this.subtracao = subtracao;
    }

    public void setMultiplicacao(int multiplicacao){
        this.multiplicacao = multiplicacao;
    }

    public void setDivisao(double divisao){
        this.divisao = divisao;
    }

    public void setNum1(int num_1){
        this.num_1 = num_1;
    }

    public void setNum2(int num_2){
        this.num_2 = num_2;
    }


}
