package br.com.alura.desafioJava2.main;
import br.com.alura.desafioJava2.models.MinhasPreferidas;
import br.com.alura.desafioJava2.models.Music;
import br.com.alura.desafioJava2.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music minhaMusica = new Music();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");


        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcos Mendes");


        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}