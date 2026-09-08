package BANCO;

public class Conta{
    public int agencia;
    public int numero;
    private double saldo = 0;

    public void depositar(double valor){
        saldo += valor;
    }

    public void saque(double valor){
        if(valor >= valor){
            saldo -= valor;
            System.out.println("Saque efetivado");
        } else {
            System.out.println("Saque sem fundos");
        }
    }

    public int getAgencia(int agencia){
        return agencia;
    }

    public int getNumero(int numero){
        return numero;
    }

    public String toString(){
        return "Seu saldo é R$" + saldo;
    }
}