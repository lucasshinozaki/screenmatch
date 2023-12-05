package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme f1 = new Filme("O poderos chefão", 1978);
        Filme f2 = new Filme("Avatar", 2023);
        Filme f3 = new Filme("Dogville", 2003);
        Serie s1 = new Serie("Lost", 2000);
        f1.avalia(4);
        f2.avalia(5);
        f3.avalia(8);

        List<Titulo> lista = new LinkedList<>();
        lista.add(f1);
        lista.add(f2);
        lista.add(f3);
        lista.add(s1);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("A artista 1");
        buscaPorArtista.add("D artista 2");
        buscaPorArtista.add("C artista 3");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: " + buscaPorArtista);
        System.out.println("Lista de titulos ordenados ");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenar por ano ");
        System.out.println(lista);
    }
}
