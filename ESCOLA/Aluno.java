package ESCOLA;

public class Aluno{
    private String nome;
    private Long matricula;

    public void setNomeA(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setMatriculaA(Long matricula){
        this.matricula = matricula;
    }

    public long getMatricula(){
        return matricula;
    }

    public String toString(){
        return "O "
        + nome
        +" e sua matrícula é "
        + matricula;
    }
}