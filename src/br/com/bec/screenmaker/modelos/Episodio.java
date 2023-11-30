package br.com.bec.screenmaker.modelos;

import br.com.bec.screenmaker.calculos.Classificavel;

public class Episodio implements Classificavel {

    private int temporada;
    private Serie serie;
    private String nome;
    private int numero;
    private int numeroDeVisualizacoes;

    @Override
    public int getClassificacao(){
        if (numeroDeVisualizacoes >= 150){
            return 4;
        } else {
            return 2;
        }
    }

    @Override
    public String getNome(){
        return nome;
    }

    public int getTemporada() {
        return temporada;
    }

    public Serie getSerie() {
        return serie;
    }

    public int getNumero() {
        return numero;
    }

    public int getNumeroDeVisualizacoes() {
        return numeroDeVisualizacoes;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNumeroDeVisualizacoes(int numeroDeVisualizacoes) {
        this.numeroDeVisualizacoes = numeroDeVisualizacoes;
    }
}
