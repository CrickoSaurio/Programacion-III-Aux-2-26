/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio;

/**
 *
 * @author Cristhian
 */
public class Medicamento {
    private int cod, anioV, anioF;
    private String nombre, mesV, meF, tipo;
    private boolean necesitaReceta;
    private float precio;

    public Medicamento(int cod, int anioV, int anioF, String nombre, String mesV, String meF, String tipo, boolean necesitaReceta, float precio) {
        this.cod = cod;
        this.anioV = anioV;
        this.anioF = anioF;
        this.nombre = nombre;
        this.mesV = mesV;
        this.meF = meF;
        this.tipo = tipo;
        this.necesitaReceta = necesitaReceta;
        this.precio = precio;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getAnioV() {
        return anioV;
    }

    public void setAnioV(int anioV) {
        this.anioV = anioV;
    }

    public int getAnioF() {
        return anioF;
    }

    public void setAnioF(int anioF) {
        this.anioF = anioF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMesV() {
        return mesV;
    }

    public void setMesV(String mesV) {
        this.mesV = mesV;
    }

    public String getMeF() {
        return meF;
    }

    public void setMeF(String meF) {
        this.meF = meF;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isNecesitaReceta() {
        return necesitaReceta;
    }

    public void setNecesitaReceta(boolean necesitaReceta) {
        this.necesitaReceta = necesitaReceta;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    public void mostrar(){
        System.out.println("MEDICAMENTO: "+nombre+" "+cod+" "+precio+" BS.");
        System.out.println("\t VENCE: "+mesV+" "+ anioV);
        System.out.println("\t FABRICADO: "+meF+" "+ anioF);
    }
}
