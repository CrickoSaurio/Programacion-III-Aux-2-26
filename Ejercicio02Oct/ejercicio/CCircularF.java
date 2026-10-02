/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio;

/**
 *
 * @author Cristhian
 */
public class CCircularF {
    private int MAX = 50;
    private int ini, fin;
    private Mp_CSimpleD v[];


    public CCircularF(){
        ini = fin = 0;
        v = new Mp_CSimpleD[MAX];
    }

    public int nroElem(){
        return (fin - ini + MAX) % MAX;
    }

    public boolean esVacia(){
        return nroElem() == 0;
    }

    public boolean esLlena(){ 
        return nroElem() == MAX -1;
    }

    public void adi(Mp_CSimpleD r){
        if(esLlena()){
            System.out.println("La cola está llena");
        } else {
            fin = (fin + 1) % MAX;
            v[fin] = r;
        }
    }

    public Mp_CSimpleD eli(){
        Mp_CSimpleD elem = null;
        if(esVacia()){
            System.out.println("La cola está vacía");
        } else {
            ini = (ini + 1) % MAX;
            elem = v[ini];
        }
        return elem;
    }

    public void vaciar(CCircularF otro){
        while(! otro.esVacia()){
            adi(otro.eli());
        }
    }

    public void mostrar(){
        CCircularF aux = new CCircularF();
        while(! esVacia()){
            Mp_CSimpleD elem = eli();
            elem.mostrar();
            aux.adi(elem);
        }
        vaciar(aux);
    }
}
