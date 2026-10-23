/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author Cristhian
 */
public class NodoA {
    private Album dato;
    private NodoA sig;
    
    public NodoA(Album dato){
        this.dato = dato;
        sig = null;
    }

    public Album getDato() {
        return dato;
    }

    public void setDato(Album dato) {
        this.dato = dato;
    }

    public NodoA getSig() {
        return sig;
    }

    public void setSig(NodoA sig) {
        this.sig = sig;
    }
    
}
