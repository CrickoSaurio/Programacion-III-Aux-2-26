/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author Cristhian
 */
public class Main {

    public static void main(String[] args) {

        LS_NormalA albumes = new LS_NormalA();

        albumes.adiFinal(new Album(1, "Un Verano Sin Ti", "Bad Bunny", "ALBUM", 2022));
        albumes.adiFinal(new Album(2, "My Dear Melancholy,", "The Weeknd", "EP", 2018));
        albumes.adiFinal(new Album(3, "Random Access Memories", "Daft Punk", "ALBUM", 2013));
        albumes.adiFinal(new Album(4, "DAMN.", "Kendrick Lamar", "ALBUM", 2017));
        albumes.adiFinal(new Album(5, "ATP)", "NSQK", "EP", 2017));
        albumes.adiFinal(new Album(6, "Bad", "Michael Jackson", "ALBUM", 1987));
        albumes.adiFinal(new Album(7, "DATA", "Tainy", "ALBUM", 2023));
        albumes.adiFinal(new Album(8, "Don't Smile at Me", "Billie Eilish", "EP", 2017));
        albumes.adiFinal(new Album(9, "Mr. Morale & The Big Steppers", "Kendrick Lamar", "ALBUM", 2022));
        albumes.adiFinal(new Album(10, "Bohemian Rhapsody", "Queen", "ALBUM", 1975));
        albumes.adiFinal(new Album(11, "The Love Club", "Lorde", "EP", 2012));
        albumes.adiFinal(new Album(12, "Thriller", "Michael Jackson", "ALBUM", 1982));
        albumes.adiFinal(new Album(13, "Dawn FM", "The Weeknd", "ALBUM", 2022));

        LS_CircularC canciones = new LS_CircularC();

        canciones.adiFinal(new Cancion(3, "Give Life Back to Music", "", 5));
        canciones.adiFinal(new Cancion(1, "Moscow Mule", "", 4));
        canciones.adiFinal(new Cancion(9, "N95", "", 3));
        canciones.adiFinal(new Cancion(2, "Call Out My Name", "", 4));
        canciones.adiFinal(new Cancion(4, "HUMBLE.", "", 3));
        canciones.adiFinal(new Cancion(6, "Bad", "", 4));
        canciones.adiFinal(new Cancion(10, "Bohemian Rhapsody", "", 6));
        canciones.adiFinal(new Cancion(7, "DATA", "Mora", 3));
        canciones.adiFinal(new Cancion(5, "After Hours", "", 6));
        canciones.adiFinal(new Cancion(8, "COPYCAT", "", 3));
        canciones.adiFinal(new Cancion(11, "Royals", "", 3));
        canciones.adiFinal(new Cancion(12, "Thriller", "", 6));
        canciones.adiFinal(new Cancion(13, "Out of Time", "", 4));

        canciones.adiFinal(new Cancion(1, "Tití Me Preguntó", "", 4));
        canciones.adiFinal(new Cancion(3, "Instant Crush", "Julian Casablancas", 6));
        canciones.adiFinal(new Cancion(6, "Smooth Criminal", "", 4));
        canciones.adiFinal(new Cancion(9, "United in Grief", "", 4));
        canciones.adiFinal(new Cancion(2, "Try Me", "", 4));
        canciones.adiFinal(new Cancion(10, "You're My Best Friend", "", 3));
        canciones.adiFinal(new Cancion(4, "DNA.", "", 3));
        canciones.adiFinal(new Cancion(7, "Lo Siento BB:/", "Bad Bunny y Julieta Venegas", 3));
        canciones.adiFinal(new Cancion(12, "Billie Jean", "", 5));
        canciones.adiFinal(new Cancion(5, "Privilege", "", 3));
        canciones.adiFinal(new Cancion(8, "idontwannabeyouanymore", "", 3));
        canciones.adiFinal(new Cancion(13, "Sacrifice", "", 3));
        canciones.adiFinal(new Cancion(11, "Bravado", "", 4));

        canciones.adiFinal(new Cancion(4, "LOYALTY.", "Rihanna", 4));
        canciones.adiFinal(new Cancion(1, "Ojitos Lindos", "Bomba Estéreo", 4));
        canciones.adiFinal(new Cancion(3, "Lose Yourself to Dance", "Pharrell Williams", 6));
        canciones.adiFinal(new Cancion(10, "Love of My Life", "", 4));
        canciones.adiFinal(new Cancion(2, "Wasted Times", "", 4));
        canciones.adiFinal(new Cancion(7, "Colmillo", "Jowell & Randy y J Balvin", 4));
        canciones.adiFinal(new Cancion(9, "Father Time", "Sampha", 4));
        canciones.adiFinal(new Cancion(6, "The Way You Make Me Feel", "", 5));
        canciones.adiFinal(new Cancion(12, "Beat It", "", 4));
        canciones.adiFinal(new Cancion(8, "ocean eyes", "", 3));
        canciones.adiFinal(new Cancion(13, "Less Than Zero", "", 4));
        canciones.adiFinal(new Cancion(5, "Die for You", "", 4));
        canciones.adiFinal(new Cancion(11, "The Love Club", "", 3));

        canciones.adiFinal(new Cancion(1, "Me Porto Bonito", "Chencho Corleone", 3));
        canciones.adiFinal(new Cancion(3, "Get Lucky", "Pharrell Williams y Nile Rodgers", 6));
        canciones.adiFinal(new Cancion(4, "FEAR.", "", 8));
        canciones.adiFinal(new Cancion(9, "Count Me Out", "", 5));
        canciones.adiFinal(new Cancion(6, "Man in the Mirror", "", 5));
        canciones.adiFinal(new Cancion(2, "I Was Never There", "Gesaffelstein", 4));
        canciones.adiFinal(new Cancion(10, "We Will Rock You", "", 2));
        canciones.adiFinal(new Cancion(7, "Cocoloco", "Jowell & Randy", 3));
        canciones.adiFinal(new Cancion(12, "Human Nature", "", 4));
        canciones.adiFinal(new Cancion(8, "Bellyache", "", 3));
        canciones.adiFinal(new Cancion(13, "Is There Someone Else?", "", 3));
        canciones.adiFinal(new Cancion(5, "Mother I Sober", "Beth Gibbons", 7));
        canciones.adiFinal(new Cancion(11, "Million Dollar Bills", "", 2));

        canciones.adiFinal(new Cancion(3, "Contact", "", 6));
        canciones.adiFinal(new Cancion(1, "Efecto", "", 4));
        canciones.adiFinal(new Cancion(9, "Rich Spirit", "", 3));
        canciones.adiFinal(new Cancion(6, "Another Part of Me", "", 4));
        canciones.adiFinal(new Cancion(4, "ELEMENT.", "", 3));
        canciones.adiFinal(new Cancion(7, "Fantasma", "Jhayco", 3));
        canciones.adiFinal(new Cancion(2, "Hurt You", "Gesaffelstein", 4));
        canciones.adiFinal(new Cancion(10, "Killer Queen", "", 3));
        canciones.adiFinal(new Cancion(12, "P.Y.T. (Pretty Young Thing)", "", 4));
        canciones.adiFinal(new Cancion(8, "my boy", "", 3));
        canciones.adiFinal(new Cancion(13, "Gasoline", "", 4));
        canciones.adiFinal(new Cancion(5, "We Cry Together", "Taylour Paige", 6));
        canciones.adiFinal(new Cancion(11, "A World Alone", "", 5));


        //a) mostrar las canciones del album con nombre X
        mostrarCancionesAlbumX("DAMN.", albumes, canciones);

        System.out.println("\n\t\t------------------");
        mostrarAlbumesArtistaX("Kendrick Lamar", albumes);
        System.out.println("\n\t\t------------------");
        mostrarCancionesConArtistaInvitado(canciones);

        // muestra las canciones que tienen artista(s) invitados 
        // b) mostrar el numero de canciones por artista X
        System.out.println("\n\t\t------------------");
        mostrarTotalCancionesArtistaX("Michael Jackson", albumes, canciones);
        
        // c) verificar si el artista X tiene almenos X canciones
        
        // d) mostrar cuantos minutos dura cada album 
        
        // e) mostrar el nombre del album y las canciones de todos los albumes de tipo EP
    
    }

        public static void mostrarCancionesAlbumX(String nombre, LS_NormalA albumes, LS_CircularC canciones) {
        NodoA r = albumes.p;

        while (r != null) {
            if (r.getDato().getNombre().equals(nombre)) {

                NodoC w = canciones.p;

                while (w.getSig() != canciones.p) {
                    if (w.getDato().getIdAlbum() == r.getDato().getIdAlbum()) {
                        w.getDato().mostrar();
                    }

                    w = w.getSig();
                }
                if (w.getDato().getIdAlbum() == r.getDato().getIdAlbum()) {
                    w.getDato().mostrar();
                }
            }
            r=r.getSig();
        }
    }

    
    public static void mostrarAlbumesArtistaX(String artista, LS_NormalA albumes) {
        NodoA r = albumes.p;
        while (r != null) {
            if (r.getDato().getArtista().equals(artista)) {
                System.out.println(r.getDato().getNombre());
            }
            r = r.getSig();
        }
    }

    public static void mostrarCancionesConArtistaInvitado(LS_CircularC canciones) {
        NodoC r = canciones.p;
        while (r.getSig() != canciones.p) {
            if (!r.getDato().getArtistaInvitado().equals("")) {
                System.out.println(r.getDato().getNombre() + " - " + r.getDato().getArtistaInvitado());
            }
            r = r.getSig();
        }

        if (!r.getDato().getArtistaInvitado().equals("")) {
            System.out.println(r.getDato().getNombre() + " - " + r.getDato().getArtistaInvitado());
        }
    }

    public static void mostrarTotalCancionesArtistaX(String artista, LS_NormalA albumes, LS_CircularC canciones) {
        int c = 0;

        NodoA r = albumes.p;
        while (r != null) {
            if (r.getDato().getArtista().equals(artista)) {
                NodoC w = canciones.p;
                while (w.getSig() != canciones.p) {
                    if (w.getDato().getIdAlbum() == r.getDato().getIdAlbum()) {
                        c++;
                    }
                    w = w.getSig();
                }
                if (w.getDato().getIdAlbum() == r.getDato().getIdAlbum()) {
                    c++;
                }

            }
            
             r = r.getSig();
        }
        
        System.out.println("El artista "+artista+" tiene "+ c);
    }
}
