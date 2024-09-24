import java.util.Scanner;
import com.alura.desafioaudio.Estructura.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    int menu=0, opcion=0;
    Scanner lectura = new Scanner(System.in);

    while(menu==0){
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("-------------------------APLICACION DE MUSICA-------------------------\n\n");
        System.out.println("1- Cargar cancion");
        System.out.println("2- Cargar podcast");
        System.out.println("3- reproducir AUDIO");
        System.out.println("9- cerrar aplicacion");
        System.out.println("-> ");
        opcion = lectura.nextInt();
        switch (opcion){

            case 1 :
                System.out.println("-------------------------CARGA DE MUSICA-------------------------\n\n");
                Canciones cancion1 = new Canciones();
                cancion1.setTitulo("Luna Cautiva");
                cancion1.setAlbum("Album: la rosamonte");
                cancion1.setGeneroMusical("Folclore");
                cancion1.setMeGusta();
                cancion1.setDuracionEnMinutos(7);
                cancion1.setTipoDeAudio("Música");
                System.out.println(cancion1.toString());
            break;

            case 2 :
                System.out.println("-------------------------CARGA DE PODCAST-------------------------\n\n");
                Podcast podcast1 = new Podcast();
                podcast1.setTitulo("El antipodcast");
                podcast1.setTematica("Temática: Terror");
                podcast1.setTemporada(1);
                podcast1.setCapitulo(2);
                podcast1.setMeGusta();
                podcast1.setDuracionEnMinutos(7);
                podcast1.setTipoDeAudio("Música");




            break;

            case 3:


            break;


            case 9 :
                System.out.println("-------------------------FIN DE APLICACION-------------------------\n\n");
                menu=1;
            break;
        }
    }







    }
}