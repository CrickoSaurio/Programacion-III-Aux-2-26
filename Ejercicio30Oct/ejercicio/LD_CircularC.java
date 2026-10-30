/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author Cristhian
 */
public class LD_CircularC extends ListaDobleC {

    public LD_CircularC() {
        super();
    }

    public boolean esVacia() {
        if (this.p == null) {
            return true;
        }
        return false;
    }

    public int nroNodos() {
        int c = 0;
        NodoC R = p;
        if (!esVacia()) {
            while (R.getSig() != p) {
                c++;
                R = R.getSig();
            }
            c++;
        }
        return c;
    }

    public void adiPrincipio(Cancion c) {
        NodoC nuevo = new NodoC(c);
        if (esVacia()) {
            p = nuevo;
            p.setSig(p);
            p.setAnt(p);
        } else {
            NodoC R = p.getAnt();
            R.setSig(nuevo);
            nuevo.setSig(p);
            p.setAnt(nuevo);
            p = nuevo;
            p.setAnt(R);
        }
    }

    public void adiFinal(Cancion c) {
        NodoC nuevo = new NodoC(c);
        if (esVacia()) {
            p = nuevo;
            p.setSig(p);
            p.setAnt(p);
        } else {
            NodoC R = p.getAnt();
            R.setSig(nuevo);
            nuevo.setSig(p);
            p.setAnt(nuevo);
            //p = nuevo;
            p.setAnt(R);
        }
    }

    public void mostrar() {
        NodoC R = p;
        while (R.getSig() != p) {
            
            R.getDato().mostrar();
            R = R.getSig();
        }
        R.getDato().mostrar();
    }

    public NodoC eliPrincipio() {
        NodoC x = null;
        if (!esVacia()) {
            if (nroNodos() == 1) {
                x = p;
                p = null;
            } else {
                x = p;
                NodoC R = p.getAnt();
                p = p.getSig();
                p.setAnt(R);
                R.setSig(p);
            }
            x.setSig(null);
            x.setAnt(null);
        }
        return x;
    }
}
