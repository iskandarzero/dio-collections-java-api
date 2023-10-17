import java.util.Comparator;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private Long matricula;
    private Double media;

    public Aluno(String nome, Long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getMatricula() {
        return this.matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public Double getMedia() {
        return this.media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", matricula='" + getMatricula() + "'" +
            ", media='" + getMedia() + "'" +
            "}";
    }
}

class ComparatorPorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno n1, Aluno n2) {
        return Double.compare(n1.getMedia(), n2.getMedia());
    }   
}