package CALCULADORA;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Operadores op = new Operadores();

        boolean continuar = true;
        while (continuar) {
            String opcaoT = JOptionPane.showInputDialog("=".repeat(50)
                    + "\nCALCULADORA\n"
                    + "=".repeat(60)
                    + "\nDigite:\n [1] SOMAR | [2] SUBTRAIR | [3] MULTIPLICAR | [4] DIVIDIR | [0] SAIR \n"
                    + "=".repeat(60));
            int opcao = Integer.parseInt(opcaoT);

            if (opcao == 0) {
                JOptionPane.showMessageDialog(null, "Obrigado por utilizar o meu programa!");
                continuar = false;
                break;
            } else if (opcao >= 5) {
                JOptionPane.showMessageDialog(null, "Opcção inválida. Tente novamente!");
                continue;
            }


            String num_1T = JOptionPane.showInputDialog("Digite o primeiro número: ");
            op.setNum1(Integer.parseInt(num_1T));

            String num_2T = JOptionPane.showInputDialog("Digite o segundo número: ");
            op.setNum2(Integer.parseInt(num_2T));

            switch (opcao) {
                case 1:
                    JOptionPane.showMessageDialog(null, "A Soma é: \n" + op.getNum1() + " + " + op.getNum2() + " = " + op.getSoma());
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "A Subtração é: \n" + op.getNum1() + " - " + op.getNum2() + " = " + op.getSubtracao());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "A Multiplicação é: \n" + op.getNum1() + " * " + op.getNum2() + " = " + op.getMultiplicacao());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "A Divisão é: \n" + op.getNum1() + " / " + op.getNum2() + " = " + op.getDivisao());
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");

            }
        }
    }
}
