package one.digitalinovation;

public class Fila<T>{

    private No<T> referenciaEntradaFila;

    public Fila (){
        this.referenciaEntradaFila = null;
    }

    public T dequeue(){
        if(!isEmpty()){
            No primeiroNo = referenciaEntradaFila;
            No auxiliar = referenciaEntradaFila;
            while(true){
                if (primeiroNo.getReferenciaNo() != null){
                    auxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getReferenciaNo();
                }else{
                    auxiliar.setReferenciaNo(null);
                    break;
                }
            }
            return(T) primeiroNo.getObjeto();
        }
        return null;
    }

    public T first(){
        if(!isEmpty()){
            No primeiroNo = referenciaEntradaFila;
            while(true){
                if (primeiroNo.getReferenciaNo() != null){
                    primeiroNo = primeiroNo.getReferenciaNo();
                }else {
                    break;
                }
            }
            return (T) primeiroNo.getObjeto();
        }
        return null;
    }

    public void  enqueue(T obj){
        No novoNo = new No(obj);
        novoNo.setReferenciaNo(referenciaEntradaFila);
        referenciaEntradaFila = novoNo;
    }

    public boolean isEmpty(){
        if (referenciaEntradaFila == null){
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        String imprime = "";
        No auxiliar = referenciaEntradaFila;
        if (auxiliar != null){
            while(true) {
                imprime += "[Dado{" + auxiliar.getObjeto() + "}]------>";
                if(auxiliar.getReferenciaNo()!=null){
                    auxiliar = auxiliar.getReferenciaNo();
                }else{
                    break;
                }
            }
        }else {
            imprime+="NULL";
        }
        return imprime;
    }
}
