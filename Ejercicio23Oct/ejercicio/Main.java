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

        canciones.adiFinal(new Cancion(3, "Give Life Back to Music", null, 5));
        canciones.adiFinal(new Cancion(1, "Moscow Mule", null, 4));
        canciones.adiFinal(new Cancion(9, "N95", null, 3));
        canciones.adiFinal(new Cancion(2, "Call Out My Name", null, 4));
        canciones.adiFinal(new Cancion(4, "HUMBLE.", null, 3));
        canciones.adiFinal(new Cancion(6, "Bad", null, 4));
        canciones.adiFinal(new Cancion(10, "Bohemian Rhapsody", null, 6));
        canciones.adiFinal(new Cancion(7, "DATA", "Mora", 3));
        canciones.adiFinal(new Cancion(5, "After Hours", null, 6));
        canciones.adiFinal(new Cancion(8, "COPYCAT", null, 3));
        canciones.adiFinal(new Cancion(11, "Royals", null, 3));
        canciones.adiFinal(new Cancion(12, "Thriller", null, 6));
        canciones.adiFinal(new Cancion(13, "Out of Time", null, 4));

        canciones.adiFinal(new Cancion(1, "Tití Me Preguntó", null, 4));
        canciones.adiFinal(new Cancion(3, "Instant Crush", "Julian Casablancas", 6));
        canciones.adiFinal(new Cancion(6, "Smooth Criminal", null, 4));
        canciones.adiFinal(new Cancion(9, "United in Grief", null, 4));
        canciones.adiFinal(new Cancion(2, "Try Me", null, 4));
        canciones.adiFinal(new Cancion(10, "You're My Best Friend", null, 3));
        canciones.adiFinal(new Cancion(4, "DNA.", null, 3));
        canciones.adiFinal(new Cancion(7, "Lo Siento BB:/", "Bad Bunny y Julieta Venegas", 3));
        canciones.adiFinal(new Cancion(12, "Billie Jean", null, 5));
        canciones.adiFinal(new Cancion(5, "Privilege", null, 3));
        canciones.adiFinal(new Cancion(8, "idontwannabeyouanymore", null, 3));
        canciones.adiFinal(new Cancion(13, "Sacrifice", null, 3));
        canciones.adiFinal(new Cancion(11, "Bravado", null, 4));

        canciones.adiFinal(new Cancion(4, "LOYALTY.", "Rihanna", 4));
        canciones.adiFinal(new Cancion(1, "Ojitos Lindos", "Bomba Estéreo", 4));
        canciones.adiFinal(new Cancion(3, "Lose Yourself to Dance", "Pharrell Williams", 6));
        canciones.adiFinal(new Cancion(10, "Love of My Life", null, 4));
        canciones.adiFinal(new Cancion(2, "Wasted Times", null, 4));
        canciones.adiFinal(new Cancion(7, "Colmillo", "Jowell & Randy y J Balvin", 4));
        canciones.adiFinal(new Cancion(9, "Father Time", "Sampha", 4));
        canciones.adiFinal(new Cancion(6, "The Way You Make Me Feel", null, 5));
        canciones.adiFinal(new Cancion(12, "Beat It", null, 4));
        canciones.adiFinal(new Cancion(8, "ocean eyes", null, 3));
        canciones.adiFinal(new Cancion(13, "Less Than Zero", null, 4));
        canciones.adiFinal(new Cancion(5, "Die for You", null, 4));
        canciones.adiFinal(new Cancion(11, "The Love Club", null, 3));

        canciones.adiFinal(new Cancion(1, "Me Porto Bonito", "Chencho Corleone", 3));
        canciones.adiFinal(new Cancion(3, "Get Lucky", "Pharrell Williams y Nile Rodgers", 6));
        canciones.adiFinal(new Cancion(4, "FEAR.", null, 8));
        canciones.adiFinal(new Cancion(9, "Count Me Out", null, 5));
        canciones.adiFinal(new Cancion(6, "Man in the Mirror", null, 5));
        canciones.adiFinal(new Cancion(2, "I Was Never There", "Gesaffelstein", 4));
        canciones.adiFinal(new Cancion(10, "We Will Rock You", null, 2));
        canciones.adiFinal(new Cancion(7, "Cocoloco", "Jowell & Randy", 3));
        canciones.adiFinal(new Cancion(12, "Human Nature", null, 4));
        canciones.adiFinal(new Cancion(8, "Bellyache", null, 3));
        canciones.adiFinal(new Cancion(13, "Is There Someone Else?", null, 3));
        canciones.adiFinal(new Cancion(5, "Mother I Sober", "Beth Gibbons", 7));
        canciones.adiFinal(new Cancion(11, "Million Dollar Bills", null, 2));

        canciones.adiFinal(new Cancion(3, "Contact", null, 6));
        canciones.adiFinal(new Cancion(1, "Efecto", null, 4));
        canciones.adiFinal(new Cancion(9, "Rich Spirit", null, 3));
        canciones.adiFinal(new Cancion(6, "Another Part of Me", null, 4));
        canciones.adiFinal(new Cancion(4, "ELEMENT.", null, 3));
        canciones.adiFinal(new Cancion(7, "Fantasma", "Jhayco", 3));
        canciones.adiFinal(new Cancion(2, "Hurt You", "Gesaffelstein", 4));
        canciones.adiFinal(new Cancion(10, "Killer Queen", null, 3));
        canciones.adiFinal(new Cancion(12, "P.Y.T. (Pretty Young Thing)", null, 4));
        canciones.adiFinal(new Cancion(8, "my boy", null, 3));
        canciones.adiFinal(new Cancion(13, "Gasoline", null, 4));
        canciones.adiFinal(new Cancion(5, "We Cry Together", "Taylour Paige", 6));
        canciones.adiFinal(new Cancion(11, "A World Alone", null, 5));

    }
}
