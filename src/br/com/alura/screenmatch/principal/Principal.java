package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1978);
        meuFilme.setAnoDeLancamento(1978);
        meuFilme.setDuracaoEmMinutos(188);
        meuFilme.setIncluidoNoPlano(true);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(4);
        meuFilme.avalia(5);
        meuFilme.avalia(7);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegaMedia());

        Serie serie = new Serie("Lost", 2000);
        serie.exibeFichaTecnica();
        serie.setTemporada(10);
        serie.setEpisodioPorTemporadas(10);
        serie.setMinutosPorEpisodios(500);
        System.out.println("Duração da serie: " + serie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println("Duração do filme: " + calculadora.getTempoTotal());

        calculadora.inclui(outroFilme);
        System.out.println("Duração do filme: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio ep = new Episodio();
        ep.setNumero(1);
        ep.setSerie(serie);
        ep.setTotalVisualizacoes(300);
        filtro.filtra(ep);

        Filme filmeDoLucas = new Filme("Dogville", 2003);
        filmeDoLucas.setDuracaoEmMinutos(200);
        filmeDoLucas.setAnoDeLancamento(2003);
        filmeDoLucas.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoLucas);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());

    }
}