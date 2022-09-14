package one.digitalinnovation;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("GM"));
        listCarros.add(new Carro("VW"));

        System.out.println(listCarros.contains(new Carro("GM")));

        System.out.println(listCarros.get(2));

        System.out.println(listCarros.indexOf(new Carro("VW")));

        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);
    }
}
