package main.java.lists;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    static void main(String[] args) {

        //Lista "otimizada" - propriedades de Array e de List
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("João");
        list.add("Bob");
        list.add("Smith");
        list.add("Clark");
        list.add("Mike");
        list.add(6, "Murray");
        list.add("Mistral");
        list.add("Mick");

        //Tamanho da lista
        System.out.println("Tamanho da lista: "+list.size());


        System.out.println("----------------------------------------");
        //Descobrir index - retorna -1 se não encontrar
        System.out.println("Index de Maria: "+list.indexOf("Maria"));
        System.out.println("Index de Marcos: "+list.indexOf("Marcos"));


        System.out.println("----------------------------------------");
        //Percorrer lista
        for(String name: list){
            System.out.println(name);
        }

        //Remover elementos
        list.remove(0);
        list.remove("Maria");

        //Remoção por predicado: função lambda
        list.removeIf(x -> x.charAt(0) == 'B');


        System.out.println("----------------------------------------");
        //Percorrer lista
        for(String name: list){
            System.out.println(name);
        }

        System.out.println("----------------------------------------");
        //Filtrar items da Lista
        List<String> result = list.stream().filter(x -> x.charAt(0)=='M').toList();
        for(String x : result){
            System.out.println(x);
        }

        System.out.println("----------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0)=='M').findFirst().orElse(null);
        System.out.println(name);


        

    }
}
