/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author Cristhian
 */
public class Cancion {
    private int idAlbum;
    private String nombre, artistaInvitado;
    private int duracionMinutos;

    public Cancion(int idAlbum, String nombre, String artistaInvitado, int duracionMinutos) {
        this.idAlbum = idAlbum;
        this.nombre = nombre;
        this.artistaInvitado = artistaInvitado;
        this.duracionMinutos = duracionMinutos;
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtistaInvitado() {
        return artistaInvitado;
    }

    public void setArtistaInvitado(String artistaInvitado) {
        this.artistaInvitado = artistaInvitado;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public void mostrar(){
        System.out.println("CANCION: "+nombre+" "+ (artistaInvitado.equals("")?"":artistaInvitado)+" - "+duracionMinutos);
    }
}
