package dio.digitalinnovation;

import java.util.*;

public class Project {
    public static void main(String[] args) {
        Map<String,Double> dicionario = new HashMap<>(){{
            put("PE", 9.616621);
            put("AL", 3.351543);
            put("CE", 9.187103);
            put("RN", 3.534265);
        }};

        System.out.println("\n\t---Imprimindo estados---\t");
        System.out.println(dicionario.toString());

        System.out.println("\n Substitua a populacao do estado do RN por 3.534.165---");
        dicionario.put("RN",3.534165);
        System.out.println(dicionario.toString());

        System.out.println("\nConfira se o estado PB esta no diconario, caso nao adicione: PB - 4.039277");
        if(!dicionario.containsKey("PB")){
            dicionario.put("PB", 4.039277);
            System.out.println(dicionario.toString());
        }

        System.out.println("\nExiba a populacao PE");
        System.out.println(dicionario.get("PE"));

        System.out.println("\n Exiba todos os estados e suas populacoes na ordem que foi informado");

        Map<String, Double> dicionario1 = new LinkedHashMap<>(){{
            put("PE", 9.616621);
            put("AL", 3.351543);
            put("CE", 9.187103);
            put("RN", 3.534265);
        }};

        System.out.println(dicionario1.toString());

        System.out.println("\nExiba todos os estados e suas populacoes em ordem alfabetica");
        Map<String, Double> dicionario2 = new TreeMap<>(){{
            putAll(dicionario1);
        }};

        System.out.println(dicionario2.toString());


         Set<Map.Entry<String, Double>> entrySet = dicionario2.entrySet();
         Double menorPopulacao = Collections.min(dicionario.values());
         String estadoMenorPopulacao = "1";

         for(Map.Entry<String, Double> entry : entrySet){
             if(entry.getValue().equals(menorPopulacao)){
                 estadoMenorPopulacao = entry.getKey();
             }
         }

        System.out.println("\nEstado com a menor populacao: "+ estadoMenorPopulacao +" - "+menorPopulacao);

         Double maiorPopulacao = Collections.max(dicionario2.values());
         String estadoMaiorPopulacao = "";

         for (Map.Entry<String,Double> entry : entrySet){
             if (entry.getValue().equals(maiorPopulacao)){
                 estadoMaiorPopulacao = entry.getKey();
             }
         }

        System.out.println("\nEstado com a maior populacao: "+ estadoMaiorPopulacao +" - "+maiorPopulacao);

       Iterator<Double> iterator = dicionario2.values().iterator();
       Double soma = 0d;
       while(iterator.hasNext()){
           soma += iterator.next();
       }

        System.out.println("\nExiba a soma da populacao desses estados: " + soma);
        System.out.println("\nExiba a media da populacao deste dicionario de estados: " + (soma/dicionario2.size()));

       Iterator<Double> iterator1 = dicionario2.values().iterator();
       while(iterator1.hasNext()){
           if (iterator1.next() < 4.000000d){
               iterator1.remove();
           }
       }

        System.out.println("\nRemova os estados com a populacao menor que 4.000.000 ");
        System.out.println(dicionario2);

        System.out.println("\nApague o dicionario de estados");
        dicionario.clear();

        System.out.println("Confira se o dicionario esta limpo: "+dicionario.isEmpty());
    }
}
