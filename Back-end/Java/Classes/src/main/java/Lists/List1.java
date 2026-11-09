package main.java.Lists;

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
        list.add(2, "Murray");

        //Tamanho da lista
        System.out.println(list.size());

        //Descobrir index - retorna -1 se não encontrar
        list.indexOf("Maria");
        list.indexOf("Marcos");

        //Percorrer lista
        for(String name: list){
            System.out.println(name);
        }

        //Remover elementos
        list.remove(0);
        list.remove("Maria");

        //Remoção por predicado: função lambda
        list.removeIf(x -> x.charAt(0) == 'B');


        //Percorrer lista
        for(String name: list){
            System.out.println(name);
        }

        //Filtrar items da Lista
        List<String> result = list

        

    }
}
