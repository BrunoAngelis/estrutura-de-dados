package one.digitalinovation;

public class No <T>{

    private T objeto;
    private No<T>referenciaNo;

    public No(){

    }

    public No (T objeto){
        this.referenciaNo = null;
        this.objeto = objeto;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {

        this.objeto = objeto;
    }

    public No getReferenciaNo() {
        return referenciaNo;
    }

    public void setReferenciaNo(No referenciaNo) {
        this.referenciaNo = referenciaNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "objeto=" + objeto +
                '}';
    }
}
