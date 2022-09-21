package dio.digitalinnovation;

import java.util.Comparator;
import java.util.Map;

public class OrdemNomeLivro implements Comparator <Map.Entry<String,Dicionario>> {


    @Override
    public int compare(Map.Entry<String, Dicionario> l1, Map.Entry<String, Dicionario> l2) {
        return l1.getValue().getNome().compareTo(l2.getValue().getNome());
    }
}
