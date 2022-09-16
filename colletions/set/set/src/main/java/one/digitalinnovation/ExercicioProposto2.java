package one.digitalinnovation;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioProposto2 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> listaLinguagens = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java",1995,"intellij"));
            add(new LinguagemFavorita("C#",2000,"eclipse"));
            add(new LinguagemFavorita("phyton",1991,"netbeans"));
        }};

        System.out.println("\n\t-----Ordem de Insercao (nome)-----\t");
       for(LinguagemFavorita linguagem : listaLinguagens){
           System.out.println(linguagem);
       }

        System.out.println("\n\t-----Ordem de Natural -----\t");
       Set<LinguagemFavorita> listaLinguagens1 = new TreeSet<>(listaLinguagens);
        for(LinguagemFavorita linguagem : listaLinguagens1){
            System.out.println(linguagem);
        }

        System.out.println("\n\t-----Ordem de IDE -----\t");
        Set<LinguagemFavorita> listaLinguagens2 = new TreeSet<>(new OrdemIde());
        listaLinguagens2.addAll(listaLinguagens);
        for(LinguagemFavorita linguagem : listaLinguagens2){
            System.out.println(linguagem);
        }

        System.out.println("\n\t-----Ordem de ANO E NOME-----\t");
        Set<LinguagemFavorita> listaLinguagens3 = new TreeSet<>(new OrdemAnoNome());
        listaLinguagens3.addAll(listaLinguagens);
        for(LinguagemFavorita linguaguem : listaLinguagens3){
            System.out.println(linguaguem);
        }

        System.out.println("\n\t-----Ordem de NOME, ANO E MODELO-----\t");
        Set<LinguagemFavorita> listaLinguagem4 = new TreeSet<>(new OrdemNomeAnoIde());
        listaLinguagem4.addAll(listaLinguagens);
        for(LinguagemFavorita linguagem : listaLinguagem4){
            System.out.println(linguagem);
        }
    }
}
