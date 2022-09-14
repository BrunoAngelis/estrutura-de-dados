package dio.digitalinnovation;

public class No<T> {
    private T conteudo;
    private No<T> noProximo;

    public No(T conteudo){
        this.noProximo = null;
        this.conteudo = conteudo;
    }

    public void setConteudo(T conteudo){
        this.conteudo = conteudo;
    }

    public void setNoProximo(No<T> noProximo) {
        this.noProximo = noProximo;
    }

    public T getConteudo(){
        return conteudo;
    }

    public No<T> getNoProximo() {
        return noProximo;
    }


    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                ", noProximo=" + noProximo +
                '}';
    }
}
