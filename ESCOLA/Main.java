package ESCOLA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno.setNomeA(sc.nextLine());

        System.out.println("Informe o número da matricula: ");
        aluno.setMatriculaA(sc.nextLong());
        sc.nextLine();

        System.out.println("=".repeat(50));
        Professor prof = new Professor();

        System.out.println("Digite o nome do professor: ");
        prof.setNomeP(sc.nextLine());

        System.out.println("Informe o número da matrícula: ");
        prof.setMatriculaP(sc.nextLong());

        System.out.println(aluno);
        System.out.println(prof);
    }
    
}
