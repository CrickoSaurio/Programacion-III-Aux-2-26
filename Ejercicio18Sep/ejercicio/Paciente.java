/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio;

/**
 *
 * @author Cristhian
 */
public class Paciente {
    private String nombres, apellidos;
    private int idFac;

    public Paciente(String nombres, String apellidos, int idFac) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.idFac = idFac;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getIdFac() {
        return idFac;
    }

    public void setIdFac(int idFac) {
        this.idFac = idFac;
    }
    
    public void mostrar(){
        System.out.println("PACIENTE: "+nombres+" "+apellidos+" FACTURA: "+idFac);
    }
}
