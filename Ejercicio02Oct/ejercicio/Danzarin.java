/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio;

/**
 *
 * @author Cristhian
 */
public class Danzarin {
    private String danza, rol, carrera;

    public Danzarin(String danza, String rol, String carrera) {
        this.danza = danza;
        this.rol = rol;
        this.carrera = carrera;
    }

    public String getDanza() {
        return danza;
    }

    public void setDanza(String danza) {
        this.danza = danza;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public void mostrar(){
        System.out.println("DANZARIN: "+danza+" "+carrera+" "+rol);
    }
}
