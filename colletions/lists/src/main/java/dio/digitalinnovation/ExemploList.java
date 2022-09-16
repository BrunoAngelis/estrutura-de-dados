package dio.digitalinnovation;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas:");
        List<Double> notas = new ArrayList<>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("\nExiba a posicao da nota 5.0: " + notas.indexOf(5d));

        notas.add(4, 8d);
        System.out.println(notas.toString());

        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas.toString());

        System.out.println("\nConfira se a nota 5.0 esta na lista: " + notas.contains(5d));

        System.out.println("\nExiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("\nExiba a menor nota: " + Collections.min(notas));
        System.out.println(notas.toString());

        System.out.println("\n Exiba a maior nota: " + Collections.max(notas));
        System.out.println(notas.toString());


        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("\nExiba a soma dos valores: " + soma);

        System.out.println("\n Exiba a media das notas: " + soma / notas.size());

        System.out.println("\nRemova a nota 0.00:");
        notas.remove(0d);
        System.out.println(notas.toString());

        System.out.println("\nRemova a nota na posicao 0");
        notas.remove(0);
        System.out.println(notas.toString());


        System.out.println("\n Remova as notas que forem menor que 7:");
        Iterator<Double> iterator1 = notas.iterator();

        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();

        }
        System.out.println(notas.toString());

        System.out.println("\nApague toda a lista");
        notas.clear();
        System.out.println(notas.toString());


        System.out.println("\nConfira se a minha lista esta vazia: "+ notas.isEmpty());

        LinkedList<Double> notas2 = new LinkedList<>();

        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);

        System.out.println("\nLista 2");
        System.out.println(notas2);

        System.out.println("\nMostre a primeira nota da nova lista sem remove-la: "+notas2.getFirst());

        System.out.println("\nMostre a primeira nota da nova lista removendo-a: "+ notas2.pollFirst());
        System.out.println(notas2);



    }
}