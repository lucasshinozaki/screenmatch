package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    public void filtra(Classicavel classicavel){
        if (classicavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos no momento");
        } else if (classicavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
