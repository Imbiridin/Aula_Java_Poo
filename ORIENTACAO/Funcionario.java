package ORIENTACAO;

public class Funcionario {

    private int registro;
    private String nome;
    private int cargo;
    private double salarioBase = 2000;
    private double salario = salarioBase;

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
            this.salario = salarioBase + (salarioBase * 0.20);
        } else if (valor == 2) {
            salario = salarioBase + (salarioBase * 0.4);
        } else if (valor == 3) {
            this.salario = salarioBase + (salarioBase * 0.6);
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
        return "=".repeat(50)+"\nSr.(a): " + nome + ".\nNúmero de registro: "+ registro +".\nSeu salário é R$" + salario + "\n"+"=".repeat(50);
    }

}
