package one.digitalinnovation;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Carro> queueCarro = new LinkedList<>();

        queueCarro.add(new Carro("Ford"));
        queueCarro.add(new Carro("BMW"));
        queueCarro.add(new Carro("AUDI"));

        System.out.println(queueCarro.add(new Carro("Land-Rover")));
        System.out.println(queueCarro);

        System.out.println(queueCarro.offer(new Carro("Renault")));
        System.out.println(queueCarro);

        System.out.println(queueCarro.peek());
        System.out.println(queueCarro);

        System.out.println(queueCarro.poll());
        System.out.println(queueCarro);


        System.out.println(queueCarro.isEmpty());
        System.out.println(queueCarro.size());


    }
}
