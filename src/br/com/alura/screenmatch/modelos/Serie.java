package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporada;
    private boolean ativa;
    private int episodioPorTemporadas;
    private int minutosPorEpisodios;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporada * minutosPorEpisodios;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodioPorTemporadas() {
        return episodioPorTemporadas;
    }

    public void setEpisodioPorTemporadas(int episodioPorTemporadas) {
        this.episodioPorTemporadas = episodioPorTemporadas;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
