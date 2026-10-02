/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio;

/**
 *
 * @author Cristhian
 */
public class Mp_CSimpleD {

    private int n;
    private CSimpleD c[] = new CSimpleD[n];

    public Mp_CSimpleD(int n) {
        this.n = n;
        for (int i = 0; i < n; i++) {
            c[i] = new CSimpleD();
        }
    }

    public int nroElem(int i) {
        return c[i].nroElem();
    }

    public boolean esVacia(int i) {
        return c[i].esVacia();
    }

    public boolean esLlena(int i) {
        return c[i].esLlena();
    }

    public void adicionar(int i, Danzarin est) {
        c[i].adi(est);
    }

    public Danzarin eliminar(int i) {
        return c[i].eli();
    }
    
    public void mostrar() {
        System.out.println("\nDatos de la multipila");
        for (int i = 0; i < this.n; i++) {
            c[i].mostrar();
        }
    }

    public void mostrar(int i) {
        c[i].mostrar();
    }

    public void vaciar(int i, CSimpleD z) {
        c[i].vaciar(z);
    }

    public void vaciar(int i, int j) {
        c[i].vaciar(c[j]);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
