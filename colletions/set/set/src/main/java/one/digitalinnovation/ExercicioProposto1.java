package one.digitalinnovation;

import java.lang.reflect.Array;
import java.util.*;

public class ExercicioProposto1 {

    public static void main(String[] args) {
        Set<String> coresArcoIris = new LinkedHashSet<>() {{
            add("vermelha");
            add("laranja");
            add("amarela");
            add("verde");
            add("azul");
            add("azul escuro");
            add("violeta");
        }};

        System.out.println("\n\t-----Cores do Arco-iris-----\t");
        for (String cores : coresArcoIris) {

            System.out.println(cores);

        }

        System.out.println("\nQuantidade de cores Arco-Iris --> " + coresArcoIris.size());

        System.out.println("\n\t---Cores Arco-Iris em ordem Alfabetica --- ");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        for (String cor : coresArcoIris2) {
            System.out.println(cor);
        }

        System.out.println("\n\t---Cores Arco-Iris em ordem Inversa --- ");
        List<String> lista = new ArrayList<>(coresArcoIris);
        Collections.reverse(lista);
        System.out.println(lista);


        System.out.println("\n\t---Exiba todas as cores que comecam com a letra V --- ");
        for(String cores : coresArcoIris){
            if(cores.startsWith("v")){
                System.out.println(cores);
            }
        }


        System.out.println("\n\t---Remove todas as cores que  nao comecam com a letra V --- ");
       Iterator<String> iterator = coresArcoIris.iterator();

        while(iterator.hasNext()){
            String cor = iterator.next();
            if (!cor.startsWith("v")){
                iterator.remove();
            }
        }
        System.out.println(coresArcoIris);

        System.out.println("\n\t---Limpe o conjunto --- ");
        coresArcoIris.clear();

        System.out.println(coresArcoIris);
    }
}
