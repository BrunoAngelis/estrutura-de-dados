package one.digitalinovation;

public class Pilha {
    private No referenciaEntradaPilha;

    public Pilha(){
        this.referenciaEntradaPilha = null ;
    }

    public No pop(){
        if (!isEmpty()){
            No poped = referenciaEntradaPilha;
            referenciaEntradaPilha = referenciaEntradaPilha.getReferenciaNo();
            return poped;
        }return null;

    }

    public void push(No novoNo){
        No referenciaAuxiliar = referenciaEntradaPilha;
        referenciaEntradaPilha = novoNo;
        referenciaEntradaPilha.setReferenciaNo(referenciaAuxiliar);
    }

    public No top(){
        return referenciaEntradaPilha;
    }

    public boolean isEmpty (){
        return referenciaEntradaPilha == null? true : false;
    }

    public String toString (){

        String retorno = "----------\n";
        retorno += "Pilha\n";
        retorno += "----------\n";

        No noAuxiliar = referenciaEntradaPilha;

        while (true){
            if(noAuxiliar != null){
                retorno += "[NO{dado ="+noAuxiliar.getDado()+"}]\n";
                noAuxiliar = noAuxiliar.getReferenciaNo();

        }else{
                break;
            }
        }
        retorno += "==========\n";
        return retorno;
    }

}
