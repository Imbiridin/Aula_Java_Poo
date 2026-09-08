package ORIENTACAO;

public class Funcionario {

    public int registro;
    public String nome;
    private int cargo;
    private double salario = 2000;

    public int getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo){
        this.cargo = cargo;
    }

    public void setSalario(double valor) {
        if (valor == 1) {
            this.salario = salario + (salario * 0.20);
        } else if (valor == 2) {
            salario = salario + (salario * 0.4);
        } else if (valor == 3) {
            this.salario = salario + (salario * 0.6);
        } else {
            System.out.println("Não tem bonificação");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public double getSalario() {
        return salario;
    }

    public String toString() {
        return "Seu salário é R$" + salario;
    }

}
