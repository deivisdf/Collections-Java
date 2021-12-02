package br.com.deivis.list;

import java.util.Comparator;

public class ComparatorNomeCorIdade  implements Comparator<Gato> {
    @Override
    public int compare(Gato o1, Gato o2) {

        // tentar fazer usando ternario
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if (nome !=0) return nome;

        // implementar o resto

        return 0;
    }
}
