package one.digitalinovation;

public class Main {

    public static void main(String[] args) {
        ListaEncadeada <String> lista = new ListaEncadeada<>();

        lista.add("Teste 1");
        lista.add("Teste 2");
        lista.add("Teste 3");
        lista.add("Teste 4");

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println(lista.get(3));

        System.out.println(lista);

        System.out.println(lista.remove(1));

        System.out.println(lista);



    }
}
