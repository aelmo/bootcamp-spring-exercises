package br.com.meli.exercises.model;

public class Diploma {
    private String nomeAluno;
    private Double mediaAluno;
    private String mensagem;
    
    public Diploma(Aluno aluno) {
        this.nomeAluno  = aluno.getNome();
        this.mediaAluno = aluno.calculaMedia();
        if(mediaAluno >= 9) {
            this.mensagem = "Parabens!!";
        }
    }

    public String getNomeAluno() {
        return this.nomeAluno;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    public Double getMedia() {
        return this.mediaAluno;
    }
}
