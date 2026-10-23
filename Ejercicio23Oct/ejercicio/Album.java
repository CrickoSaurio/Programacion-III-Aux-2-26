/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author Cristhian
 */
public class Album {
    private int idAlbum;
    private String nombre, artista, tipo;
    private int anio;

    public Album(int idAlbum, String nombre, String artista, String tipo, int anio) {
        this.idAlbum = idAlbum;
        this.nombre = nombre;
        this.artista = artista;
        this.tipo = tipo;
        this.anio = anio;
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

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public void mostrar(){
        System.out.println(nombre+" de "+ artista+ " (" +tipo + "), "+anio);
    }
}
