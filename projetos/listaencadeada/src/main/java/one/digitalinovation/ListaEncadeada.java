package one.digitalinovation;

public class ListaEncadeada <T>{
    No <T> refEntradaLista;

    public ListaEncadeada() {
        this.refEntradaLista = null;
    }

    public void add(T conteudo){
        No <T> novoNo = new No<>(conteudo);

        if(this.isEmpty()){
            refEntradaLista = novoNo;
            return;
        }

        No <T> noAxuliar = refEntradaLista;

        for (int i = 0 ; i < size()-1; i++){
            noAxuliar = noAxuliar.getProximoNo();
        }
        noAxuliar.setProximoNo(novoNo);
    }

    private No<T> getNo(int index){
            validaIndice(index);
            No<T> noAuxiliar = refEntradaLista;
            No<T> noRetorno = null;

            for (int i = 0 ; i <= index; i++){
                noRetorno = noAuxiliar;
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            return noRetorno;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    public T remove(int index){
        No<T> noPivor = this.getNo(index);
        if (index == 0){
            refEntradaLista = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }

        No <T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    public int size(){
        int tamanhoLista = 0;
        No auxiliar = refEntradaLista;
        while(true)
            if(auxiliar != null){
                tamanhoLista++;
                if(auxiliar.getProximoNo()!=null) {
                    auxiliar = auxiliar.getProximoNo();

                }else {
                    break;
                }
            }else{
                break;
            }
        return tamanhoLista;
    }

    public void validaIndice(int index){
        if (index >= size()){
            int ultimoIndice = size()-1;
            throw new IndexOutOfBoundsException("Não existe conteudo no indice "+ index+" desta lista. Esta lista so vai até o indice: "+ultimoIndice);
        }

    }

    public boolean isEmpty(){
        return refEntradaLista == null ? true : false;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        No<T> auxiliar = refEntradaLista;

        for(int i = 0; i < this.size();i++){
            strRetorno+= "[Conteudo{"+auxiliar.getConteudo()+"]}--->";
            auxiliar = auxiliar.getProximoNo();
        }
        strRetorno +="null";
        return strRetorno;
    }
}
