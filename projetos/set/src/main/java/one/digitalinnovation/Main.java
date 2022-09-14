package one.digitalinnovation;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

       Set<Carro> hashSetCarros = new HashSet<>();

       hashSetCarros.add(new Carro("GM"));
        hashSetCarros.add(new Carro("VW"));
        hashSetCarros.add(new Carro("BMW"));
        hashSetCarros.add(new Carro("Audi"));
        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Hyundai"));

      //  System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("GM"));
        treeSetCarros.add(new Carro("VW"));
        treeSetCarros.add(new Carro("BMW"));
        treeSetCarros.add(new Carro("Audi"));
        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Hyundai"));

        System.out.println(treeSetCarros);


    }
}
