package dio.digitalinnovation;

import java.util.Objects;

public class Dicionario {
    String nome;

    Integer paginas;

    public Dicionario(String nome,  Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dicionario that = (Dicionario) o;
        return nome.equals(that.nome) && paginas.equals(that.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "{" +
                "autor='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
