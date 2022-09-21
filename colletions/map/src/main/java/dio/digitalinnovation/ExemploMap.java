package dio.digitalinnovation;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol",14.1);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};

        System.out.println(carrosPopulares.toString());

        System.out.println("---Substitua o consumo do gol por 12,5 km/l: ");
        carrosPopulares.put("gol",15.2);
        System.out.println(carrosPopulares.toString());

        System.out.println("--- Confira se o modelo tucson esta no dicionario : " +carrosPopulares.containsKey("tucson"));
        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno")+" km/l");

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("--- Exiba o modelo mais economico e seu consumo ---");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for(Map.Entry<String, Double> entry : entries){
            if(entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println(modeloMaisEficiente+" - "+consumoMaisEficiente);
            }
        }

        System.out.println("---Exiba o modelo menos econominco e seu consumo---");
        Double consumoMenosEconomino = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();
        String modeloMenosEconomino = "";

        for(Map.Entry<String, Double> entry : entries1){
            if(entry.getValue().equals(consumoMenosEconomino)){
                modeloMenosEconomino = entry.getKey();
                System.out.println(modeloMenosEconomino + " - " +consumoMenosEconomino);
            }
        }


        Iterator<Double> iterator  = carrosPopulares.values().iterator();
        Double somaConsumos = 0d;

        while (iterator.hasNext()){
            somaConsumos+= iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: "+ somaConsumos);

        System.out.println("Exiba a media dos consumos deste dicionario de carros: " + (somaConsumos / carrosPopulares.size()));

        System.out.println("Remova os modelos com o consumo igual a 15,6 km /l");

        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)){
                iterator1.remove();
            }
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem Informada: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol",14.1);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("Exiba o dicionaroi ordenado pelo modelo: ");
        Map<String,Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();
        System.out.println("O dicionario esta vazio? : "+carrosPopulares.isEmpty());



    }

}
