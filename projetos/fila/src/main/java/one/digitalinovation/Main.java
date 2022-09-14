package one.digitalinovation;

public class Main {
    public static void main(String [] args){
        Fila <String> minhaFila = new Fila<>();

        minhaFila.enqueue("Bruno");
        minhaFila.enqueue("Juliana");
        minhaFila.enqueue("Miguel");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);


    }
}
