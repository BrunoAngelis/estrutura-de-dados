package dio.digitalinnovation;

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        Map<String, Dicionario> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Dicionario("Uma Breve Historia do Tempo",256));
            put("Duhigg, Charles", new Dicionario("O Poder do Habito",408));
            put("Hahari, Yuval Noah", new Dicionario("21 Licoes para o seculo 21",432));
        }};

        System.out.println("\n\t---Exibindo em Ordem Aleatoria---\t");
        Set<Map.Entry<String, Dicionario>> entries = meusLivros.entrySet();
        for(Map.Entry<String, Dicionario> entry : entries){
            System.out.println(entry.getKey()+" - "+entry.getValue().getNome());
        }

        System.out.println("\n\t---Exibindo em Ordem de Insercao---\t");
        Map<String , Dicionario> meusLivros2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Dicionario("Uma Breve Historia do Tempo",256));
            put("Duhigg, Charles", new Dicionario("O Poder do Habito",408));
            put("Hahari, Yuval Noah", new Dicionario("21 Licoes para o seculo 21",432));
        }};

        for(Map.Entry<String,Dicionario> entry : meusLivros2.entrySet()){
            System.out.println(entry.getKey() + " - "+entry.getValue().getNome());
        }

        System.out.println("\n\t---Exibindo em Ordem de Alfabetica Autores---\t");
        Map<String,Dicionario> meuslivros3 = new TreeMap<>(meusLivros2);
        for(Map.Entry<String,Dicionario> entry : meuslivros3.entrySet()){
            System.out.println(entry.getKey() + " - "+entry.getValue().getNome());
        }

        System.out.println("\n\t---Exibindo em Ordem de Alfabetica nomes Livros ---\t");
        Set<Map.Entry<String,Dicionario>> meusLivros4 = new TreeSet<>(new OrdemNomeLivro());
        meusLivros4.addAll(meusLivros.entrySet());
        for(Map.Entry<String,Dicionario> entry : meusLivros4){
            System.out.println(entry.getKey() + " - "+entry.getValue().getNome());
        }

    }
}
