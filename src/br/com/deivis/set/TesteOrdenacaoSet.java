package br.com.deivis.set;

import java.util.*;

public class TesteOrdenacaoSet {

    public static void main(String[] args) {

        // Ordem Aleatória

        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("The big bang","Comédia", 25));
            add(new Serie("Modern Family","Comédia", 25));
            add(new Serie("Dexter","Suspense", 60));
        }};

        System.out.println(minhasSeries);


        // Ordem Inserção

        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("The big bang","Comédia", 25));
            add(new Serie("Modern Family","Comédia", 25));
            add(new Serie("Dexter","Suspense", 60));
        }};

        System.out.println(minhasSeries1);


        // ordem natural - tempo de episodio
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries){{
            add(new Serie("The big bang","Comédia", 25));
            add(new Serie("Modern Family","Comédia", 25));
            add(new Serie("Dexter","Suspense", 60));
        }};

        System.out.println(minhasSeries2);


    }




}
