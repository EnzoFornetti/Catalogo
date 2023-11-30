package br.com.bec.screenmaker.calculos;

import br.com.bec.screenmaker.modelos.Titulo;

public class CalculadoraDeTempo {

    private int totalDeTempo = 0;

    public void adicionarTitulo(Titulo t){
        totalDeTempo += t.getDuracaoEmMinutos();
    }

    public int getTotalDeTempo() {
        return totalDeTempo;
    }
}
