package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Volkswagen"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Audi"));

        System.out.println(listaCarros.contains(new Carro("Audi")));
        System.out.println(new Carro("Chevrolet").hashCode());
        System.out.println(new Carro("Volkswagen").hashCode());

        Carro carro1 = new Carro("Volkswagen");
        Carro carro2 = new Carro("Audi");

        System.out.println(carro1.equals(carro2));

    }
}
