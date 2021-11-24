package br.com.deivis.list;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lista {

    public static void main(String[] args) {


        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(7.1);
        notas.add(8.0);
        notas.add(9.0);
        notas.add(4.0);
        notas.add(2.0);
        notas.add(1.0);

        //imprimir todos
        System.out.println(notas);

        // Posição do elemento
        System.out.println(notas.indexOf(4.0));

        // Adicionar + um elemento
        notas.add(0,6.5);
        System.out.println(notas);


        // Substituir  um elemento
        notas.set(0,2.2);
        System.out.println(notas);

        // Verifica se um elemento pertence a lista

        System.out.println("nota 8.9 "+ notas.contains(8.9));


        // Exibir a terceira nota adicionada

        System.out.println("Terceira nota"+ notas.get(2));


        // Mostrar menor nota

        System.out.println("Menor nota "+Collections.min(notas));

        // Maior nota

        System.out.println("Maior nota "+ Collections.max(notas));


        //Somar

        //Iterator<Double> iterator =  notas.iterator();
        //Double soma = 0.0;
        //while (iterator.hasNext()){
          //  soma += iterator.next();
        //}

        //System.out.println("Soma: "+soma );

        // Média


        //System.out.println("Média: "+soma/notas.size() );


        // remover da posição i

        System.out.println("removeu "+ notas.remove(1));

        System.out.println(notas);

// remover notas menores que 7


        Iterator<Double> iterator =  notas.iterator();
        while (iterator.hasNext()){
            Double  x = iterator.next();
            if (x < 7){
                iterator.remove();
            }
        }

        System.out.println("notas que sobraram "+ notas);


        List<Gato> meusGatos = new ArrayList<>(){{
           add(new Gato("Jon",18,"verde"));
           add(new Gato("Marcio",8,"laranja"));
           add(new Gato("Lia",2,"amarelo"));
            add(new Gato("Aline",2,"amarelo"));
        }};

        System.out.println(meusGatos);

        //bagunçando a parada
        Collections.shuffle(meusGatos);

        System.out.println(meusGatos);

        Collections.sort(meusGatos);


        System.out.println(meusGatos);
        Collections.sort(meusGatos, new ComparatorIdade());

        System.out.println(meusGatos);






    }

}
