/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio;

/**
 *
 * @author Cristhian
 */
public class PilaF {
    private int MAX = 50;
    private int top;
    private Factura v[];
    
    public PilaF() {
        v = new Factura[MAX];
        top = -1;
    }

    public boolean esVacia(){
        return top == -1;
    }

    public boolean esLlena(){
        return top == MAX -1;
    }

    public void adi(Factura u){
        if(esLlena()){
            System.out.println("La pila está llena");
        } else {
            top++;
            v[top] = u;
        }
    }

    public Factura eli(){
        Factura u = null;
        if(esVacia()){
            System.out.println("La pila está vacía");
        } else {
            u = v[top];
            top--;
        }
        return u;
    }

    public void vaciar(PilaF otra){
        while(! otra.esVacia()){
            this.adi(otra.eli());
        }
    }
    
    public void mostrar(){
        PilaF aux = new PilaF();
        while(!this.esVacia()){
            Factura u = this.eli();
            u.mostrar();
            aux.adi(u);
        }
        this.vaciar(aux);
    }
}
