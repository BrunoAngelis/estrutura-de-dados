package one.digitalinnovation;


import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    String nome;
    Integer ano;
    String ide;

    public LinguagemFavorita(String nome, Integer ano, String ide){
        this.nome = nome;
        this.ano = ano;
        this.ide = ide;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Integer getAno(){
        return this.ano;
    }

    public void setAno(Integer ano){
        this.ano = ano;
    }

    public String getIde(){
        return this.ide;
    }

    public void setIde(String ide){
        this.ide = ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return Objects.equals(nome, that.nome) && Objects.equals(ano, that.ano) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ano, ide);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita o) {

        return this.nome.compareTo(o.getNome());
    }
}
