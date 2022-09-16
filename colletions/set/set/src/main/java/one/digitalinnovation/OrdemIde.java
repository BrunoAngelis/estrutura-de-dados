package one.digitalinnovation;

import java.util.Comparator;

public class OrdemIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIde().compareTo(l2.getIde());
    }
}
