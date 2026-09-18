/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio;

/**
 *
 * @author Cristhian
 */
public class CSimpleN {
    private int MAX = 50;
    private int v[];
    private int ini, fin;

    public CSimpleN(){
        v = new int[MAX];
        ini = fin = -1;
    }

    public int nroElem() {
        if(ini == -1 && fin == -1){
            return 0;
        }
        else{
            return fin - ini + 1;
        }
    }

    public boolean esVacia(){
        return ini == -1 && fin == -1;
    }

    public boolean esLlena(){
        return fin == MAX;
    }

    public void adi(int u){
        if(esLlena()){
            System.out.println("Cola llena");
        }
        else{
            fin++;
            v[fin] = u;
        }
    }

    public int eli(){
        int u = -1;
        if(esVacia()){
            System.out.println("Cola vacia");
        }
        else{
            ini++;
            u = v[ini];
            if(ini == fin){
                ini = fin = -1;
            }
        }
        return u;
    }

    public void vaciar(CSimpleN otra){
        while(!otra.esVacia()){
            this.adi(otra.eli());
        }
    }

    public void mostrar(){
        CSimpleN aux = new CSimpleN();
        while (!this.esVacia()) {
            int u = this.eli();
            System.out.println("\t"+u);
            aux.adi(u);
        }
        this.vaciar(aux);
    }
}
