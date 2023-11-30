package br.com.bec.screenmaker.principal;

import br.com.bec.screenmaker.modelos.Filme;
import br.com.bec.screenmaker.modelos.Serie;
import br.com.bec.screenmaker.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme f1 = new Filme("Titanic", 2000);
        f1.avalia(8);
        f1.avalia(9);
        Filme f2 = new Filme("Toy Story 3", 2010);
        f2.avalia(3);
        f2.avalia(8);
        var f3 = new Filme("Oppenheimer", 2023);
        f3.avalia(10);
        f3.avalia(9.5);
        Serie s1 = new Serie("Arcane", 2021);
        s1.avalia(10);

        ArrayList<Titulo> listaAssistidos = new ArrayList<>();
        listaAssistidos.add(f1);
        listaAssistidos.add(f2);
        listaAssistidos.add(f3);
        listaAssistidos.add(s1);

        for (Titulo item: listaAssistidos) {

            System.out.println(item);

            if (item instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao() + "\n");
            }
        }

        ArrayList<String> busca = new ArrayList<>();
        busca.add("Adam Sandler");
        busca.add("Steven Spielberg");
        busca.add("Leonardo DiCaprio");
        System.out.println(busca);

        Collections.sort(busca);
        System.out.println(busca + "\n");

        System.out.println(listaAssistidos);
        Collections.sort(listaAssistidos);
        System.out.println(listaAssistidos);
    }
}
