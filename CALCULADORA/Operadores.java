package CALCULADORA;

import javax.swing.JOptionPane;

public class Operadores {
    private int num_1;
    private int num_2;


    public int getNum1(){
        return num_1;
    }

    public int getNum2(){
        return num_2;
    }

    public int getSoma(){
        return num_1 + num_2;
    }
    public int getSubtracao(){
        return num_1 - num_2;
    }
    public int getMultiplicacao(){
        return num_1 * num_2;
    }
    public double getDivisao(){
        if (num_2 == 0){
            JOptionPane.showMessageDialog(null, "Número não é disível por 0!");
            return 0;
        }
        return (double)num_1 / num_2;
    }

    public void setNum1(int num_1){
        this.num_1 = num_1;
    }

    public void setNum2(int num_2){
        this.num_2 = num_2;
    }


}
