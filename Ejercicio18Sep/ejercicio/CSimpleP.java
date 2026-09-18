/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio;

/**
 *
 * @author Cristhian
 */
public class CSimpleP {
    private int MAX = 50;
    private Paciente v[];
    private int ini, fin;

    public CSimpleP(){
        v = new Paciente[MAX];
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

    public void adi(Paciente u){
        if(esLlena()){
            System.out.println("Cola llena");
        }
        else{
            fin++;
            v[fin] = u;
        }
    }

    public Paciente eli(){
        Paciente u = null;
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

    public void vaciar(CSimpleP otra){
        while(!otra.esVacia()){
            this.adi(otra.eli());
        }
    }

    public void mostrar(){
        CSimpleP aux = new CSimpleP();
        while (!this.esVacia()) {
            Paciente u = this.eli();
            u.mostrar();
            aux.adi(u);
        }
        this.vaciar(aux);
    }
}
