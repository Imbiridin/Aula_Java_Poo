package BANCO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta c1 = new Conta();

        System.out.println("Digite o numero da conta: ");
        c1.getAgencia(sc.nextInt());

        System.out.println("Digite o numero da conta: ");
        c1.getNumero(sc.nextInt());

        System.out.println(c1);

        boolean continua = true;

        while (continua) {
            System.out.println("Aperte [1] DEPOSITAR | [2] SAQUE | [3] SALDO | [0] SAIR");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o quanto você gostaria de depositar: ");
                    c1.depositar(sc.nextDouble());
                    System.out.println(c1);
                    break;
                case 2:
                    System.out.println("Informe o quanto você gostaria de sacar: ");
                    c1.saque(sc.nextDouble());
                    System.out.println(c1);
                    break;
                case 3:
                    System.out.println(c1);
                    break;
                case 0:
                    continua = false;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
