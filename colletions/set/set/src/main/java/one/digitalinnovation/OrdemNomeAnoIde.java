package one.digitalinnovation;

import java.util.Comparator;

public class OrdemNomeAnoIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareTo(l2.getNome());
        if(nome != 0 )return nome;

        int ano = l1.getAno().compareTo(l2.getAno());
        if (ano != 0) return ano;

        return l1.getIde().compareTo(l2.getIde());
    }
}
