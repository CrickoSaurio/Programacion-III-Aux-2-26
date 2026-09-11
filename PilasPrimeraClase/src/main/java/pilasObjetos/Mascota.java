/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasObjetos;

/**
 *
 * @author Cristhian
 */
public class Mascota {
    private int carnetIdentidadDueño;
    private String nombre, tipo;
    private int edad;

    public Mascota(int carnetIdentidadDueño, String nombre, String tipo, int edad) {
        this.carnetIdentidadDueño = carnetIdentidadDueño;
        this.tipo = tipo;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getCarnetIdentidadDueño() {
        return carnetIdentidadDueño;
    }

    public void setCarnetIdentidadDueño(int carnetIdentidadDueño) {
        this.carnetIdentidadDueño = carnetIdentidadDueño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public void mostrar(){
        System.out.println("Mascota: "+nombre+" "+edad+" "+tipo+" - Dueño: "+carnetIdentidadDueño);
    }
}
