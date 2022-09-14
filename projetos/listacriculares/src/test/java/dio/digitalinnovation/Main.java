package dio.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        ListaCircular <String> minhaLista = new ListaCircular<>();

        minhaLista.add("C1");
        minhaLista.add("C2");
        minhaLista.add("C3");
        minhaLista.add("C4");
        minhaLista.add("C5");
        minhaLista.add("C6");
        minhaLista.add("C7");

        System.out.println(minhaLista);

        minhaLista.remove(0);

        System.out.println(minhaLista);
    }
}
