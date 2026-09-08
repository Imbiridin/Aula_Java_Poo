package AUTOMOVEL;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro c1 = new Carro();

        System.out.println("Digite o modelo do carro: ");
        c1.setModelo(sc.nextLine());

        System.out.println("Digite o nome da fabricante: ");
        c1.setFabricante(sc.nextLine());

        System.out.println("Informe o ano do carro: ");
        c1.setAno(sc.nextInt());

        boolean continua = true;

        while(continua){
            System.out.println("Digite [1] ACELERAR | [2] FREIAR | [0] SAIR");
            int opcao = sc.nextInt();

            switch(opcao){
                case 1: 
                    System.out.println("                             ___\r\n" + //
                                                "    _-_-  _/\\______\\\\__\r\n" + //
                                                " _-_-__  / ,-. -|-  ,-.`-.\r\n" + //
                                                "--- _-_- `( o )----( o )-'\r\n" + //
                                                "           `-'      `-'(Carro acelerando)");
                    c1.acelerar();
                    System.out.println(c1.getVelocidade());
                    break;
                    
                case 2:
                    System.out.println("           ______\r\n" + //
                                                " /|_||_\\`.__\r\n" + //
                                                "(   _    _ _\\\r\n" + //
                                                "=`-(_)--(_)-'    (carro freiando)");
                    c1.freiar();
                    System.out.println(c1.getVelocidade());
                    break;

                case 0:
                    continua = false;
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }

    }
}
