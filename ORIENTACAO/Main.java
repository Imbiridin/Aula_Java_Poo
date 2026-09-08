package ORIENTACAO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario fc = new Funcionario();

        System.out.println("Informe o número do seu registro");
        fc.setRegistro(sc.nextInt());

        System.out.println("Digite o seu nome: ");
        fc.setNome(sc.nextLine());
        sc.nextLine();

        boolean continua = true;

        while(continua){
            System.out.println("Olá sr(a): " + fc.nome + "Digite [1] Número do seu cargo | [2] para verificar salário | [0] sair");
            int opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Informe o número do seu cargo (1, 2 ou 3): ");
                    int cargo = sc.nextInt();
                    fc.setCargo(cargo);
                    fc.setSalario(cargo);
                    System.out.println("Atualização feita com sucesso!");
                    break;
                case 2:
                    System.out.println(fc);
                    break;
                case 0:
                    System.out.println("Até mais!");
                    continua = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }
    }
}
