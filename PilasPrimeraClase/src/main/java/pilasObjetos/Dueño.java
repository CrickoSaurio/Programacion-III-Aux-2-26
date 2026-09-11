/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasObjetos;

/**
 *
 * @author Cristhian
 */
public class Dueño {
    private String nombreCompleto;
    private int carnetIdentidad;

    public Dueño(String nombreCompleto, int carnetIdentidad) {
        this.nombreCompleto = nombreCompleto;
        this.carnetIdentidad = carnetIdentidad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getCarnetIdentidad() {
        return carnetIdentidad;
    }

    public void setCarnetIdentidad(int carnetIdentidad) {
        this.carnetIdentidad = carnetIdentidad;
    }

    public void mostrar(){
        System.out.println("Dueño: "+nombreCompleto+" "+carnetIdentidad);
    }
    
}