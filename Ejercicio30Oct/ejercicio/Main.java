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

    public static void main(String args[]) {

        LD_NormalA albumes = new LD_NormalA();
        albumes.adiFinal(new Album(1, "DAMN.", "Kendrick Lamar", "ALBUM", 2017));
        albumes.adiFinal(new Album(2, "My Dear Melancholy,", "The Weeknd", "EP", 2018));
        albumes.adiFinal(new Album(3, "ILLMATIC", "Nas", "ALBUM", 1994));
        albumes.adiFinal(new Album(4, "Un Verano Sin Ti", "Bad Bunny", "ALBUM", 2022));
        albumes.adiFinal(new Album(5, "ATP", "NSQK", "EP", 2023));
        albumes.adiFinal(new Album(6, "Random Access Memories", "Daft Punk", "ALBUM", 2013));
        albumes.adiFinal(new Album(7, "Luv(sic) Hexalogy", "Nujabes", "ALBUM", 2015));
        albumes.adiFinal(new Album(8, "Mr. Morale & The Big Steppers", "Kendrick Lamar", "ALBUM", 2022));
        albumes.adiFinal(new Album(9, "Bohemian Rhapsody", "Queen", "ALBUM", 1975));
        albumes.adiFinal(new Album(10, "After Hours", "The Weeknd", "ALBUM", 2020));
        albumes.adiFinal(new Album(11, "Nadie Sabe Lo Que Va a Pasar Mañana", "Bad Bunny", "ALBUM", 2023));
        albumes.adiFinal(new Album(12, "BAD", "Michael Jackson", "ALBUM", 1987));
        albumes.adiFinal(new Album(13, "YHLQMDLG", "Bad Bunny", "ALBUM", 2020));
        albumes.adiFinal(new Album(14, "El Último Tour del Mundo", "Bad Bunny", "ALBUM", 2020));
        albumes.adiFinal(new Album(15, "The Love Club EP", "Lorde", "EP", 2012));

        LD_CircularC canciones = new LD_CircularC();
        canciones.adiFinal(new Cancion(8, "N95", "", 3));
        canciones.adiFinal(new Cancion(3, "N.Y. State of Mind", "", 4));
        canciones.adiFinal(new Cancion(2, "Call Out My Name", "", 3));
        canciones.adiFinal(new Cancion(12, "Smooth Criminal", "", 4));
        canciones.adiFinal(new Cancion(5, "MUBI", "", 3));
        canciones.adiFinal(new Cancion(1, "DNA.", "", 3));
        canciones.adiFinal(new Cancion(6, "Instant Crush", "Julian Casablancas", 5));
        canciones.adiFinal(new Cancion(9, "Bohemian Rhapsody", "", 6));
        canciones.adiFinal(new Cancion(4, "Me Porto Bonito", "Chencho Corleone", 3));
        canciones.adiFinal(new Cancion(7, "Luv(sic) Part 3", "Shing02", 5));
        canciones.adiFinal(new Cancion(11, "MONACO", "", 4));
        canciones.adiFinal(new Cancion(10, "Blinding Lights", "", 3));
        canciones.adiFinal(new Cancion(13, "Safaera", "Jowell & Randy, Ñengo Flow", 5));
        canciones.adiFinal(new Cancion(14, "La Noche de Anoche", "Rosalía", 3));
        canciones.adiFinal(new Cancion(15, "Royals", "", 3));

        canciones.adiFinal(new Cancion(1, "FEEL.", "", 3));
        canciones.adiFinal(new Cancion(4, "Tití Me Preguntó", "", 4));
        canciones.adiFinal(new Cancion(8, "Father Time", "Sampha", 4));
        canciones.adiFinal(new Cancion(6, "Get Lucky", "Pharrell Williams, Nile Rodgers", 6));
        canciones.adiFinal(new Cancion(3, "The World Is Yours", "", 4));
        canciones.adiFinal(new Cancion(2, "Wasted Times", "", 4));
        canciones.adiFinal(new Cancion(12, "Bad", "", 4));
        canciones.adiFinal(new Cancion(9, "Love of My Life", "", 3));
        canciones.adiFinal(new Cancion(5, "Tarde o Temprano", "", 3));
        canciones.adiFinal(new Cancion(7, "Luv(sic) Part 2", "Shing02", 5));
        canciones.adiFinal(new Cancion(11, "WHERE SHE GOES", "", 3));
        canciones.adiFinal(new Cancion(10, "Save Your Tears", "", 3));
        canciones.adiFinal(new Cancion(13, "La Difícil", "", 2));
        canciones.adiFinal(new Cancion(14, "Te Mudaste", "", 3));
        canciones.adiFinal(new Cancion(15, "Tennis Court", "", 3));

        canciones.adiFinal(new Cancion(1, "ELEMENT.", "", 3));
        canciones.adiFinal(new Cancion(3, "Represent", "", 4));
        canciones.adiFinal(new Cancion(8, "United in Grief", "", 4));
        canciones.adiFinal(new Cancion(6, "Lose Yourself to Dance", "Pharrell Williams", 5));
        canciones.adiFinal(new Cancion(4, "Ojitos Lindos", "Bomba Estéreo", 4));
        canciones.adiFinal(new Cancion(12, "The Way You Make Me Feel", "", 4));
        canciones.adiFinal(new Cancion(2, "I Was Never There", "Gesaffelstein", 4));
        canciones.adiFinal(new Cancion(9, "You're My Best Friend", "", 3));
        canciones.adiFinal(new Cancion(5, "MUBI (Remix)", "", 3));
        canciones.adiFinal(new Cancion(7, "Luv(sic) Part 1", "Shing02", 4));
        canciones.adiFinal(new Cancion(11, "FINA", "Young Miko", 3));
        canciones.adiFinal(new Cancion(10, "Heartless", "", 3));
        canciones.adiFinal(new Cancion(13, "Yo Perreo Sola", "", 3));
        canciones.adiFinal(new Cancion(14, "Booker T", "", 2));
        canciones.adiFinal(new Cancion(15, "Bravado", "", 4));

        canciones.adiFinal(new Cancion(1, "LOVE.", "Zacari", 3));
        canciones.adiFinal(new Cancion(4, "Moscow Mule", "", 4));
        canciones.adiFinal(new Cancion(8, "Die Hard", "Blxst, Amanda Reifer", 4));
        canciones.adiFinal(new Cancion(6, "Touch", "Paul Williams", 8));
        canciones.adiFinal(new Cancion(3, "It Ain't Hard to Tell", "", 3));
        canciones.adiFinal(new Cancion(12, "Man in the Mirror", "", 5));
        canciones.adiFinal(new Cancion(2, "Try Me", "", 3));
        canciones.adiFinal(new Cancion(9, "Somebody to Love", "", 5));
        canciones.adiFinal(new Cancion(5, "Nieve", "", 3));
        canciones.adiFinal(new Cancion(7, "Luv(sic) Part 4", "Shing02", 4));
        canciones.adiFinal(new Cancion(11, "Hibiki", "Mora", 3));
        canciones.adiFinal(new Cancion(10, "In Your Eyes", "Kenny G", 4));
        canciones.adiFinal(new Cancion(13, "Booker T", "", 2));
        canciones.adiFinal(new Cancion(14, "DÁKITI", "Jhayco", 3));
        canciones.adiFinal(new Cancion(15, "The Love Club", "", 3));

        canciones.adiFinal(new Cancion(1, "MONEY TREES", "Jay Rock", 6));
        canciones.adiFinal(new Cancion(3, "Halftime", "", 4));
        canciones.adiFinal(new Cancion(8, "Rich Spirit", "", 3));
        canciones.adiFinal(new Cancion(6, "Giorgio by Moroder", "", 9));
        canciones.adiFinal(new Cancion(4, "Después de la Playa", "", 3));
        canciones.adiFinal(new Cancion(12, "Dirty Diana", "", 4));
        canciones.adiFinal(new Cancion(2, "Hurt You", "Gesaffelstein", 3));
        canciones.adiFinal(new Cancion(9, "Killer Queen", "", 3));
        canciones.adiFinal(new Cancion(5, "Miedo", "", 3));
        canciones.adiFinal(new Cancion(7, "Luv(sic) Part 5", "Shing02", 5));
        canciones.adiFinal(new Cancion(11, "VOU 787", "", 3));
        canciones.adiFinal(new Cancion(10, "After Hours", "", 6));
        canciones.adiFinal(new Cancion(13, "La Santa", "Daddy Yankee", 3));
        canciones.adiFinal(new Cancion(14, "Maldita Pobreza", "", 3));
        canciones.adiFinal(new Cancion(15, "Biting Down", "", 3));

        canciones.adiFinal(new Cancion(1, "HUMBLE.", "", 3));
        canciones.adiFinal(new Cancion(3, "One Love", "", 5));
        canciones.adiFinal(new Cancion(8, "Count Me Out", "", 4));
        canciones.adiFinal(new Cancion(6, "Doin' It Right", "Panda Bear", 4));
        canciones.adiFinal(new Cancion(4, "Un Ratito", "", 3));
        canciones.adiFinal(new Cancion(12, "Liberian Girl", "", 4));
        canciones.adiFinal(new Cancion(2, "Privilege", "", 2));
        canciones.adiFinal(new Cancion(9, "Don't Stop Me Now", "", 4));
        canciones.adiFinal(new Cancion(5, "Atemporal", "", 3));
        canciones.adiFinal(new Cancion(7, "Luv(sic) Part 6", "Shing02", 5));
        canciones.adiFinal(new Cancion(11, "NADIE SABE", "", 2));
        canciones.adiFinal(new Cancion(10, "Too Late", "", 4));
        canciones.adiFinal(new Cancion(13, "Pero Ya No", "", 2));
        canciones.adiFinal(new Cancion(14, "Trellas", "", 3));
        canciones.adiFinal(new Cancion(15, "Million Dollar Bills", "", 3));
    }
}
