package JANELA;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Janela jn = new Janela();

        String marca = JOptionPane.showInputDialog("Informe a marca da janela: ");
        jn.setMarca(marca);

        String material = JOptionPane.showInputDialog("Informe o material da janela: ");
        jn.setMaterial(material);

        String preco = JOptionPane.showInputDialog("Digite o valor da janela: ");
        jn.setPreco(Double.parseDouble(preco));

        JOptionPane.showMessageDialog(null, jn);
    }
}
