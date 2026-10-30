/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author Cristhian
 */
public class LD_NormalA extends ListaDobleA{

    public LD_NormalA() {
        super();
    }

    boolean esVacia() {
        return this.p == null;
    }

    public int nroNodos() {
        int c = 0;
        NodoA R = this.p;
        while (R != null) {
            c++;
            R = R.getSig();
        }
        return c;
    }

    public void adiPrimero(Album z) {
        NodoA nuevo = new NodoA(z);
        if (esVacia()) {
            p = nuevo;
        } else {
            nuevo.setSig(p);
            p.setAnt(nuevo);
            p = nuevo;
        }
    }

    public void mostrar() {
        NodoA R = p;
        while (R != null) {
            R.getDato().mostrar();
            R = R.getSig();
        }
    }

    public void adiFinal(Album z) {
        NodoA nuevo = new NodoA(z);
        if (esVacia()) {
            p = nuevo;
        } else {
            NodoA R = p;
            while (R.getSig() != null) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setAnt(R);
        }
    }
}
