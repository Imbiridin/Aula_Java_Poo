package LIVRARIA;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();

        String codigo = JOptionPane.showInputDialog("Informe o codigo do livro: ");
        livro.setCodigo(Integer.parseInt(codigo));

        String titulo = JOptionPane.showInputDialog("Informe o título do livro: ");
        livro.setTitulo(titulo);

        String quantidade = JOptionPane.showInputDialog("Informe quantos livros tem em estoque: ");
        livro.setQntEst(Integer.parseInt(quantidade));

        String estoque = JOptionPane.showInputDialog("Informe quantos livros vão ser vendidos: ");
        livro.estoque(Integer.parseInt(estoque));

        String preco = JOptionPane.showInputDialog("Informe o valor do livro: ");
        livro.setPreco(Double.parseDouble(preco));

        livro.aplicarDesconto();

        JOptionPane.showMessageDialog(null, livro);
        
    }
}
