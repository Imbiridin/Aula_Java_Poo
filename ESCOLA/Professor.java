package ESCOLA;
public class Professor {
    private String nome;
    private long matricula;


    public String getNome(){
        return nome;
    }

    public void setNomeP(String nome){
        this.nome = nome;
    }

    public long getMatricula(){
        return matricula;
    }

    public void setMatriculaP(Long matricula){
        this.matricula = matricula;
    }

    public String toString(){
        return nome + " e sua matrícula é " + matricula;
    }

}
