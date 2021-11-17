package br.com.deivis.list;

import java.util.ArrayList;
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





    }

}
