package br.com.bec.screenmaker.principal;

import br.com.bec.screenmaker.calculos.CalculadoraDeTempo;
import br.com.bec.screenmaker.calculos.FiltroRecomendacao;
import br.com.bec.screenmaker.modelos.Episodio;
import br.com.bec.screenmaker.modelos.Filme;
import br.com.bec.screenmaker.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Filme f1 = new Filme("Titanic", 2000);
        f1.setIncluidoNoPlano(false);
        f1.setDuracaoEmMinutos(235);
        f1.avalia(4);
        f1.avalia(2);

        Filme f2 = new Filme("Toy Story 3", 2010);
        f2.setIncluidoNoPlano(true);
        f2.setDuracaoEmMinutos(105);
        f2.avalia(7);

        Filme f3 = new Filme("Oppenheimer", 2023);
        f3.setIncluidoNoPlano(true);
        f3.setDuracaoEmMinutos(195);
        f3.avalia(10);
        f3.avalia(9.5);

        Serie s1 = new Serie("Arcane", 2021);
        s1.setTemporadas(1);
        s1.setEpisodiosPorTemporada(9);
        s1.setMinutosPorEpisodio(55);

        ArrayList<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(f1);
        listaFilmes.add(f2);
        listaFilmes.add(f3);

        System.out.println(listaFilmes);

    }
}
