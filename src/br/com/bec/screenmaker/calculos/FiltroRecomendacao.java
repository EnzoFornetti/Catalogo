package br.com.bec.screenmaker.calculos;

public class FiltroRecomendacao {

    public void filtrar(Classificavel c){
        if(c.getClassificacao() >= 4){
            System.out.println(c.getNome() + " eh um dos preferidos");
        } else if (c.getClassificacao() >= 2) {
            System.out.println(c.getNome() + " eh uma boa opcao");
        } else {
            System.out.println(c.getNome() + " eh horrivel, nao assista");
        }
    }
}
