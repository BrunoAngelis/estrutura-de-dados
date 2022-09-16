package one.digitalinnovation;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("\n\t------Ordem Aleatoria:------\t ");
        Set<Serie> minhasSeries = new HashSet<>();

        minhasSeries.add(new Serie("Got","fantasia",60));
        minhasSeries.add(new Serie("Dark","drama",60));
        minhasSeries.add(new Serie("That","comedia",25));

        for(Serie serie : minhasSeries){
            System.out.println(serie.getNome() + " - " +serie.getGenero()+ " - " +serie.getTempoEpisodio());
        }

        System.out.println("\n\t------Ordem de Insercao:------\t");
        Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{
            add(new Serie("Got","fantasia",60));
            add(new Serie("Dark","drama",60));
            add(new Serie("That","comedia",25));
        }};
        for(Serie serie : minhasSeries2){
            System.out.println(serie.getNome() + " - " + serie.getGenero()+" - " +serie.getTempoEpisodio());
        }

        System.out.println("\n\t------Ordem Natural:------\t");
        Set<Serie> minhasSeries3 = new TreeSet<>(){{
            add(new Serie("Got","fantasia",60));
            add(new Serie("Dark","drama",60));
            add(new Serie("That","comedia",25));
        }};
        for(Serie serie : minhasSeries3){
            System.out.println(serie.getNome() + " - " + serie.getGenero()+" - " +serie.getTempoEpisodio());
        }


        System.out.println("\n\t------Ordem Nome/Genero/TempoEpisodio:------\t");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempo());
        minhasSeries4.addAll(minhasSeries3);
        for(Serie serie : minhasSeries4){
            System.out.println(serie.getNome() + " - " + serie.getGenero()+" - " +serie.getTempoEpisodio());
        }

    }
}

